package it.tjeridi.extns.extension

import it.tjeridi.extns.parser.StringParserUtils
import java.math.BigDecimal
import java.math.BigInteger

/**
 * if value of string is null return empty string
 */

fun String?.extNSSNotNullOrEmpty(): String {
    this?.let {
        return it
    }
    return emptyString()
}

/**
 * if value of string is null return default value
 */

fun String?.extNSSNotNullOrDefault(defaultValue: String): String {
    this?.let {
        return it
    }
    return defaultValue
}

/**
 * convert string to int, return zero int value if exception happen
 */

fun String?.toIntExtNSS(): Int {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            StringParserUtils.toInt(this)
        } else {
            zeroIntValue()
        }
    }
    return zeroIntValue()
}

/**
 * convert string to int, return default value if exception happen
 */

fun String?.toIntOrDefaultExtNSS(defaultValue: Int): Int {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            StringParserUtils.toInt(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to float, return zero float value if exception happen
 */

fun String?.toFloatExtNSS(): Float {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            StringParserUtils.toFloat(this)
        } else {
            zeroFloatValue()
        }
    }
    return zeroFloatValue()
}

/**
 * convert string to float, return default value if exception happen
 */

fun String?.toFloatOrDefaultExtNSS(defaultValue: Float): Float {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            StringParserUtils.toFloat(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to double, return zero double value if exception happen
 */

fun String?.toDoubleExtNSS(): Double {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            StringParserUtils.toDouble(this)
        } else {
            zeroDoubleValue()
        }
    }
    return zeroDoubleValue()
}

/**
 * convert string to double, return default value if exception happen
 */

fun String?.toDoubleOrDefaultExtNSS(defaultValue: Double): Double {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            StringParserUtils.toDouble(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to big integer,return zero value if exception happen
 */

fun String?.toBigIntegerExtNSS(): BigInteger {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toBigInteger(this)
        } else {
            zeroBigIntValue()
        }
    }
    return zeroBigIntValue()
}

/**
 * convert string to big integer, return default value if exception happen
 */

fun String?.toBigIntegerExtNSS(defaultValue: BigInteger): BigInteger {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toBigInteger(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to big decimal, return zero big decimal value if exception happen
 */

fun String?.toBigDecimalExtNSS(): BigDecimal {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toBigDecimal(this)
        } else {
            zeroBigDecimalValue()
        }
    }
    return zeroBigDecimalValue()
}

/**
 * convert string to big decimal, return default value if exception happen
 */

fun String?.toBigDecimalOrDefaultExtNSS(defaultValue: BigDecimal): BigDecimal {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toBigDecimal(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to byte, return zero byte value if exception happen
 */

fun String?.toByteExtNSS(): Byte {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toByte(this)
        } else {
            zeroByteValue()
        }
    }
    return zeroByteValue()
}

/**
 * convert string to byte, return default value if exception happen
 */

fun String?.toByteOrDefaultExtNSS(defaultValue: Byte): Byte {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toByte(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to short, return zero short value if exception happen
 */

fun String?.toShortExtNSS(): Short {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toShort(this)
        } else {
            zeroShortValue()
        }
    }
    return zeroShortValue()
}

/**
 * convert string to short, return default value if exception happen
 */

fun String?.toShortOrDefaultExtNSS(defaultValue: Short): Short {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toShort(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to long, return zero long value if exception happen
 */

fun String?.toLongExtNSS(): Long {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toLong(this)
        } else {
            zeroLongValue()
        }
    }
    return zeroLongValue()
}

/**
 * convert string to long, return default value if exception happen
 */

fun String?.toLongOrDefaultExtNSS(defaultValue: Long): Long {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toLong(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * convert string to boolean, return false if exception happen
 */

fun String?.toBooleanExtNSS(): Boolean {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toBoolean(this)
        } else {
            false
        }
    }
    return false
}

/**
 * convert string to boolean,return default value if exception happen
 */

fun String?.toBooleanOrDefaultExtNSS(defaultValue: Boolean): Boolean {
    this?.let {
        return if (!this.isNullOrEmpty()) {
            return StringParserUtils.toBoolean(this, defaultValue)
        } else {
            defaultValue
        }
    }
    return defaultValue
}

/**
 * add vararg string in arrayList if string is not empty
 */

fun extNSSStringArray(vararg strings: String): ArrayList<String> {
    val resultArray = ArrayList<String>()
    for (string in strings) {
        if (string.isNotEmpty()) {
            resultArray.add(string)
        }
    }
    return resultArray
}


