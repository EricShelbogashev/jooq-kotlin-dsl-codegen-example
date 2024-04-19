import org.jooq.codegen.KotlinGenerator
import org.jooq.meta.jaxb.MatcherRule

plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jooq.jooq-codegen-gradle") version "3.19.7"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.postgresql:postgresql:42.7.3")
    implementation("org.postgresql:postgresql:42.7.3")
    implementation("org.jooq:jooq-codegen-maven:3.19.7")
    implementation("org.jooq:jooq:3.19.7")
    implementation("org.jooq:jooq-meta:3.19.7")
    implementation("org.jooq.jooq-codegen-gradle:org.jooq.jooq-codegen-gradle.gradle.plugin:3.19.7")
    jooqCodegen("org.postgresql:postgresql:42.7.3")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

sourceSets {
    main {
        kotlin {
            val generated = file("${project.layout.buildDirectory}/src/generated/kotlin/jooq/schema")
            srcDirs.add(generated)
        }
    }
}

jooq {
    configuration {
        jdbc {
            driver = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/example"
            user = "example"
            password = "example"
        }
        generator {
            database {
                name = "org.jooq.meta.postgres.PostgresDatabase"
                includes = ".*"
                inputSchema = "public"
            }
            target {
                packageName = "jooq.schema"
                directory = "${rootDir}/src/main/kotlin/generated"
            }
            name = "org.jooq.codegen.KotlinGenerator"
        }
    }
}
