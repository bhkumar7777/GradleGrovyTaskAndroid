pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

rootProject.name = "GradleTask"
include(":app")
include(":module1")
include(":module2")
include(":module3")
include(":module4")
include(":module5")
include(":module6")
include(":module7")
include(":module8")
include(":module9")
include(":module10")
include(":module11")
include(":module12")
include(":module13")
include(":module14")
include(":module15")
include(":module16")
