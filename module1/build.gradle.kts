plugins {
    kotlin("multiplatform") apply true
    kotlin("plugin.serialization") apply true
}

kotlin {
    jvm {}

    js(IR) {
        browser {}
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.7.0-RC" )
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0-RC" )
                implementation(kotlin("stdlib-jdk8"))
            }
        }
    }
}

repositories {
    mavenCentral()
}