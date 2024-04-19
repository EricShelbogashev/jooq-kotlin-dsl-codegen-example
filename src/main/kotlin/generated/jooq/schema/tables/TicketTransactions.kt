/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables


import java.time.LocalDateTime

import jooq.schema.Public
import jooq.schema.enums.TransactionType
import jooq.schema.keys.TICKET_TRANSACTIONS_PKEY
import jooq.schema.keys.TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_EMPLOYEE_ID_FKEY
import jooq.schema.keys.TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_TICKET_ID_FKEY
import jooq.schema.tables.Employees.EmployeesPath
import jooq.schema.tables.Tickets.TicketsPath
import jooq.schema.tables.records.TicketTransactionsRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class TicketTransactions(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, TicketTransactionsRecord>?,
    parentPath: InverseForeignKey<out Record, TicketTransactionsRecord>?,
    aliased: Table<TicketTransactionsRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<TicketTransactionsRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.ticket_transactions</code>
         */
        val TICKET_TRANSACTIONS: TicketTransactions = TicketTransactions()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<TicketTransactionsRecord> = TicketTransactionsRecord::class.java

    /**
     * The column <code>public.ticket_transactions.id</code>.
     */
    val ID: TableField<TicketTransactionsRecord, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.ticket_transactions.transaction_type</code>.
     */
    val TRANSACTION_TYPE: TableField<TicketTransactionsRecord, TransactionType?> = createField(DSL.name("transaction_type"), SQLDataType.VARCHAR.nullable(false).asEnumDataType(TransactionType::class.java), this, "")

    /**
     * The column <code>public.ticket_transactions.ticket_id</code>.
     */
    val TICKET_ID: TableField<TicketTransactionsRecord, Int?> = createField(DSL.name("ticket_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.ticket_transactions.employee_id</code>.
     */
    val EMPLOYEE_ID: TableField<TicketTransactionsRecord, Int?> = createField(DSL.name("employee_id"), SQLDataType.INTEGER, this, "")

    /**
     * The column <code>public.ticket_transactions.created_at</code>.
     */
    val CREATED_AT: TableField<TicketTransactionsRecord, LocalDateTime?> = createField(DSL.name("created_at"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<TicketTransactionsRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<TicketTransactionsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<TicketTransactionsRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.ticket_transactions</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.ticket_transactions</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.ticket_transactions</code> table reference
     */
    constructor(): this(DSL.name("ticket_transactions"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, TicketTransactionsRecord>?, parentPath: InverseForeignKey<out Record, TicketTransactionsRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, TICKET_TRANSACTIONS, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class TicketTransactionsPath : TicketTransactions, Path<TicketTransactionsRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, TicketTransactionsRecord>?, parentPath: InverseForeignKey<out Record, TicketTransactionsRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<TicketTransactionsRecord>): super(alias, aliased)
        override fun `as`(alias: String): TicketTransactionsPath = TicketTransactionsPath(DSL.name(alias), this)
        override fun `as`(alias: Name): TicketTransactionsPath = TicketTransactionsPath(alias, this)
        override fun `as`(alias: Table<*>): TicketTransactionsPath = TicketTransactionsPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<TicketTransactionsRecord, Int?> = super.getIdentity() as Identity<TicketTransactionsRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<TicketTransactionsRecord> = TICKET_TRANSACTIONS_PKEY
    override fun getReferences(): List<ForeignKey<TicketTransactionsRecord, *>> = listOf(TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_TICKET_ID_FKEY, TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_EMPLOYEE_ID_FKEY)

    private lateinit var _tickets: TicketsPath

    /**
     * Get the implicit join path to the <code>public.tickets</code> table.
     */
    fun tickets(): TicketsPath {
        if (!this::_tickets.isInitialized)
            _tickets = TicketsPath(this, TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_TICKET_ID_FKEY, null)

        return _tickets;
    }

    val tickets: TicketsPath
        get(): TicketsPath = tickets()

    private lateinit var _employees: EmployeesPath

    /**
     * Get the implicit join path to the <code>public.employees</code> table.
     */
    fun employees(): EmployeesPath {
        if (!this::_employees.isInitialized)
            _employees = EmployeesPath(this, TICKET_TRANSACTIONS__TICKET_TRANSACTIONS_EMPLOYEE_ID_FKEY, null)

        return _employees;
    }

    val employees: EmployeesPath
        get(): EmployeesPath = employees()
    override fun `as`(alias: String): TicketTransactions = TicketTransactions(DSL.name(alias), this)
    override fun `as`(alias: Name): TicketTransactions = TicketTransactions(alias, this)
    override fun `as`(alias: Table<*>): TicketTransactions = TicketTransactions(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): TicketTransactions = TicketTransactions(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): TicketTransactions = TicketTransactions(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): TicketTransactions = TicketTransactions(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): TicketTransactions = TicketTransactions(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): TicketTransactions = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): TicketTransactions = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): TicketTransactions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): TicketTransactions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): TicketTransactions = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): TicketTransactions = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): TicketTransactions = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): TicketTransactions = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): TicketTransactions = where(DSL.notExists(select))
}