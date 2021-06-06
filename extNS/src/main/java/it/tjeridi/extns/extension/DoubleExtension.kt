package it.tjeridi.extns.extension

/**
 * if double is null return zero double value
 */

fun Double?.extNSDBNotNullOrZero(): Double {
    this?.let {
        return it
    }
    return zeroDoubleValue()
}

/**
 * if double is null return default double value
 */

fun Double?.extNSDBNotNullOrDefault(defaultValue: Double): Double {
    this?.let {
        return it
    }
    return defaultValue
}