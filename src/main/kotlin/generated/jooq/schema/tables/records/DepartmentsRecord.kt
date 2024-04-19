/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import jooq.schema.tables.Departments

import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DepartmentsRecord() : UpdatableRecordImpl<DepartmentsRecord>(Departments.DEPARTMENTS) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var locationId: Int?
        set(value): Unit = set(2, value)
        get(): Int? = get(2) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised DepartmentsRecord
     */
    constructor(id: Int? = null, name: String? = null, locationId: Int? = null): this() {
        this.id = id
        this.name = name
        this.locationId = locationId
        resetChangedOnNotNull()
    }
}
