import org.jetbrains.kotlin.gradle.dsl.JsMainFunctionExecutionMode

plugins {
    kotlin("multiplatform") apply true
    kotlin("plugin.serialization") apply true
    id("love.forte.plugin.suspend-transform") version "0.9.0"
}

kotlin {
    jvm {}

    js(IR) {
        browser {}

        compilerOptions {
            freeCompilerArgs = listOf("-Xinline-classes", "-Xcontext-receivers", "-Xexpect-actual-classes", "-Xconsistent-data-class-copy-visibility", "-Xstrict-implicit-export-types")
            sourceMap = true
            sourceMapNamesPolicy = null
            main = JsMainFunctionExecutionMode.NO_CALL
            useEsClasses = true
            target = "es5" // update sometimes to es2015
        }
        binaries.library()

        generateTypeScriptDefinitions()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))

                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.9.0-RC")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.1")
            }
        }
    }
}

repositories {
    mavenCentral()
}

suspendTransform {
    useJsDefault()
}