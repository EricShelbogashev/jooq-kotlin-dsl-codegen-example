CREATE TYPE vehicle_status AS ENUM (
    'IN USE',
    'UNDER_REPAIR',
    'MOVED_TO_RESERVE'
    );

CREATE TYPE route_status AS ENUM (
    'IN USE',
    'DEPRECATED',
    'PLANNED',
    'UNDER CONSTRUCTION',
    'TEMPORARILY CLOSED',
    'PERMANENTLY CLOSED',
    'LIMITED SERVICE',
    'FULLY BOOKED',
    'OPEN FOR BOOKING'
    );

CREATE TYPE medical_status AS ENUM (
    'PASSED',
    'FAILED',
    'CONDITIONAL',
    'PENDING_REVIEW',
    'REQUIRES_FOLLOW_UP'
    );

CREATE TYPE vehicle_type AS ENUM (
    'LOCOMOTIVE', -- Локомотив
    'PASSENGER_CAR', -- Вагон для перевозки пассажиров
    'FREIGHT_CAR', -- Вагон для перевозки грузов
    'CABOOSE', -- Служебный вагон, обычно находящийся в конце грузового поезда
    'TANK_CAR', -- Специализированный грузовой вагон для транспортировки жидкостей
    'FLAT_CAR', -- Грузовой вагон с плоской платформой для тяжелых или негабаритных грузов
    'BOX_CAR', -- Закрытый вагон для перевозки различных грузов
    'REEFER', -- Рефрижераторный вагон для перевозки грузов, требующих охлаждения
    'GONDOLA_CAR', -- Открытый вагон для перевозки насыпных материалов
    'HOPPER_CAR' -- Открытый вагон с возможностью разгрузки через дно для насыпных грузов
    );

CREATE TYPE seat_type AS ENUM (
    'UPPER_BUNK', -- Верхняя спальная полка
    'LOWER_BUNK', -- Нижняя спальная полка
    'SEAT', -- Сидячее место
    'PLATZCART', -- Место в плацкартном вагоне (открытое спальное место)
    'COUPE', -- Место в купейном вагоне
    'LUXURY' -- Место в вагоне класса люкс
    );

CREATE TYPE transaction_type AS ENUM (
    'PURCHASE', -- Указывает на транзакцию покупки билета.
    'REFUND', -- Указывает на транзакцию возврата билета.
    'EXCHANGE', -- Указывает на транзакцию обмена билета.
    'CANCELATION' -- Указывает на транзакцию отмены билета.
    );

CREATE TABLE routes
(
    id             SERIAL PRIMARY KEY,
    route_category VARCHAR(255) NOT NULL,
    status         route_status NOT NULL
);

CREATE TABLE locations
(
    id           SERIAL PRIMARY KEY,
    country_code CHAR(2) NOT NULL
);

CREATE TABLE departments
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255) NOT NULL,
    location_id INTEGER      NOT NULL,
    FOREIGN KEY (location_id) REFERENCES locations (id)
);

CREATE TABLE employee_categories
(
    id         SERIAL PRIMARY KEY,
    title      VARCHAR(255) NOT NULL,
    attributes JSONB        NOT NULL
);

CREATE TABLE employees
(
    id             SERIAL PRIMARY KEY,
    first_name     VARCHAR(255)   NOT NULL,
    middle_name    VARCHAR(255),
    last_name      VARCHAR(255)   NOT NULL,
    birth_date     DATE           NOT NULL,
    hired_at       TIMESTAMP      NOT NULL,
    sex            CHAR(1) CHECK (sex IN ('M', 'F')),
    children_count INTEGER        NOT NULL CHECK (children_count >= 0),
    salary         DECIMAL(10, 2) NOT NULL CHECK (salary > 0),
    department_id  INTEGER        NOT NULL,
    category_id    INTEGER        NOT NULL,
    FOREIGN KEY (department_id) REFERENCES departments (id),
    FOREIGN KEY (category_id) REFERENCES employee_categories (id)
);

CREATE TABLE managers
(
    department_id INTEGER NOT NULL,
    employee_id    INTEGER NOT NULL,
    PRIMARY KEY (department_id, employee_id),
    FOREIGN KEY (employee_id) REFERENCES departments (id),
    FOREIGN KEY (employee_id) REFERENCES employees (id)
);

CREATE TABLE transfers
(
    id                 SERIAL PRIMARY KEY,
    from_department_id INTEGER  NOT NULL REFERENCES departments (id),
    to_department_id   INTEGER  NOT NULL REFERENCES departments (id),
    distance           SMALLINT NOT NULL CHECK (distance > 0)
);

CREATE TABLE routes_transfers
(
    route_id    INTEGER NOT NULL,
    transfer_id INTEGER NOT NULL,
    PRIMARY KEY (route_id, transfer_id),
    FOREIGN KEY (route_id) REFERENCES routes (id),
    FOREIGN KEY (transfer_id) REFERENCES transfers (id)
);

CREATE TABLE brigades
(
    id            SERIAL PRIMARY KEY,
    name          VARCHAR(255) NOT NULL,
    department_id INTEGER      NOT NULL,
    FOREIGN KEY (department_id) REFERENCES departments (id)
);

CREATE TABLE brigades_employees
(
    t_brigade_id  INTEGER NOT NULL,
    t_employee_id INTEGER NOT NULL,
    PRIMARY KEY (t_brigade_id, t_employee_id),
    FOREIGN KEY (t_brigade_id) REFERENCES brigades (id),
    FOREIGN KEY (t_employee_id) REFERENCES employees (id)
);

CREATE TABLE medical_examinations
(
    id          SERIAL PRIMARY KEY,
    tested_at   TIMESTAMP      NOT NULL,
    status      medical_status NOT NULL,
    comment     TEXT,
    employee_id INTEGER        NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employees (id)
);

