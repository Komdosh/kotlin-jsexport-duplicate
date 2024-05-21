pluginManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://plugins.gradle.org/m2/")
        maven {
            url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap")
            name = "ktor-eap"
        }
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
    }
}

rootProject.name = "kotlin-jsexport-duplicate"

include("module1")
