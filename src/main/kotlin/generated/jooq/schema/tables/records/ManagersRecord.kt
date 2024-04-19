/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import jooq.schema.tables.Managers

import org.jooq.Record2
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ManagersRecord() : UpdatableRecordImpl<ManagersRecord>(Managers.MANAGERS) {

    open var departmentId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var employeeId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Int?, Int?> = super.key() as Record2<Int?, Int?>

    /**
     * Create a detached, initialised ManagersRecord
     */
    constructor(departmentId: Int? = null, employeeId: Int? = null): this() {
        this.departmentId = departmentId
        this.employeeId = employeeId
        resetChangedOnNotNull()
    }
}
