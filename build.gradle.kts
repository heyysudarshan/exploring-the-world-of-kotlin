plugins {
    alias(libs.plugins.kotlin.compiler) apply false
    alias(libs.plugins.ktor) apply false
    alias(libs.plugins.kotlin.serialization) apply false
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/RootProject"))