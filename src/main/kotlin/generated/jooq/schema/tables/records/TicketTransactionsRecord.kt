/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import java.time.LocalDateTime

import jooq.schema.enums.TransactionType
import jooq.schema.tables.TicketTransactions

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TicketTransactionsRecord() : UpdatableRecordImpl<TicketTransactionsRecord>(TicketTransactions.TICKET_TRANSACTIONS) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var transactionType: TransactionType?
        set(value): Unit = set(1, value)
        get(): TransactionType? = get(1) as TransactionType?

    open var ticketId: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    open var employeeId: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var createdAt: LocalDateTime?
        set(value): Unit = set(4, value)
        get(): LocalDateTime? = get(4) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised TicketTransactionsRecord
     */
    constructor(id: Int? = null, transactionType: TransactionType? = null, ticketId: Int? = null, employeeId: Int? = null, createdAt: LocalDateTime? = null): this() {
        this.id = id
        this.transactionType = transactionType
        this.ticketId = ticketId
        this.employeeId = employeeId
        this.createdAt = createdAt
        resetChangedOnNotNull()
    }
}
