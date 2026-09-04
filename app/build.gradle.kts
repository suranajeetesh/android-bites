plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.pqc.android_bites"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.pqc.android_bites"
        minSdk = 23
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // Core AndroidX
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)

    // Project Modules - Core
    implementation(project(":ui"))
    implementation(project(":network"))

    // Project Modules - Features
    implementation(project(":scanit"))
    implementation(project(":cardgrab"))
    implementation(project(":pricesnap"))
    implementation(project(":locknote"))
    implementation(project(":facemark"))
    implementation(project(":playloop"))
    implementation(project(":themeflip"))
    implementation(project(":memefeed"))
    implementation(project(":homealert"))
    implementation(project(":steppulse"))
    implementation(project(":autobackup"))
    implementation(project(":hydratrack"))
    implementation(project(":dailyquote"))
    implementation(project(":tapshare"))
    implementation(project(":pulseband"))
    implementation(project(":voicejot"))
    implementation(project(":screengrab"))
    implementation(project(":ratenudge"))
    implementation(project(":adfree"))
    implementation(project(":focuslock"))
    implementation(project(":miniplay"))
    implementation(project(":arule"))
    implementation(project(":quickcall"))
    implementation(project(":tapdonate"))

    // Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)

    // Dagger Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.navigation.compose)

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)

    // Debug
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
}