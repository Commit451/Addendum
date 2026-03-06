plugins {
    id("com.android.application")
}

android {
    namespace = "com.commit451.addendum.sample"
    compileSdk = rootProject.extra["compileSdkVersion"] as Int

    defaultConfig {
        applicationId = "com.commit451.addendum.sample"
        minSdk = 21
        targetSdk = rootProject.extra["targetSdkVersion"] as Int
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.16.0")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.jakewharton.timber:timber:5.0.1")

    implementation(project(":addendum"))
    implementation(project(":addendum-design"))
    implementation(project(":addendum-parceler"))
    implementation(project(":addendum-recyclerview"))
    implementation(project(":addendum-threetenabp"))
}
