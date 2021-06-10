package it.tjeridi.extns.extension

import it.tjeridi.extns.parser.StringParserUtils
import java.math.BigDecimal
import java.math.BigInteger

/**
 * if value of string is null return empty string
 */

fun String?.notNullOrEmpty(): String {
    this?.let {
        return it
    }
    return emptyString()
}

/**
 * if value of string is null return default value
 */

fun String?.notNullOrDefault(defaultValue: String): String {
    this?.let {
        return it
    }
    return defaultValue
}

/**
 * convert string to int, return zero int value if exception happen
 */

fun String?.toSafeInt(): Int {
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

fun String?.toSafeIntOrDefault(defaultValue: Int): Int {
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

fun String?.toSafeFloat(): Float {
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

fun String?.toSafeFloatOrDefault(defaultValue: Float): Float {
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

fun String?.toSafeDouble(): Double {
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

fun String?.toSafeDoubleOrDefault(defaultValue: Double): Double {
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

fun String?.toSafeBigIntegerOrDefault(): BigInteger {
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

fun String?.toSafeBigIntegerOrDefault(defaultValue: BigInteger): BigInteger {
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

fun String?.toSafeBigDecimal(): BigDecimal {
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

fun String?.toSafeBigDecimalOrDefault(defaultValue: BigDecimal): BigDecimal {
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

fun String?.toSafeByte(): Byte {
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

fun String?.toSafeByteOrDefault(defaultValue: Byte): Byte {
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

fun String?.toSafeShort(): Short {
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

fun String?.toSafeShortOrDefault(defaultValue: Short): Short {
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

fun String?.toSafeLong(): Long {
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

fun String?.toSafeLongOrDefault(defaultValue: Long): Long {
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

fun String?.toSafeBoolean(): Boolean {
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

fun String?.toSafeBooleanOrDefault(defaultValue: Boolean): Boolean {
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

fun notEmptyStringArray(vararg strings: String): ArrayList<String> {
    val resultArray = ArrayList<String>()
    for (string in strings) {
        if (string.isNotEmpty()) {
            resultArray.add(string)
        }
    }
    return resultArray
}


