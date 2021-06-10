package it.tjeridi.extns.extension

import java.math.BigDecimal
import java.math.BigInteger

/**
 * if object is null return new object if constructor is public and not have parameter
 */

inline fun <reified T> T?.notNullOrNewObject(): T {
    this?.let {
        return it
    }
    return T::class.java.newInstance()
}

/**
 * if object is null return default object
 */

fun <T> T?.notNullOrDefaultValue(defaultValue: T): T {
    this?.let {
        return it
    }
    return defaultValue
}

/**
 * return true if object is not null
 */

fun <T> T?.isNotNull(): Boolean {
    this?.let {
        return true
    }
    return false
}

internal fun emptyString(): String {
    return ""
}

internal fun zeroIntValue(): Int {
    return 0
}

internal fun zeroBigIntValue(): BigInteger {
    return BigInteger.valueOf(0)
}

internal fun zeroBigDecimalValue(): BigDecimal {
    return BigDecimal.valueOf(0)
}

internal fun zeroFloatValue(): Float {
    return 0F
}

internal fun zeroDoubleValue(): Double {
    return 0.0
}

internal fun zeroLongValue(): Long {
    return 0L
}

internal fun zeroByteValue(): Byte {
    return 0
}

internal fun zeroShortValue(): Short {
    return 0
}