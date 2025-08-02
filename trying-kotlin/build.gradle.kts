plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.tryingKotlin.group.get()
version = libs.versions.tryingKotlin.version.get()

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/TryingKotlin"))