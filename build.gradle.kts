plugins {
    id("com.android.application") version "9.1.0" apply false
    id("com.android.library") version "9.1.0" apply false
    id("org.jetbrains.kotlin.android") version "2.3.10" apply false
    id("org.jetbrains.kotlin.kapt") version "2.3.10" apply false
    id("com.vanniktech.maven.publish") version "0.30.0" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}

extra["minSdkVersion"] = 21
extra["compileSdkVersion"] = 35
extra["targetSdkVersion"] = 35
