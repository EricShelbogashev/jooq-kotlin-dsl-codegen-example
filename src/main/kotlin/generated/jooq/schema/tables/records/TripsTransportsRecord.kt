/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import jooq.schema.tables.TripsTransports

import org.jooq.Record4
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TripsTransportsRecord() : UpdatableRecordImpl<TripsTransportsRecord>(TripsTransports.TRIPS_TRANSPORTS) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var tripId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var vehicleId: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var fromTransferId: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var toTransferId: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var carriageNumber: Short?
        set(value): Unit = set(5, value)
        get(): Short? = get(5) as Short?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record4<Int?, Int?, Int?, Int?> = super.key() as Record4<Int?, Int?, Int?, Int?>

    /**
     * Create a detached, initialised TripsTransportsRecord
     */
    constructor(id: Int? = null, tripId: Int? = null, vehicleId: Int? = null, fromTransferId: Int? = null, toTransferId: Int? = null, carriageNumber: Short? = null): this() {
        this.id = id
        this.tripId = tripId
        this.vehicleId = vehicleId
        this.fromTransferId = fromTransferId
        this.toTransferId = toTransferId
        this.carriageNumber = carriageNumber
        resetChangedOnNotNull()
    }
}