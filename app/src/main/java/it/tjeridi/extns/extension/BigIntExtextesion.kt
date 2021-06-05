package it.tjeridi.extns.extension

import java.math.BigInteger

/**
 * if value of big integer is null return zero big integer value
 */

fun BigInteger?.extNSBINotNullOrZero(): BigInteger {
    this?.let {
        return it
    }
    return zeroBigIntValue()
}

/**
 * if value of big integer is null return default big integer value
 */

fun BigInteger?.extNSBINotNullOrDefault(defaultValue: BigInteger): BigInteger {
    this?.let {
        return it
    }
    return defaultValue
}