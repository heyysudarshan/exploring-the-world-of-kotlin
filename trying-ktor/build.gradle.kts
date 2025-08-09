plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.tryingKtor.group.get()
version = libs.versions.tryingKtor.version.get()

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/TryingKtor"))