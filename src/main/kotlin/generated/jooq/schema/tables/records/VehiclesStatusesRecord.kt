/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import java.time.LocalDate
import java.time.LocalDateTime

import jooq.schema.enums.VehicleStatus
import jooq.schema.enums.VehicleType
import jooq.schema.tables.VehiclesStatuses

import org.jooq.JSONB
import org.jooq.impl.TableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class VehiclesStatusesRecord() : TableRecordImpl<VehiclesStatusesRecord>(VehiclesStatuses.VEHICLES_STATUSES) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var vehiclesDepartmentId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var builtIn: LocalDate?
        set(value): Unit = set(2, value)
        get(): LocalDate? = get(2) as LocalDate?

    open var details: JSONB?
        set(value): Unit = set(3, value)
        get(): JSONB? = get(3) as JSONB?

    open var type: VehicleType?
        set(value): Unit = set(4, value)
        get(): VehicleType? = get(4) as VehicleType?

    open var inspectionId: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var conclusion: VehicleStatus?
        set(value): Unit = set(6, value)
        get(): VehicleStatus? = get(6) as VehicleStatus?

    open var inspectedAt: LocalDateTime?
        set(value): Unit = set(7, value)
        get(): LocalDateTime? = get(7) as LocalDateTime?

    open var brigadeId: Int?
        set(value): Unit = set(8, value)
        get(): Int? = get(8) as Int?

    open var vehicleId: Int?
        set(value): Unit = set(9, value)
        get(): Int? = get(9) as Int?

    /**
     * Create a detached, initialised VehiclesStatusesRecord
     */
    constructor(id: Int? = null, vehiclesDepartmentId: Int? = null, builtIn: LocalDate? = null, details: JSONB? = null, type: VehicleType? = null, inspectionId: Int? = null, conclusion: VehicleStatus? = null, inspectedAt: LocalDateTime? = null, brigadeId: Int? = null, vehicleId: Int? = null): this() {
        this.id = id
        this.vehiclesDepartmentId = vehiclesDepartmentId
        this.builtIn = builtIn
        this.details = details
        this.type = type
        this.inspectionId = inspectionId
        this.conclusion = conclusion
        this.inspectedAt = inspectedAt
        this.brigadeId = brigadeId
        this.vehicleId = vehicleId
        resetChangedOnNotNull()
    }
}
