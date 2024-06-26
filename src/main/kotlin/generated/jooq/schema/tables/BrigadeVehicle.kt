/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables


import jooq.schema.Public
import jooq.schema.keys.BRIGADE_VEHICLE_PKEY
import jooq.schema.keys.BRIGADE_VEHICLE__BRIGADE_VEHICLE_BRIGADE_ID_FKEY
import jooq.schema.keys.BRIGADE_VEHICLE__BRIGADE_VEHICLE_VEHICLE_ID_FKEY
import jooq.schema.tables.Brigades.BrigadesPath
import jooq.schema.tables.Vehicles.VehiclesPath
import jooq.schema.tables.records.BrigadeVehicleRecord

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
open class BrigadeVehicle(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, BrigadeVehicleRecord>?,
    parentPath: InverseForeignKey<out Record, BrigadeVehicleRecord>?,
    aliased: Table<BrigadeVehicleRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<BrigadeVehicleRecord>(
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
         * The reference instance of <code>public.brigade_vehicle</code>
         */
        val BRIGADE_VEHICLE: BrigadeVehicle = BrigadeVehicle()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<BrigadeVehicleRecord> = BrigadeVehicleRecord::class.java

    /**
     * The column <code>public.brigade_vehicle.brigade_id</code>.
     */
    val BRIGADE_ID: TableField<BrigadeVehicleRecord, Int?> = createField(DSL.name("brigade_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.brigade_vehicle.vehicle_id</code>.
     */
    val VEHICLE_ID: TableField<BrigadeVehicleRecord, Int?> = createField(DSL.name("vehicle_id"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<BrigadeVehicleRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<BrigadeVehicleRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<BrigadeVehicleRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.brigade_vehicle</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.brigade_vehicle</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.brigade_vehicle</code> table reference
     */
    constructor(): this(DSL.name("brigade_vehicle"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BrigadeVehicleRecord>?, parentPath: InverseForeignKey<out Record, BrigadeVehicleRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, BRIGADE_VEHICLE, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class BrigadeVehiclePath : BrigadeVehicle, Path<BrigadeVehicleRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, BrigadeVehicleRecord>?, parentPath: InverseForeignKey<out Record, BrigadeVehicleRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<BrigadeVehicleRecord>): super(alias, aliased)
        override fun `as`(alias: String): BrigadeVehiclePath = BrigadeVehiclePath(DSL.name(alias), this)
        override fun `as`(alias: Name): BrigadeVehiclePath = BrigadeVehiclePath(alias, this)
        override fun `as`(alias: Table<*>): BrigadeVehiclePath = BrigadeVehiclePath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<BrigadeVehicleRecord> = BRIGADE_VEHICLE_PKEY
    override fun getReferences(): List<ForeignKey<BrigadeVehicleRecord, *>> = listOf(BRIGADE_VEHICLE__BRIGADE_VEHICLE_BRIGADE_ID_FKEY, BRIGADE_VEHICLE__BRIGADE_VEHICLE_VEHICLE_ID_FKEY)

    private lateinit var _brigades: BrigadesPath

    /**
     * Get the implicit join path to the <code>public.brigades</code> table.
     */
    fun brigades(): BrigadesPath {
        if (!this::_brigades.isInitialized)
            _brigades = BrigadesPath(this, BRIGADE_VEHICLE__BRIGADE_VEHICLE_BRIGADE_ID_FKEY, null)

        return _brigades;
    }

    val brigades: BrigadesPath
        get(): BrigadesPath = brigades()

    private lateinit var _vehicles: VehiclesPath

    /**
     * Get the implicit join path to the <code>public.vehicles</code> table.
     */
    fun vehicles(): VehiclesPath {
        if (!this::_vehicles.isInitialized)
            _vehicles = VehiclesPath(this, BRIGADE_VEHICLE__BRIGADE_VEHICLE_VEHICLE_ID_FKEY, null)

        return _vehicles;
    }

    val vehicles: VehiclesPath
        get(): VehiclesPath = vehicles()
    override fun `as`(alias: String): BrigadeVehicle = BrigadeVehicle(DSL.name(alias), this)
    override fun `as`(alias: Name): BrigadeVehicle = BrigadeVehicle(alias, this)
    override fun `as`(alias: Table<*>): BrigadeVehicle = BrigadeVehicle(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): BrigadeVehicle = BrigadeVehicle(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): BrigadeVehicle = BrigadeVehicle(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): BrigadeVehicle = BrigadeVehicle(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): BrigadeVehicle = BrigadeVehicle(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): BrigadeVehicle = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): BrigadeVehicle = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): BrigadeVehicle = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): BrigadeVehicle = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): BrigadeVehicle = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): BrigadeVehicle = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): BrigadeVehicle = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): BrigadeVehicle = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): BrigadeVehicle = where(DSL.notExists(select))
}
