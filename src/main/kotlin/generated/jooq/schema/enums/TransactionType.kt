/*
 * This file is generated by jOOQ.
 */
package jooq.schema.enums


import jooq.schema.Public

import org.jooq.Catalog
import org.jooq.EnumType
import org.jooq.Schema


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
enum class TransactionType(@get:JvmName("literal") public val literal: String) : EnumType {
    PURCHASE("PURCHASE"),
    REFUND("REFUND"),
    EXCHANGE("EXCHANGE"),
    CANCELATION("CANCELATION");
    override fun getCatalog(): Catalog? = schema.catalog
    override fun getSchema(): Schema = Public.PUBLIC
    override fun getName(): String = "transaction_type"
    override fun getLiteral(): String = literal
}
