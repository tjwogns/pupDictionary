object Versions {
    const val KOTLIN_VERSION = "1.5.0"
    const val KOTLINX_COROUTINES = "1.5.0"
    const val BUILD_GRADLE = "4.2.1"

    const val CORE_KTX = "1.5.0"
    const val APP_COMPAT = "1.3.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val ACTIVITY_KTX = "1.2.3"
    const val FRAGMENT_KTX = "1.3.4"
    const val LIFECYCLE_KTX = "2.3.1"
    const val ROOM = "2.3.0"
    const val RECYCLER_VIEW = "1.2.1"
    const val PAGING2 = "2.1.2"

    const val HILT = "2.35.1"
    const val MATERIAL = "1.3.0"

    const val RETROFIT = "2.7.1"
    const val OKHTTP = "4.3.1"
    const val GLIDE = "4.11.0"

    const val JUNIT = "4.13.2"
    const val ANDROID_JUNIT = "1.1.2"
    const val ESPRESSO_CORE = "3.3.0"
}

object Kotlin {
    const val KOTLIN_STDLIB      = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN_VERSION}"
    const val COROUTINES_CORE    = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.KOTLINX_COROUTINES}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.KOTLINX_COROUTINES}"
}

object AndroidX {
    const val CORE_KTX                = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val APP_COMPAT              = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
    const val CONSTRAINT_LAYOUT       = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"

    const val ACTIVITY_KTX            = "androidx.activity:activity-ktx:${Versions.ACTIVITY_KTX}"
    const val FRAGMENT_KTX            = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_KTX}"

    const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_KTX}"
    const val LIFECYCLE_LIVEDATA_KTX  = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE_KTX}"

    const val ROOM_RUNTIME            = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX                = "androidx.room:room-ktx:${Versions.ROOM}"
    const val ROOM_COMPILER           = "androidx.room:room-compiler:${Versions.ROOM}"

    const val RECYCLER_VIEW           = "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"

    const val PAGING2                 = "androidx.paging:paging-runtime:${Versions.PAGING2}"
    const val PAGING2_COMMON          = "androidx.paging:paging-common:${Versions.PAGING2}"
}

object Google {
    const val HILT_ANDROID          = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val HILT_ANDROID_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"

    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
}

object Libraries {
    const val RETROFIT                   = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTER_GSON    = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
    const val OKHTTP                     = "com.squareup.okhttp3:okhttp:${Versions.OKHTTP}"
    const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"

    const val GLIDE                      = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val GLIDE_COMPILER             = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
}

object Test {
    const val JUNIT         = "junit:junit:${Versions.JUNIT}"
    const val ANDROID_JUNIT = "androidx.test.ext:junit:${Versions.ANDROID_JUNIT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
}