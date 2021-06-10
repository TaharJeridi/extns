package it.tjeridi.extns.extension

/**
 * if value of boolean is null return false
 */

fun Boolean?.notNullOrFalse(): Boolean {
    this?.let {
        return it
    }
    return false
}

/**
 * if value of boolean is null return true
 */

fun Boolean?.notNullOrTrue(): Boolean {
    this?.let {
        return it
    }
    return true
}

/**
 * if value of boolean is null return default boolean value
 */

fun Boolean?.notNullOrDefault(defaultValue: Boolean): Boolean {
    this?.let {
        return it
    }
    return defaultValue
}

