package it.tjeridi.extns.extension

/**
 * if value of char array is null return new char array with specific size specified on parameter
 */

fun CharArray?.notNullOrNewCharArray(size: Int): CharArray {
    this?.let {
        return it
    }
    return CharArray(size)
}

/**
 * if value of char array is null return default char array value
 */

fun CharArray?.notNullOrDefault(defaultValue: CharArray): CharArray {
    this?.let {
        return it
    }
    return defaultValue
}

