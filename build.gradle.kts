plugins {
    alias(libs.plugins.kotlin.compiler) apply false
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/RootProject"))