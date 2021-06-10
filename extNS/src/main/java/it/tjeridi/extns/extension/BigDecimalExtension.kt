package it.tjeridi.extns.extension

import java.math.BigDecimal

/**
 * if value of big decimal is null return zero big decimal value
 */

fun BigDecimal?.notNullOrZero(): BigDecimal {
    this?.let {
        return it
    }
    return zeroBigDecimalValue()
}

/**
 * if value of big decimal is null return default big decimal value
 */

fun BigDecimal?.notNullOrDefault(defaultValue: BigDecimal): BigDecimal {
    this?.let {
        return it
    }
    return defaultValue
}

