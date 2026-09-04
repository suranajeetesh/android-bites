plugins {
    id("com.android.library")
    id("android-bites.hilt-and-mvvm")
}

android {
    namespace = "com.pqc.android_bites.pricesnap"
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




