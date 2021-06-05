package it.tjeridi.extns.extension

/**
 * if float value is null return zero float value
 */

fun Float?.extNSFLNotNullOrZero(): Float {
    this?.let {
        return it
    }
    return zeroFloatValue()
}

/**
 * if float value is null return default float value
 */

fun Float?.extNSFLNotNullOrDefault(defaultValue: Float): Float {
    this?.let {
        return it
    }
    return defaultValue
}