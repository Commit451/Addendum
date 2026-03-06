import com.vanniktech.maven.publish.AndroidSingleVariantLibrary
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.android.library")
    id("com.vanniktech.maven.publish")
}

group = findProperty("GROUP") as String
version = findProperty("VERSION_NAME") as String

android {
    namespace = "com.commit451.addendum.threetenabp"
    compileSdk = rootProject.extra["compileSdkVersion"] as Int

    defaultConfig {
        minSdk = rootProject.extra["minSdkVersion"] as Int
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    api("com.jakewharton.threetenabp:threetenabp:1.4.8")
    implementation(project(":addendum"))
}

mavenPublishing {
    configure(AndroidSingleVariantLibrary("release", true, true))
    coordinates("com.commit451", "addendum-threetenabp", version.toString())
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    if (System.getenv("RELEASE_SIGNING_ENABLED") == "true") {
        signAllPublications()
    }
}
