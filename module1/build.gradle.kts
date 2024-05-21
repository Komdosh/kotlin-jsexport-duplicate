plugins {
    kotlin("multiplatform") apply true
    kotlin("plugin.serialization") apply true
}

kotlin {
    jvm {}

    js(IR) {
        browser {}

        binaries.library()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
    }
}

repositories {
    mavenCentral()
}