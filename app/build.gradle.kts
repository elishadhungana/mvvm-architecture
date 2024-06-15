plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    //  kotlin("kapt") version "2.0.0"
   // alias(libs.plugins.org.jetbrains.kotlin.kapt)

}

//apply plugin : kotlin-kapt




android {
    namespace = "com.example.mvvmsampleapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mvvmsampleapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    buildFeatures {

        //just for dataBinding ，It has nothing to do with viewBinding
        dataBinding = true

        //just for viewBinding ，It has nothing to do with dataBinding
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    //Gson -> json data to java or kotlin format
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    //kotlin coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")

    //viewmodel and live data
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    //kodein dependency injection
    implementation("org.kodein.di.kodein-di-generic-jvm:6.2.1")
    implementation("org.kodein.di.kodein-di-framework-android-x:6.2.1")

    //Android Room
    implementation("androidx.room:room-runtime:2.1.0-rc01")
    implementation("androidx.room:room-ktx:2.1.0-rc01")
    //ksp ("androidx.room:room-cpmpiler:2.1.0-rc01")

    // To use Kotlin annotation processing tool (kapt)
    implementation("com.google.devtools.ksp:symbol-processing-api:1.5.0-1.0.0-alpha10")

    //navigation archotecture
    implementation("androidx.navigation:navigation-fragment-ktx:2.1.0-alpha05")
    implementation("androidx.navigation:navigation-ui-ktx:2.1.0-alpha05")


}