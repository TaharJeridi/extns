package it.tjeridi.extns.extension

import java.math.BigInteger

/**
 * if value of big integer is null return zero big integer value
 */

fun BigInteger?.notNullOrZero(): BigInteger {
    this?.let {
        return it
    }
    return zeroBigIntValue()
}

/**
 * if value of big integer is null return default big integer value
 */

fun BigInteger?.notNullOrDefault(defaultValue: BigInteger): BigInteger {
    this?.let {
        return it
    }
    return defaultValue
}