/*
 * This file is generated by jOOQ.
 */
package jooq.schema.tables.records


import jooq.schema.tables.Schedule

import org.jooq.JSONB
import org.jooq.Record1
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class ScheduleRecord() : UpdatableRecordImpl<ScheduleRecord>(Schedule.SCHEDULE) {

    open var id: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var brigadeId: Int?
        set(value): Unit = set(1, value)
        get(): Int? = get(1) as Int?

    open var configuration: JSONB?
        set(value): Unit = set(2, value)
        get(): JSONB? = get(2) as JSONB?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised ScheduleRecord
     */
    constructor(id: Int? = null, brigadeId: Int? = null, configuration: JSONB? = null): this() {
        this.id = id
        this.brigadeId = brigadeId
        this.configuration = configuration
        resetChangedOnNotNull()
    }
}
