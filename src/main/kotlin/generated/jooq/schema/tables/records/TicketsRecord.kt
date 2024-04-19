/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import java.math.BigDecimal

import jooq.schema.tables.Tickets

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TicketsRecord() : UpdatableRecordImpl<TicketsRecord>(Tickets.TICKETS) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var tripId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var seatId: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var price: BigDecimal?
        set(value): Unit = set(3, value)
        get(): BigDecimal? = get(3) as BigDecimal?

    open var luggageFlag: Boolean?
        set(value): Unit = set(4, value)
        get(): Boolean? = get(4) as Boolean?

    open var kioskId: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var fromTransferId: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    open var toTransferId: Int?
        set(value): Unit = set(7, value)
        get(): Int? = get(7) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Int?, Int?> = super.key() as Record2<Int?, Int?>

    /**
     * Create a detached, initialised TicketsRecord
     */
    constructor(id: Int? = null, tripId: Int? = null, seatId: Int? = null, price: BigDecimal? = null, luggageFlag: Boolean? = null, kioskId: Int? = null, fromTransferId: Int? = null, toTransferId: Int? = null): this() {
        this.id = id
        this.tripId = tripId
        this.seatId = seatId
        this.price = price
        this.luggageFlag = luggageFlag
        this.kioskId = kioskId
        this.fromTransferId = fromTransferId
        this.toTransferId = toTransferId
        resetChangedOnNotNull()
    }
}
