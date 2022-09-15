package com.appylar.android.sample.enums

enum class Sample(val stringValue: String) {
    LANDSCAPE("landscape"),
    PORTRAIT("portrait");

    override fun toString(): String {
        return stringValue
    }
}