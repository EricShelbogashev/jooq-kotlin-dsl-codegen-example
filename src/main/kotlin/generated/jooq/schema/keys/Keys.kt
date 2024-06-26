/*
 * This file is generated by jOOQ.
 */
package jooq.schema.keys


import jooq.schema.tables.BrigadeVehicle
import jooq.schema.tables.Brigades
import jooq.schema.tables.BrigadesEmployees
import jooq.schema.tables.Departments
import jooq.schema.tables.EmployeeCategories
import jooq.schema.tables.Employees
import jooq.schema.tables.Inspections
import jooq.schema.tables.Kiosks
import jooq.schema.tables.Locations
import jooq.schema.tables.Managers
import jooq.schema.tables.MedicalExaminations
import jooq.schema.tables.Routes
import jooq.schema.tables.RoutesTransfers
import jooq.schema.tables.Schedule
import jooq.schema.tables.Seats
import jooq.schema.tables.TicketTransactions
import jooq.schema.tables.Tickets
import jooq.schema.tables.Transfers
import jooq.schema.tables.Trips
import jooq.schema.tables.TripsTransports
import jooq.schema.tables.Vehicles
import jooq.schema.tables.records.BrigadeVehicleRecord
import jooq.schema.tables.records.BrigadesEmployeesRecord
import jooq.schema.tables.records.BrigadesRecord
import jooq.schema.tables.records.DepartmentsRecord
import jooq.schema.tables.records.EmployeeCategoriesRecord
import jooq.schema.tables.records.EmployeesRecord
import jooq.schema.tables.records.InspectionsRecord
import jooq.schema.tables.records.KiosksRecord
import jooq.schema.tables.records.LocationsRecord
import jooq.schema.tables.records.ManagersRecord
import jooq.schema.tables.records.MedicalExaminationsRecord
import jooq.schema.tables.records.RoutesRecord
import jooq.schema.tables.records.RoutesTransfersRecord
import jooq.schema.tables.records.ScheduleRecord
import jooq.schema.tables.records.SeatsRecord
import jooq.schema.tables.records.TicketTransactionsRecord
import jooq.schema.tables.records.TicketsRecord
import jooq.schema.tables.records.TransfersRecord
import jooq.schema.tables.records.TripsRecord
import jooq.schema.tables.records.TripsTransportsRecord
import jooq.schema.tables.records.VehiclesRecord

