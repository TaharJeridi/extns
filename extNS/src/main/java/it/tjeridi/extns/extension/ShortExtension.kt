package it.tjeridi.extns.extension

/**
 * if value of short is null return Short.MIN_VALUE
 */

fun Short?.notNullOrMinValue(): Short {
    this?.let {
        return it
    }
    return Short.MIN_VALUE
}

/**
 * if value of short is null return default short value
 */

fun Short?.notNullOrDefault(defaultValue: Short): Short {
    this?.let {
        return it
    }
    return defaultValue
}

