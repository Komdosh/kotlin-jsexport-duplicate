plugins {
    kotlin("multiplatform") apply true
    kotlin("plugin.serialization") apply true
}

kotlin {
    jvm {}

    js(IR) {}
}