import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val BRIGADE_VEHICLE_PKEY: UniqueKey<BrigadeVehicleRecord> = Internal.createUniqueKey(BrigadeVehicle.BRIGADE_VEHICLE, DSL.name("brigade_vehicle_pkey"), arrayOf(BrigadeVehicle.BRIGADE_VEHICLE.BRIGADE_ID, BrigadeVehicle.BRIGADE_VEHICLE.VEHICLE_ID), true)
val BRIGADES_PKEY: UniqueKey<BrigadesRecord> = Internal.createUniqueKey(Brigades.BRIGADES, DSL.name("brigades_pkey"), arrayOf(Brigades.BRIGADES.ID), true)
val BRIGADES_EMPLOYEES_PKEY: UniqueKey<BrigadesEmployeesRecord> = Internal.createUniqueKey(BrigadesEmployees.BRIGADES_EMPLOYEES, DSL.name("brigades_employees_pkey"), arrayOf(BrigadesEmployees.BRIGADES_EMPLOYEES.T_BRIGADE_ID, BrigadesEmployees.BRIGADES_EMPLOYEES.T_EMPLOYEE_ID), true)
val DEPARTMENTS_PKEY: UniqueKey<DepartmentsRecord> = Internal.createUniqueKey(Departments.DEPARTMENTS, DSL.name("departments_pkey"), arrayOf(Departments.DEPARTMENTS.ID), true)
val EMPLOYEE_CATEGORIES_PKEY: UniqueKey<EmployeeCategoriesRecord> = Internal.createUniqueKey(EmployeeCategories.EMPLOYEE_CATEGORIES, DSL.name("employee_categories_pkey"), arrayOf(EmployeeCategories.EMPLOYEE_CATEGORIES.ID), true)
val EMPLOYEES_PKEY: UniqueKey<EmployeesRecord> = Internal.createUniqueKey(Employees.EMPLOYEES, DSL.name("employees_pkey"), arrayOf(Employees.EMPLOYEES.ID), true)
val INSPECTIONS_PKEY: UniqueKey<InspectionsRecord> = Internal.createUniqueKey(Inspections.INSPECTIONS, DSL.name("inspections_pkey"), arrayOf(Inspections.INSPECTIONS.ID), true)
val KIOSKS_PKEY: UniqueKey<KiosksRecord> = Internal.createUniqueKey(Kiosks.KIOSKS, DSL.name("kiosks_pkey"), arrayOf(Kiosks.KIOSKS.ID), true)
val LOCATIONS_PKEY: UniqueKey<LocationsRecord> = Internal.createUniqueKey(Locations.LOCATIONS, DSL.name("locations_pkey"), arrayOf(Locations.LOCATIONS.ID), true)
val MANAGERS_PKEY: UniqueKey<ManagersRecord> = Internal.createUniqueKey(Managers.MANAGERS, DSL.name("managers_pkey"), arrayOf(Managers.MANAGERS.DEPARTMENT_ID, Managers.MANAGERS.EMPLOYEE_ID), true)
val MEDICAL_EXAMINATIONS_PKEY: UniqueKey<MedicalExaminationsRecord> = Internal.createUniqueKey(MedicalExaminations.MEDICAL_EXAMINATIONS, DSL.name("medical_examinations_pkey"), arrayOf(MedicalExaminations.MEDICAL_EXAMINATIONS.ID), true)
val ROUTES_PKEY: UniqueKey<RoutesRecord> = Internal.createUniqueKey(Routes.ROUTES, DSL.name("routes_pkey"), arrayOf(Routes.ROUTES.ID), true)
val ROUTES_TRANSFERS_PKEY: UniqueKey<RoutesTransfersRecord> = Internal.createUniqueKey(RoutesTransfers.ROUTES_TRANSFERS, DSL.name("routes_transfers_pkey"), arrayOf(RoutesTransfers.ROUTES_TRANSFERS.ROUTE_ID, RoutesTransfers.ROUTES_TRANSFERS.TRANSFER_ID), true)
val SCHEDULE_PKEY: UniqueKey<ScheduleRecord> = Internal.createUniqueKey(Schedule.SCHEDULE, DSL.name("schedule_pkey"), arrayOf(Schedule.SCHEDULE.ID), true)
val SEATS_PKEY: UniqueKey<SeatsRecord> = Internal.createUniqueKey(Seats.SEATS, DSL.name("seats_pkey"), arrayOf(Seats.SEATS.ID), true)
val TICKET_TRANSACTIONS_PKEY: UniqueKey<TicketTransactionsRecord> = Internal.createUniqueKey(TicketTransactions.TICKET_TRANSACTIONS, DSL.name("ticket_transactions_pkey"), arrayOf(TicketTransactions.TICKET_TRANSACTIONS.ID), true)
val TICKETS_ID_KEY: UniqueKey<TicketsRecord> = Internal.createUniqueKey(Tickets.TICKETS, DSL.name("tickets_id_key"), arrayOf(Tickets.TICKETS.ID), true)
val TICKETS_PKEY: UniqueKey<TicketsRecord> = Internal.createUniqueKey(Tickets.TICKETS, DSL.name("tickets_pkey"), arrayOf(Tickets.TICKETS.TRIP_ID, Tickets.TICKETS.SEAT_ID), true)
val TRANSFERS_PKEY: UniqueKey<TransfersRecord> = Internal.createUniqueKey(Transfers.TRANSFERS, DSL.name("transfers_pkey"), arrayOf(Transfers.TRANSFERS.ID), true)
val TRIPS_PKEY: UniqueKey<TripsRecord> = Internal.createUniqueKey(Trips.TRIPS, DSL.name("trips_pkey"), arrayOf(Trips.TRIPS.ID), true)
val TRIPS_TRANSPORTS_ID_KEY: UniqueKey<TripsTransportsRecord> = Internal.createUniqueKey(TripsTransports.TRIPS_TRANSPORTS, DSL.name("trips_transports_id_key"), arrayOf(TripsTransports.TRIPS_TRANSPORTS.ID), true)
val TRIPS_TRANSPORTS_PKEY: UniqueKey<TripsTransportsRecord> = Internal.createUniqueKey(TripsTransports.TRIPS_TRANSPORTS, DSL.name("trips_transports_pkey"), arrayOf(TripsTransports.TRIPS_TRANSPORTS.TRIP_ID, TripsTransports.TRIPS_TRANSPORTS.VEHICLE_ID, TripsTransports.TRIPS_TRANSPORTS.FROM_TRANSFER_ID, TripsTransports.TRIPS_TRANSPORTS.TO_TRANSFER_ID), true)
val VEHICLES_PKEY: UniqueKey<VehiclesRecord> = Internal.createUniqueKey(Vehicles.VEHICLES, DSL.name("vehicles_pkey"), arrayOf(Vehicles.VEHICLES.ID), true)

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

