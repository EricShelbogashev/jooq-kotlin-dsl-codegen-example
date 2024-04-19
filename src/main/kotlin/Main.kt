import jooq.schema.tables.references.EMPLOYEES
import org.jooq.impl.DSL

fun main() {
    DSL.using(
        "jdbc:postgresql://localhost:5432/example",
        "example",
        "example"
    ).use { ctx ->
        val result = ctx.select()
            .from(EMPLOYEES)
            .fetch()
        for (record in result) {
            println(record)
        }
    }
}