CREATE TABLE vehicles
(
    id                     SERIAL PRIMARY KEY,
    vehicles_department_id INTEGER      NOT NULL,
    details                JSONB        NOT NULL,
    type                   vehicle_type NOT NULL,
    built_in               DATE         NOT NULL,
    FOREIGN KEY (vehicles_department_id) REFERENCES departments (id)
);

CREATE TABLE inspections
(
    id           SERIAL PRIMARY KEY,
    details      VARCHAR(255)   NOT NULL,
    inspected_at TIMESTAMP      NOT NULL,
    vehicle_id   INTEGER        NOT NULL,
    brigade_id   INTEGER        NOT NULL,
    conclusion   vehicle_status NOT NULL,
    FOREIGN KEY (vehicle_id) REFERENCES vehicles (id),
    FOREIGN KEY (brigade_id) REFERENCES brigades (id)
);

CREATE OR REPLACE VIEW ranked_inspections AS
(
SELECT inspections.*,
       ROW_NUMBER() OVER (
           PARTITION BY vehicle_id
           ORDER BY inspected_at DESC, id DESC
           ) AS rn
FROM inspections
    );

CREATE OR REPLACE VIEW vehicles_statuses AS
SELECT v.id,
       v.vehicles_department_id,
       v.built_in,
       v.details,
       v.type,
       i.id as inspection_id,
       i.conclusion,
       i.inspected_at,
       i.brigade_id,
       i.vehicle_id
FROM vehicles v
         LEFT JOIN (SELECT id,
                           details,
                           inspected_at,
                           vehicle_id,
                           brigade_id,
                           conclusion
                    FROM ranked_inspections
                    WHERE rn = 1) i ON v.id = i.vehicle_id;

CREATE TABLE brigade_vehicle
(
    brigade_id INTEGER NOT NULL,
    vehicle_id INTEGER NOT NULL,
    PRIMARY KEY (brigade_id, vehicle_id),
    FOREIGN KEY (brigade_id) REFERENCES brigades (id),
    FOREIGN KEY (vehicle_id) REFERENCES vehicles (id)
);

CREATE TABLE schedule
(
    id            SERIAL PRIMARY KEY,
    brigade_id    INTEGER NOT NULL,
    configuration JSONB   NOT NULL,
    FOREIGN KEY (brigade_id) REFERENCES brigades (id)
);

CREATE TABLE trips
(
    id               SERIAL PRIMARY KEY,
    route_id         INTEGER      NOT NULL,
    start_date       TIMESTAMP    NOT NULL,
    train_identifier VARCHAR(255) NOT NULL,
    FOREIGN KEY (route_id) REFERENCES routes (id)
);

CREATE TABLE seats
(
    id         SERIAL PRIMARY KEY,
    vehicle_id INTEGER     NOT NULL,
    identifier VARCHAR(50) NOT NULL,
    type       seat_type   NOT NULL,
    FOREIGN KEY (vehicle_id) REFERENCES vehicles (id)
);

-- Состав поезда на перегонах.
CREATE TABLE trips_transports
(
    id               SERIAL   NOT NULL UNIQUE,
    trip_id          INTEGER  NOT NULL,
    vehicle_id       INTEGER  NOT NULL,
    from_transfer_id INTEGER  NOT NULL,
    to_transfer_id   INTEGER  NOT NULL,
    carriage_number  SMALLINT NOT NULL,
    PRIMARY KEY (trip_id, vehicle_id, from_transfer_id, to_transfer_id),
    -- возлагаем ответственность на бизнес, так как для номера вагона
    -- необходимо проверить, что нет вагона с таким номером на всех
    -- вложенных сегментах маршрута
    FOREIGN KEY (trip_id) REFERENCES trips (id),
    FOREIGN KEY (vehicle_id) REFERENCES vehicles (id),
    FOREIGN KEY (from_transfer_id) REFERENCES transfers (id),
    FOREIGN KEY (to_transfer_id) REFERENCES transfers (id)
);

CREATE UNIQUE INDEX idx_trip_transfer_carriage_unique
    ON trips_transports (trip_id, from_transfer_id, to_transfer_id, carriage_number);

CREATE TABLE kiosks
(
    id SERIAL PRIMARY KEY
);

CREATE TABLE tickets
(
    id               SERIAL         NOT NULL UNIQUE,
    trip_id          INTEGER,
    seat_id          INTEGER        NOT NULL,
    price            DECIMAL(10, 2) NOT NULL CHECK (price > 0),
    luggage_flag     BOOLEAN        NOT NULL,
    kiosk_id         INTEGER        NOT NULL,
    from_transfer_id INTEGER        NOT NULL,
    to_transfer_id   INTEGER        NOT NULL,
    PRIMARY KEY (trip_id, seat_id),
    FOREIGN KEY (trip_id) REFERENCES trips (id),
    FOREIGN KEY (seat_id) REFERENCES seats (id),
    FOREIGN KEY (kiosk_id) REFERENCES kiosks (id),
    FOREIGN KEY (from_transfer_id) REFERENCES transfers (id),
    FOREIGN KEY (to_transfer_id) REFERENCES transfers (id)
);

CREATE TABLE ticket_transactions
(
    id               SERIAL PRIMARY KEY,
    transaction_type transaction_type NOT NULL,
    ticket_id        INTEGER          NOT NULL,
    employee_id      INTEGER,
    created_at       TIMESTAMP        NOT NULL,
    FOREIGN KEY (ticket_id) REFERENCES tickets (id),
    FOREIGN KEY (employee_id) REFERENCES employees (id)
);