import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.practiceSolutions.group.get()
version = libs.versions.practiceSolutions.version.get()

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
    implementation(libs.jetbrains.annotations)
    testImplementation(libs.kotlin.test)
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/PracticeSolutions"))