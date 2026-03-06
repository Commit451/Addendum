pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Addendum"
include(":app", ":addendum", ":addendum-design", ":addendum-recyclerview", ":addendum-parceler", ":addendum-threetenabp")
