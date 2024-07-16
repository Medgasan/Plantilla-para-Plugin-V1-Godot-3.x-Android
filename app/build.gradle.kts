plugins {
    id("com.android.library")
}

android {

    namespace = "com.neoofcomstudio.godot3_5_3_demo_plugin"
    compileSdk = 33

    defaultConfig {
        minSdk = 19
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildToolsVersion = "33.0.2"
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.5.0")
    compileOnly(
        fileTree(
            mapOf(
                "dir" to "libs",
                "include" to listOf("*.aar", "*.jar"),
                "exclude" to listOf("")
            )
        )
    )
}