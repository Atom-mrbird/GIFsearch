plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}
android {
    namespace = "com.example.gifsearch"
    compileSdk = 35
    // Or your target SDK

    defaultConfig {
        applicationId = "com.example.gifsearch"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        // ...
    }

    buildTypes {
        release { // ... }
        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }
        kotlinOptions {
            jvmTarget = "1.8"
        }
        buildFeatures {
            compose = true
        }
        composeOptions {
            // IMPORTANT: Choose a version compatible with your Kotlin plugin version
            // See: https://developer.android.com/jetpack/androidx/releases/compose-kotlin
            kotlinCompilerExtensionVersion = "1.5.1" // Example, update this!
        }
    }

    dependencies {
        // Make sure these are using the same BOM or compatible versions
        val composeBom = platform("androidx.compose:compose-bom:2023.08.00") // Example BOM
        implementation(composeBom)
        implementation("androidx.compose.ui:ui")
        implementation("androidx.compose.ui:ui-graphics")
        implementation("androidx.compose.ui:ui-tooling-preview")
        implementation("androidx.compose.material3:material3")
        implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.0")

        // LiveData (optional, but often used with ViewModel)
        implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.0")
        // Ensure your Kotlin stdlib version is managed correctly (usually by the plugin)
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:2.1.0") // Example, often not needed explicitly
        implementation("androidx.compose.ui:ui:1.5.1")
        implementation("androidx.compose.material3:material3:1.2.1")
        implementation("androidx.compose.ui:ui-tooling-preview:1.5.1")
        debugImplementation("androidx.compose.ui:ui-tooling:1.5.1")
        implementation("androidx.lifecycle:lifecycle-runtime-compose:2.9.0")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
        implementation("com.squareup.retrofit2:retrofit:2.9.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation("io.coil-kt:coil-compose:2.4.0")


    }
}
dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.multidex)
    implementation("androidx.activity:activity-compose:1.10.1") // Or the latest version
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.0")
    implementation("androidx.compose.runtime:runtime-livedata:1.8.1")

    // You'll also need the core Compose libraries if you don't have them already
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00") // Check for the latest BOM
    implementation("androidx.compose:compose-bom:2025.05.00")
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3") // For Material 3 components
    implementation("androidx.compose.ui:ui-tooling-preview")
    debugImplementation("androidx.compose.ui:ui-tooling")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("io.coil-kt:coil-compose:2.5.0")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
}
