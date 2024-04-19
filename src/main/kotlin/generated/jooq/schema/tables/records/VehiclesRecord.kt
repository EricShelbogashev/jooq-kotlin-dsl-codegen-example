/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import java.time.LocalDate

import jooq.schema.enums.VehicleType
import jooq.schema.tables.Vehicles

import org.jooq.JSONB
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class VehiclesRecord() : UpdatableRecordImpl<VehiclesRecord>(Vehicles.VEHICLES) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var vehiclesDepartmentId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var details: JSONB?
        set(value): Unit = set(2, value)
        get(): JSONB? = get(2) as JSONB?

    open var type: VehicleType?
        set(value): Unit = set(3, value)
        get(): VehicleType? = get(3) as VehicleType?

    open var builtIn: LocalDate?
        set(value): Unit = set(4, value)
        get(): LocalDate? = get(4) as LocalDate?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised VehiclesRecord
     */
    constructor(id: Int? = null, vehiclesDepartmentId: Int? = null, details: JSONB? = null, type: VehicleType? = null, builtIn: LocalDate? = null): this() {
        this.id = id
        this.vehiclesDepartmentId = vehiclesDepartmentId
        this.details = details
        this.type = type
        this.builtIn = builtIn
        resetChangedOnNotNull()
    }
}
