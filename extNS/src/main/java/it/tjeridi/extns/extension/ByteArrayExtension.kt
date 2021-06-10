package it.tjeridi.extns.extension

/**
 *  if value of byte array is null return new byte array with specific size specified on parameter
 */

fun ByteArray?.notNullOrNewByteArray(size: Int): ByteArray {
    this?.let {
        return it
    }
    return ByteArray(size)
}

/**
 * if value of byte array is null return default byte array value
 */

fun ByteArray?.notNullOrDefault(defaultValue: ByteArray): ByteArray {
    this?.let {
        return it
    }
    return defaultValue
}