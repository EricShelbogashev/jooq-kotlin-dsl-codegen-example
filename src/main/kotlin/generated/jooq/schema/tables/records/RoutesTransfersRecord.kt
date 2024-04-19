/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import jooq.schema.tables.RoutesTransfers

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RoutesTransfersRecord() : UpdatableRecordImpl<RoutesTransfersRecord>(RoutesTransfers.ROUTES_TRANSFERS) {

    open var routeId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var transferId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Int?, Int?> = super.key() as Record2<Int?, Int?>

    /**
     * Create a detached, initialised RoutesTransfersRecord
     */
    constructor(routeId: Int? = null, transferId: Int? = null): this() {
        this.routeId = routeId
        this.transferId = transferId
        resetChangedOnNotNull()
    }
}