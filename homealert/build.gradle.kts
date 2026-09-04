plugins {
    id("com.android.library")
}

android {
    namespace = "com.pqc.android_bites.homealert"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(project(":ui"))
    implementation(project(":network"))
}


