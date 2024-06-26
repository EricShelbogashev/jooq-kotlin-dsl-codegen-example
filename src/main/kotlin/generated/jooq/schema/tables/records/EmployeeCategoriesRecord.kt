/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import jooq.schema.tables.EmployeeCategories

import org.jooq.JSONB
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class EmployeeCategoriesRecord() : UpdatableRecordImpl<EmployeeCategoriesRecord>(EmployeeCategories.EMPLOYEE_CATEGORIES) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var title: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var attributes: JSONB?
        set(value): Unit = set(2, value)
        get(): JSONB? = get(2) as JSONB?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised EmployeeCategoriesRecord
     */
    constructor(id: Int? = null, title: String? = null, attributes: JSONB? = null): this() {
        this.id = id
        this.title = title
        this.attributes = attributes
        resetChangedOnNotNull()
    }
}
