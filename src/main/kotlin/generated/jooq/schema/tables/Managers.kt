/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables


import jooq.schema.Public
import jooq.schema.keys.MANAGERS_PKEY
import jooq.schema.keys.MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY
import jooq.schema.keys.MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY1
import jooq.schema.tables.Departments.DepartmentsPath
import jooq.schema.tables.Employees.EmployeesPath
import jooq.schema.tables.records.ManagersRecord

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
open class Managers(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, ManagersRecord>?,
    parentPath: InverseForeignKey<out Record, ManagersRecord>?,
    aliased: Table<ManagersRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<ManagersRecord>(
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
         * The reference instance of <code>public.managers</code>
         */
        val MANAGERS: Managers = Managers()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<ManagersRecord> = ManagersRecord::class.java

    /**
     * The column <code>public.managers.department_id</code>.
     */
    val DEPARTMENT_ID: TableField<ManagersRecord, Int?> = createField(DSL.name("department_id"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>public.managers.employee_id</code>.
     */
    val EMPLOYEE_ID: TableField<ManagersRecord, Int?> = createField(DSL.name("employee_id"), SQLDataType.INTEGER.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<ManagersRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<ManagersRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<ManagersRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.managers</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.managers</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.managers</code> table reference
     */
    constructor(): this(DSL.name("managers"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ManagersRecord>?, parentPath: InverseForeignKey<out Record, ManagersRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, MANAGERS, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class ManagersPath : Managers, Path<ManagersRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, ManagersRecord>?, parentPath: InverseForeignKey<out Record, ManagersRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<ManagersRecord>): super(alias, aliased)
        override fun `as`(alias: String): ManagersPath = ManagersPath(DSL.name(alias), this)
        override fun `as`(alias: Name): ManagersPath = ManagersPath(alias, this)
        override fun `as`(alias: Table<*>): ManagersPath = ManagersPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getPrimaryKey(): UniqueKey<ManagersRecord> = MANAGERS_PKEY
    override fun getReferences(): List<ForeignKey<ManagersRecord, *>> = listOf(MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY, MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY1)

    private lateinit var _departments: DepartmentsPath

    /**
     * Get the implicit join path to the <code>public.departments</code> table.
     */
    fun departments(): DepartmentsPath {
        if (!this::_departments.isInitialized)
            _departments = DepartmentsPath(this, MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY, null)

        return _departments;
    }

    val departments: DepartmentsPath
        get(): DepartmentsPath = departments()

    private lateinit var _employees: EmployeesPath

    /**
     * Get the implicit join path to the <code>public.employees</code> table.
     */
    fun employees(): EmployeesPath {
        if (!this::_employees.isInitialized)
            _employees = EmployeesPath(this, MANAGERS__MANAGERS_EMPLOYEE_ID_FKEY1, null)

        return _employees;
    }

    val employees: EmployeesPath
        get(): EmployeesPath = employees()
    override fun `as`(alias: String): Managers = Managers(DSL.name(alias), this)
    override fun `as`(alias: Name): Managers = Managers(alias, this)
    override fun `as`(alias: Table<*>): Managers = Managers(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Managers = Managers(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Managers = Managers(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Managers = Managers(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): Managers = Managers(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Managers = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): Managers = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): Managers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Managers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Managers = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Managers = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Managers = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Managers = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Managers = where(DSL.notExists(select))
}
