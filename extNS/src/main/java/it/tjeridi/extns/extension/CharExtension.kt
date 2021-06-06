package it.tjeridi.extns.extension

/**
 * if char is null return Char.MIN_VALUE
 */

fun Char?.extNSCRNotNullOrMinValue(): Char {
    this?.let {
        return it
    }
    return Char.MIN_VALUE
}

/**
 * if char is null return default char value
 */

fun Char?.extNSCRNotNullOrDefault(defaultValue: Char): Char {
    this?.let {
        return it
    }
    return defaultValue
}