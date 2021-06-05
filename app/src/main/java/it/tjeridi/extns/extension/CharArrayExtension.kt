package it.tjeridi.extns.extension

/**
 * if value of char array is null return new char array with specific size specified on parameter
 */

fun CharArray?.extNSCANotNullOrNewCharArray(size: Int): CharArray {
    this?.let {
        return it
    }
    return CharArray(size)
}

/**
 * if value of char array is null return default char array value
 */

fun CharArray?.extNSCANotNullOrDefault(defaultValue: CharArray): CharArray {
    this?.let {
        return it
    }
    return defaultValue
}

