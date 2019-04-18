object Dependencies {
    object Version {
        val kotlin = "1.2.71"
        val appcompat = "1.0.2"
        val androidx = "1.0.1"
        val constraint = "1.1.3"
        val runner = "1.1.1"
        val espresso = "3.1.1"
    }

    val sdkVersion = 28
    val minSdkVersion = 16
    val targetVersion = 28

    val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val appCompat = "androidx.appcompat:appcompat:${Version.appcompat}"
    val androidxCore = "androidx.core:core-ktx:${Version.androidx}"
    val androidxConstraint = "androidx.constraintlayout:constraintlayout:${Version.constraint}"
    val junit = "junit:junit:4.12"
    val testRunner = "androidx.test:runner:${Version.runner}"
    val espressoCore = "androidx.test.espresso:espresso-core:${Version.espresso}"
}