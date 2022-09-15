package com.fiveexceptions.mylibrary

enum class Sample(val stringValue: String) {
    LANDSCAPE("landscape"),
    PORTRAIT("portrait");

    override fun toString(): String {
        return stringValue
    }
}