val BRIGADE_VEHICLE__BRIGADE_VEHICLE_BRIGADE_ID_FKEY: ForeignKey<BrigadeVehicleRecord, BrigadesRecord> = Internal.createForeignKey(BrigadeVehicle.BRIGADE_VEHICLE, DSL.name("brigade_vehicle_brigade_id_fkey"), arrayOf(BrigadeVehicle.BRIGADE_VEHICLE.BRIGADE_ID), jooq.schema.keys.BRIGADES_PKEY, arrayOf(Brigades.BRIGADES.ID), true)
val BRIGADE_VEHICLE__BRIGADE_VEHICLE_VEHICLE_ID_FKEY: ForeignKey<BrigadeVehicleRecord, VehiclesRecord> = Internal.createForeignKey(BrigadeVehicle.BRIGADE_VEHICLE, DSL.name("brigade_vehicle_vehicle_id_fkey"), arrayOf(BrigadeVehicle.BRIGADE_VEHICLE.VEHICLE_ID), jooq.schema.keys.VEHICLES_PKEY, arrayOf(Vehicles.VEHICLES.ID), true)
val BRIGADES__BRIGADES_DEPARTMENT_ID_FKEY: ForeignKey<BrigadesRecord, DepartmentsRecord> = Internal.createForeignKey(Brigades.BRIGADES, DSL.name("brigades_department_id_fkey"), arrayOf(Brigades.BRIGADES.DEPARTMENT_ID), jooq.schema.keys.DEPARTMENTS_PKEY, arrayOf(Departments.DEPARTMENTS.ID), true)
val BRIGADES_EMPLOYEES__BRIGADES_EMPLOYEES_T_BRIGADE_ID_FKEY: ForeignKey<BrigadesEmployeesRecord, BrigadesRecord> = Internal.createForeignKey(BrigadesEmployees.BRIGADES_EMPLOYEES, DSL.name("brigades_employees_t_brigade_id_fkey"), arrayOf(BrigadesEmployees.BRIGADES_EMPLOYEES.T_BRIGADE_ID), jooq.schema.keys.BRIGADES_PKEY, arrayOf(Brigades.BRIGADES.ID), true)
val BRIGADES_EMPLOYEES__BRIGADES_EMPLOYEES_T_EMPLOYEE_ID_FKEY: ForeignKey<BrigadesEmployeesRecord, EmployeesRecord> = Internal.createForeignKey(BrigadesEmployees.BRIGADES_EMPLOYEES, DSL.name("brigades_employees_t_employee_id_fkey"), arrayOf(BrigadesEmployees.BRIGADES_EMPLOYEES.T_EMPLOYEE_ID), jooq.schema.keys.EMPLOYEES_PKEY, arrayOf(Employees.EMPLOYEES.ID), true)
val DEPARTMENTS__DEPARTMENTS_LOCATION_ID_FKEY: ForeignKey<DepartmentsRecord, LocationsRecord> = Internal.createForeignKey(Departments.DEPARTMENTS, DSL.name("departments_location_id_fkey"), arrayOf(Departments.DEPARTMENTS.LOCATION_ID), jooq.schema.keys.LOCATIONS_PKEY, arrayOf(Locations.LOCATIONS.ID), true)
val EMPLOYEES__EMPLOYEES_CATEGORY_ID_FKEY: ForeignKey<EmployeesRecord, EmployeeCategoriesRecord> = Internal.createForeignKey(Employees.EMPLOYEES, DSL.name("employees_category_id_fkey"), arrayOf(Employees.EMPLOYEES.CATEGORY_ID), jooq.schema.keys.EMPLOYEE_CATEGORIES_PKEY, arrayOf(EmployeeCategories.EMPLOYEE_CATEGORIES.ID), true)
val EMPLOYEES__EMPLOYEES_DEPARTMENT_ID_FKEY: ForeignKey<EmployeesRecord, DepartmentsRecord> = Internal.createForeignKey(Employees.EMPLOYEES, DSL.name("employees_department_id_fkey"), arrayOf(Employees.EMPLOYEES.DEPARTMENT_ID), jooq.schema.keys.DEPARTMENTS_PKEY, arrayOf(Departments.DEPARTMENTS.ID), true)
val INSPECTIONS__INSPECTIONS_BRIGADE_ID_FKEY: ForeignKey<InspectionsRecord, BrigadesRecord> = Internal.createForeignKey(Inspections.INSPECTIONS, DSL.name("inspections_brigade_id_fkey"), arrayOf(Inspections.INSPECTIONS.BRIGADE_ID), jooq.schema.keys.BRIGADES_PKEY, arrayOf(Brigades.BRIGADES.ID), true)
val INSPECTIONS__INSPECTIONS_VEHICLE_ID_FKEY: ForeignKey<InspectionsRecord, VehiclesRecord> = Internal.createForeignKey(Inspections.INSPECTIONS, DSL.name("inspections_vehicle_id_fkey"), arrayOf(Inspections.INSPECTIONS.VEHICLE_ID), jooq.schema.keys.VEHICLES_PKEY, arrayOf(Vehicles.VEHICLES.ID), true)
val MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY: ForeignKey<ManagersRecord, DepartmentsRecord> = Internal.createForeignKey(Managers.MANAGERS, DSL.name("managers_employee_id_fkey"), arrayOf(Managers.MANAGERS.EMPLOYEE_ID), jooq.schema.keys.DEPARTMENTS_PKEY, arrayOf(Departments.DEPARTMENTS.ID), true)
val MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY1: ForeignKey<ManagersRecord, EmployeesRecord> = Internal.createForeignKey(Managers.MANAGERS, DSL.name("managers_employee_id_fkey1"), arrayOf(Managers.MANAGERS.EMPLOYEE_ID), jooq.schema.keys.EMPLOYEES_PKEY, arrayOf(Employees.EMPLOYEES.ID), true)
val MEDICAL_EXAMINATIONS__MEDICAL_EXAMINATIONS_EMPLOYEE_ID_FKEY: ForeignKey<MedicalExaminationsRecord, EmployeesRecord> = Internal.createForeignKey(MedicalExaminations.MEDICAL_EXAMINATIONS, DSL.name("medical_examinations_employee_id_fkey"), arrayOf(MedicalExaminations.MEDICAL_EXAMINATIONS.EMPLOYEE_ID), jooq.schema.keys.EMPLOYEES_PKEY, arrayOf(Employees.EMPLOYEES.ID), true)
val ROUTES_TRANSFERS__ROUTES_TRANSFERS_ROUTE_ID_FKEY: ForeignKey<RoutesTransfersRecord, RoutesRecord> = Internal.createForeignKey(RoutesTransfers.ROUTES_TRANSFERS, DSL.name("routes_transfers_route_id_fkey"), arrayOf(RoutesTransfers.ROUTES_TRANSFERS.ROUTE_ID), jooq.schema.keys.ROUTES_PKEY, arrayOf(Routes.ROUTES.ID), true)
val ROUTES_TRANSFERS__ROUTES_TRANSFERS_TRANSFER_ID_FKEY: ForeignKey<RoutesTransfersRecord, TransfersRecord> = Internal.createForeignKey(RoutesTransfers.ROUTES_TRANSFERS, DSL.name("routes_transfers_transfer_id_fkey"), arrayOf(RoutesTransfers.ROUTES_TRANSFERS.TRANSFER_ID), jooq.schema.keys.TRANSFERS_PKEY, arrayOf(Transfers.TRANSFERS.ID), true)
val SCHEDULE__SCHEDULE_BRIGADE_ID_FKEY: ForeignKey<ScheduleRecord, BrigadesRecord> = Internal.createForeignKey(Schedule.SCHEDULE, DSL.name("schedule_brigade_id_fkey"), arrayOf(Schedule.SCHEDULE.BRIGADE_ID), jooq.schema.keys.BRIGADES_PKEY, arrayOf(Brigades.BRIGADES.ID), true)
val SEATS__SEATS_VEHICLE_ID_FKEY: ForeignKey<SeatsRecord, VehiclesRecord> = Internal.createForeignKey(Seats.SEATS, DSL.name("seats_vehicle_id_fkey"), arrayOf(Seats.SEATS.VEHICLE_ID), jooq.schema.keys.VEHICLES_PKEY, arrayOf(Vehicles.VEHICLES.ID), true)
val TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_EMPLOYEE_ID_FKEY: ForeignKey<TicketTransactionsRecord, EmployeesRecord> = Internal.createForeignKey(TicketTransactions.TICKET_TRANSACTIONS, DSL.name("ticket_transactions_employee_id_fkey"), arrayOf(TicketTransactions.TICKET_TRANSACTIONS.EMPLOYEE_ID), jooq.schema.keys.EMPLOYEES_PKEY, arrayOf(Employees.EMPLOYEES.ID), true)
val TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_TICKET_ID_FKEY: ForeignKey<TicketTransactionsRecord, TicketsRecord> = Internal.createForeignKey(TicketTransactions.TICKET_TRANSACTIONS, DSL.name("ticket_transactions_ticket_id_fkey"), arrayOf(TicketTransactions.TICKET_TRANSACTIONS.TICKET_ID), jooq.schema.keys.TICKETS_ID_KEY, arrayOf(Tickets.TICKETS.ID), true)
val TICKETS__TICKETS_FROM_TRANSFER_ID_FKEY: ForeignKey<TicketsRecord, TransfersRecord> = Internal.createForeignKey(Tickets.TICKETS, DSL.name("tickets_from_transfer_id_fkey"), arrayOf(Tickets.TICKETS.FROM_TRANSFER_ID), jooq.schema.keys.TRANSFERS_PKEY, arrayOf(Transfers.TRANSFERS.ID), true)
val TICKETS__TICKETS_KIOSK_ID_FKEY: ForeignKey<TicketsRecord, KiosksRecord> = Internal.createForeignKey(Tickets.TICKETS, DSL.name("tickets_kiosk_id_fkey"), arrayOf(Tickets.TICKETS.KIOSK_ID), jooq.schema.keys.KIOSKS_PKEY, arrayOf(Kiosks.KIOSKS.ID), true)
val TICKETS__TICKETS_SEAT_ID_FKEY: ForeignKey<TicketsRecord, SeatsRecord> = Internal.createForeignKey(Tickets.TICKETS, DSL.name("tickets_seat_id_fkey"), arrayOf(Tickets.TICKETS.SEAT_ID), jooq.schema.keys.SEATS_PKEY, arrayOf(Seats.SEATS.ID), true)
val TICKETS__TICKETS_TO_TRANSFER_ID_FKEY: ForeignKey<TicketsRecord, TransfersRecord> = Internal.createForeignKey(Tickets.TICKETS, DSL.name("tickets_to_transfer_id_fkey"), arrayOf(Tickets.TICKETS.TO_TRANSFER_ID), jooq.schema.keys.TRANSFERS_PKEY, arrayOf(Transfers.TRANSFERS.ID), true)
val TICKETS__TICKETS_TRIP_ID_FKEY: ForeignKey<TicketsRecord, TripsRecord> = Internal.createForeignKey(Tickets.TICKETS, DSL.name("tickets_trip_id_fkey"), arrayOf(Tickets.TICKETS.TRIP_ID), jooq.schema.keys.TRIPS_PKEY, arrayOf(Trips.TRIPS.ID), true)
val TRANSFERS__TRANSFERS_FROM_DEPARTMENT_ID_FKEY: ForeignKey<TransfersRecord, DepartmentsRecord> = Internal.createForeignKey(Transfers.TRANSFERS, DSL.name("transfers_from_department_id_fkey"), arrayOf(Transfers.TRANSFERS.FROM_DEPARTMENT_ID), jooq.schema.keys.DEPARTMENTS_PKEY, arrayOf(Departments.DEPARTMENTS.ID), true)
val TRANSFERS__TRANSFERS_TO_DEPARTMENT_ID_FKEY: ForeignKey<TransfersRecord, DepartmentsRecord> = Internal.createForeignKey(Transfers.TRANSFERS, DSL.name("transfers_to_department_id_fkey"), arrayOf(Transfers.TRANSFERS.TO_DEPARTMENT_ID), jooq.schema.keys.DEPARTMENTS_PKEY, arrayOf(Departments.DEPARTMENTS.ID), true)
val TRIPS__TRIPS_ROUTE_ID_FKEY: ForeignKey<TripsRecord, RoutesRecord> = Internal.createForeignKey(Trips.TRIPS, DSL.name("trips_route_id_fkey"), arrayOf(Trips.TRIPS.ROUTE_ID), jooq.schema.keys.ROUTES_PKEY, arrayOf(Routes.ROUTES.ID), true)
val TRIPS_TRANSPORTS__TRIPS_TRANSPORTS_FROM_TRANSFER_ID_FKEY: ForeignKey<TripsTransportsRecord, TransfersRecord> = Internal.createForeignKey(TripsTransports.TRIPS_TRANSPORTS, DSL.name("trips_transports_from_transfer_id_fkey"), arrayOf(TripsTransports.TRIPS_TRANSPORTS.FROM_TRANSFER_ID), jooq.schema.keys.TRANSFERS_PKEY, arrayOf(Transfers.TRANSFERS.ID), true)
val TRIPS_TRANSPORTS__TRIPS_TRANSPORTS_TO_TRANSFER_ID_FKEY: ForeignKey<TripsTransportsRecord, TransfersRecord> = Internal.createForeignKey(TripsTransports.TRIPS_TRANSPORTS, DSL.name("trips_transports_to_transfer_id_fkey"), arrayOf(TripsTransports.TRIPS_TRANSPORTS.TO_TRANSFER_ID), jooq.schema.keys.TRANSFERS_PKEY, arrayOf(Transfers.TRANSFERS.ID), true)
val TRIPS_TRANSPORTS__TRIPS_TRANSPORTS_TRIP_ID_FKEY: ForeignKey<TripsTransportsRecord, TripsRecord> = Internal.createForeignKey(TripsTransports.TRIPS_TRANSPORTS, DSL.name("trips_transports_trip_id_fkey"), arrayOf(TripsTransports.TRIPS_TRANSPORTS.TRIP_ID), jooq.schema.keys.TRIPS_PKEY, arrayOf(Trips.TRIPS.ID), true)
val TRIPS_TRANSPORTS__TRIPS_TRANSPORTS_VEHICLE_ID_FKEY: ForeignKey<TripsTransportsRecord, VehiclesRecord> = Internal.createForeignKey(TripsTransports.TRIPS_TRANSPORTS, DSL.name("trips_transports_vehicle_id_fkey"), arrayOf(TripsTransports.TRIPS_TRANSPORTS.VEHICLE_ID), jooq.schema.keys.VEHICLES_PKEY, arrayOf(Vehicles.VEHICLES.ID), true)
val VEHICLES__VEHICLES_VEHICLES_DEPARTMENT_ID_FKEY: ForeignKey<VehiclesRecord, DepartmentsRecord> = Internal.createForeignKey(Vehicles.VEHICLES, DSL.name("vehicles_vehicles_department_id_fkey"), arrayOf(Vehicles.VEHICLES.VEHICLES_DEPARTMENT_ID), jooq.schema.keys.DEPARTMENTS_PKEY, arrayOf(Departments.DEPARTMENTS.ID), true)
