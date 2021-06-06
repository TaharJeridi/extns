package it.tjeridi.extns.extension

/**
 * if value of boolean is null return false
 */

fun Boolean?.extNSBLNotNullOrFalse(): Boolean {
    this?.let {
        return it
    }
    return false
}

/**
 * if value of boolean is null return true
 */

fun Boolean?.extNSBLNotNullOrTrue(): Boolean {
    this?.let {
        return it
    }
    return true
}

/**
 * if value of boolean is null return default boolean value
 */

fun Boolean?.extNSBLNotNullOrDefault(defaultValue: Boolean): Boolean {
    this?.let {
        return it
    }
    return defaultValue
}

