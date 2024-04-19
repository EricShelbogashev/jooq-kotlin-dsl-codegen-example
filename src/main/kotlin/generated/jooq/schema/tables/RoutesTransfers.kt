/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables


import jooq.schema.Public
import jooq.schema.keys.ROUTES_TRANSFERS_PKEY
import jooq.schema.keys.ROUTES_TRANSFERS__ROUTES_TRANSFERS_ROUTE_ID_FKEY
import jooq.schema.keys.ROUTES_TRANSFERS__ROUTES_TRANSFERS_TRANSFER_ID_FKEY
import jooq.schema.tables.Routes.RoutesPath
import jooq.schema.tables.Transfers.TransfersPath
import jooq.schema.tables.records.RoutesTransfersRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
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
open class RoutesTransfers(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RoutesTransfersRecord>?,
    parentPath: InverseForeignKey<out Record, RoutesTransfersRecord>?,
    aliased: Table<RoutesTransfersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RoutesTransfersRecord>(
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
         * The reference instance of <code>public.routes_transfers</code>
         */
        val ROUTES_TRANSFERS: RoutesTransfers = RoutesTransfers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RoutesTransfersRecord> = RoutesTransfersRecord::class.java

    /**
     * The column <code>public.routes_transfers.route_id</code>.
     */
    val ROUTE_ID: TableField<RoutesTransfersRecord, Int?> = createField(DSL.name("route_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.routes_transfers.transfer_id</code>.
     */
    val TRANSFER_ID: TableField<RoutesTransfersRecord, Int?> = createField(DSL.name("transfer_id"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<RoutesTransfersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RoutesTransfersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RoutesTransfersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.routes_transfers</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.routes_transfers</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.routes_transfers</code> table reference
     */
    constructor(): this(DSL.name("routes_transfers"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, RoutesTransfersRecord>?, parentPath: InverseForeignKey<out Record, RoutesTransfersRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, ROUTES_TRANSFERS, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class RoutesTransfersPath : RoutesTransfers, Path<RoutesTransfersRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, RoutesTransfersRecord>?, parentPath: InverseForeignKey<out Record, RoutesTransfersRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<RoutesTransfersRecord>): super(alias, aliased)
        override fun `as`(alias: String): RoutesTransfersPath = RoutesTransfersPath(DSL.name(alias), this)
        override fun `as`(alias: Name): RoutesTransfersPath = RoutesTransfersPath(alias, this)
        override fun `as`(alias: Table<*>): RoutesTransfersPath = RoutesTransfersPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<RoutesTransfersRecord> = ROUTES_TRANSFERS_PKEY
    override fun getReferences(): List<ForeignKey<RoutesTransfersRecord, *>> = listOf(ROUTES_TRANSFERS__ROUTES_TRANSFERS_ROUTE_ID_FKEY, ROUTES_TRANSFERS__ROUTES_TRANSFERS_TRANSFER_ID_FKEY)

    private lateinit var _routes: RoutesPath

    /**
     * Get the implicit join path to the <code>public.routes</code> table.
     */
    fun routes(): RoutesPath {
        if (!this::_routes.isInitialized)
            _routes = RoutesPath(this, ROUTES_TRANSFERS__ROUTES_TRANSFERS_ROUTE_ID_FKEY, null)

        return _routes;
    }

    val routes: RoutesPath
        get(): RoutesPath = routes()

    private lateinit var _transfers: TransfersPath

    /**
     * Get the implicit join path to the <code>public.transfers</code> table.
     */
    fun transfers(): TransfersPath {
        if (!this::_transfers.isInitialized)
            _transfers = TransfersPath(this, ROUTES_TRANSFERS__ROUTES_TRANSFERS_TRANSFER_ID_FKEY, null)

        return _transfers;
    }

    val transfers: TransfersPath
        get(): TransfersPath = transfers()
    override fun `as`(alias: String): RoutesTransfers = RoutesTransfers(DSL.name(alias), this)
    override fun `as`(alias: Name): RoutesTransfers = RoutesTransfers(alias, this)
    override fun `as`(alias: Table<*>): RoutesTransfers = RoutesTransfers(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): RoutesTransfers = RoutesTransfers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): RoutesTransfers = RoutesTransfers(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): RoutesTransfers = RoutesTransfers(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): RoutesTransfers = RoutesTransfers(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): RoutesTransfers = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): RoutesTransfers = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): RoutesTransfers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): RoutesTransfers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): RoutesTransfers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): RoutesTransfers = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): RoutesTransfers = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): RoutesTransfers = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): RoutesTransfers = where(DSL.notExists(select))
}
