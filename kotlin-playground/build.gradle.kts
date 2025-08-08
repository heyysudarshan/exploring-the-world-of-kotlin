import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.compiler)
}

group = libs.versions.kotlinPlayground.group.get()
version = libs.versions.kotlinPlayground.version.get()

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of("21")
    }
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

dependencies {
    testImplementation(libs.kotlin.test)
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/KotlinPlayground"))