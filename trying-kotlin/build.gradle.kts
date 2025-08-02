import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.tryingKotlin.group.get()
version = libs.versions.tryingKotlin.version.get()

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of("21")
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_11)
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/TryingKotlin"))