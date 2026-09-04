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
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "android-bites"
include(":app")
include(":scanit")
include(":cardgrab")
include(":pricesnap")
include(":locknote")
include(":facemark")
include(":playloop")
include(":themeflip")
include(":memefeed")
include(":homealert")
include(":steppulse")
include(":autobackup")
include(":hydratrack")
include(":dailyquote")
include(":tapshare")
include(":pulseband")
include(":voicejot")
include(":screengrab")
include(":ratenudge")
include(":adfree")
include(":focuslock")
include(":miniplay")
include(":arule")
include(":quickcall")
include(":tapdonate")
include(":ui")
include(":network")
