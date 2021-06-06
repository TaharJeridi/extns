package it.tjeridi.extns.extension

import java.math.BigDecimal

/**
 * if value of big decimal is null return zero big decimal value
 */

fun BigDecimal?.extNSBDNotNullOrZero(): BigDecimal {
    this?.let {
        return it
    }
    return zeroBigDecimalValue()
}

/**
 * if value of big decimal is null return default big decimal value
 */

fun BigDecimal?.extNSBDNotNullOrDefault(defaultValue: BigDecimal): BigDecimal {
    this?.let {
        return it
    }
    return defaultValue
}

