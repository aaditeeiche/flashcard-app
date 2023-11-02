pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
//        maven("http://jcenter.bintray.com/")
        maven{
            url = uri("http://jcenter.bintray.com/")
            isAllowInsecureProtocol = true;
        }

    }
}

rootProject.name = "flashcardsapp"
include(":app")
