package it.tjeridi.extns.extension

/**
 * if long value is null return zero long value
 */

fun Long?.extNSNotNullOrZero(): Long {
    this?.let {
        return it
    }
    return zeroLongValue()
}

/**
 * if long value is null return default long value
 */

fun Long?.extNSNotNullOrDefault(defaultValue: Long): Long {
    this?.let {
        return it
    }
    return defaultValue
}