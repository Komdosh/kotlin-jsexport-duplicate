import org.jetbrains.kotlin.gradle.dsl.JsMainFunctionExecutionMode
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
    kotlin("jvm") version "2.0.0" apply false
    kotlin("plugin.serialization") version "2.0.0" apply false

}
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<KotlinJsCompile>().configureEach {
    compilerOptions {
        freeCompilerArgs = listOf("-Xinline-classes", "-Xcontext-receivers", "-Xexpect-actual-classes")
        sourceMap = true
        sourceMapNamesPolicy = null
        main = JsMainFunctionExecutionMode.NO_CALL
        useEsClasses = true
        target = "es5" // update sometimes to es2015
    }
}

//
//kotlin {
//    jvmToolchain(21)
//}