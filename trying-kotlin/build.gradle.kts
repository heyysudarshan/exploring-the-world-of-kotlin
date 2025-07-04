plugins {
    alias(libs.plugins.gragle)
    alias(libs.plugins.kotlin.compiler)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
}