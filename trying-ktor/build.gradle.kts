import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
    alias(libs.plugins.ktor)
}

group = libs.versions.tryingKtor.group.get()
version = libs.versions.tryingKtor.version.get()

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of("23")
    }
    sourceCompatibility = JavaVersion.VERSION_23
    targetCompatibility = JavaVersion.VERSION_23
}

kotlin.compilerOptions {
    jvmTarget = JvmTarget.JVM_23
}

dependencies {
    implementation(libs.bundles.ktor)
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/TryingKtor"))