/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables


import jooq.schema.Public
import jooq.schema.keys.SCHEDULE_PKEY
import jooq.schema.keys.SCHEDULE__SCHEDULE_BRIGADE_ID_FKEY
import jooq.schema.tables.Brigades.BrigadesPath
import jooq.schema.tables.records.ScheduleRecord

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.InverseForeignKey
import org.jooq.JSONB
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
open class Schedule(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ScheduleRecord>?,
    parentPath: InverseForeignKey<out Record, ScheduleRecord>?,
    aliased: Table<ScheduleRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ScheduleRecord>(
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
         * The reference instance of <code>public.schedule</code>
         */
        val SCHEDULE: Schedule = Schedule()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ScheduleRecord> = ScheduleRecord::class.java

    /**
     * The column <code>public.schedule.id</code>.
     */
    val ID: TableField<ScheduleRecord, Int?> = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>public.schedule.brigade_id</code>.
     */
    val BRIGADE_ID: TableField<ScheduleRecord, Int?> = createField(DSL.name("brigade_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.schedule.configuration</code>.
     */
    val CONFIGURATION: TableField<ScheduleRecord, JSONB?> = createField(DSL.name("configuration"), SQLDataType.JSONB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ScheduleRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ScheduleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ScheduleRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.schedule</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.schedule</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.schedule</code> table reference
     */
    constructor(): this(DSL.name("schedule"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ScheduleRecord>?, parentPath: InverseForeignKey<out Record, ScheduleRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, SCHEDULE, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class SchedulePath : Schedule, Path<ScheduleRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ScheduleRecord>?, parentPath: InverseForeignKey<out Record, ScheduleRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<ScheduleRecord>): super(alias, aliased)
        override fun `as`(alias: String): SchedulePath = SchedulePath(DSL.name(alias), this)
        override fun `as`(alias: Name): SchedulePath = SchedulePath(alias, this)
        override fun `as`(alias: Table<*>): SchedulePath = SchedulePath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIdentity(): Identity<ScheduleRecord, Int?> = super.getIdentity() as Identity<ScheduleRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<ScheduleRecord> = SCHEDULE_PKEY
    override fun getReferences(): List<ForeignKey<ScheduleRecord, *>> = listOf(SCHEDULE__SCHEDULE_BRIGADE_ID_FKEY)

    private lateinit var _brigades: BrigadesPath

    /**
     * Get the implicit join path to the <code>public.brigades</code> table.
     */
    fun brigades(): BrigadesPath {
        if (!this::_brigades.isInitialized)
            _brigades = BrigadesPath(this, SCHEDULE__SCHEDULE_BRIGADE_ID_FKEY, null)

        return _brigades;
    }

    val brigades: BrigadesPath
        get(): BrigadesPath = brigades()
    override fun `as`(alias: String): Schedule = Schedule(DSL.name(alias), this)
    override fun `as`(alias: Name): Schedule = Schedule(alias, this)
    override fun `as`(alias: Table<*>): Schedule = Schedule(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Schedule = Schedule(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Schedule = Schedule(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Schedule = Schedule(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Schedule = Schedule(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Schedule = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Schedule = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Schedule = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Schedule = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Schedule = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Schedule = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Schedule = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Schedule = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Schedule = where(DSL.notExists(select))
}
