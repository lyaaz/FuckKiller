plugins {
    id("fuck.android.application")
    id("fuck.xposed.legacy")
}

android {
    namespace = "org.lyaaz.fuckkiller"
    defaultConfig {
        minSdk = 30
    }
}

dependencies {
    implementation(libs.androidx.preference.ktx)
}
