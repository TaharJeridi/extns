package it.tjeridi.extns.extension

/**
 * if value of long array is null return new long array with specific size specified on parameter
 */

fun LongArray?.notNullOrNewLongArray(size: Int): LongArray {
    this?.let {
        return it
    }
    return LongArray(size)
}

/**
 * if value of long array is null return default long array specified on parameter
 */

fun LongArray?.notNullOrDefaultValue(defaultValue: LongArray): LongArray {
    this?.let {
        return it
    }
    return defaultValue
}