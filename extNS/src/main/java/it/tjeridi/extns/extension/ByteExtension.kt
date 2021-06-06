package it.tjeridi.extns.extension

/**
 *  if value of byte is null return zero byte value
 */

fun Byte?.extNSBTNotNullOrZero(): Byte {
    this?.let {
        return it
    }
    return zeroByteValue()
}

/**
 * if value of byte is null return default byte value
 */

fun Byte?.extNSBTNotNullOrDefault(defaultValue: Byte): Byte {
    this?.let {
        return it
    }
    return defaultValue
}