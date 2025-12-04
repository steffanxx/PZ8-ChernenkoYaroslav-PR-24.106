plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.pz8_chernenko_yaroslav_pr24106"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.pz8_chernenko_yaroslav_pr24106"
        minSdk = 30
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")


    implementation("androidx.wear:wear:1.3.0")
    implementation("androidx.wear.widget:wear:1.2.0")
    implementation(libs.cardview)


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}