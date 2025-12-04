// settings.gradle.kts

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
    }
}

plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0" 
}

rootProject.name = "2025-aoc-kotlin"
