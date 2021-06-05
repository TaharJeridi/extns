package it.tjeridi.extns.extension

/**
 * if value of int is null return zero int value
 */

fun Int?.extNSIntNotNullOrZero(): Int {
    this?.let {
        return it
    }
    return zeroIntValue()
}

/**
 * if value of int is null return default value
 */

fun Int?.extNSIntNotNullOrDefault(defaultValue: Int): Int {
    this?.let {
        return it
    }
    return defaultValue
}