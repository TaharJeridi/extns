package it.tjeridi.extns.parser

import it.tjeridi.extns.extension.*
import it.tjeridi.extns.utils.ExtNSLogHelper
import java.math.BigDecimal
import java.math.BigInteger

internal object StringParserUtils {

    private val TAG = StringParserUtils::class.java.name

    fun toInt(value: String): Int {
        try {
            return value.toInt()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroIntValue()
    }

    fun toInt(value: String, defaultValue: Int): Int {
        try {
            return value.toInt()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toFloat(value: String): Float {
        try {
            return value.toFloat()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroFloatValue()
    }

    fun toFloat(value: String, defaultValue: Float): Float {
        try {
            return value.toFloat()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toDouble(value: String): Double {
        try {
            return value.toDouble()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroDoubleValue()
    }

    fun toDouble(value: String, defaultValue: Double): Double {
        try {
            return value.toDouble()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toBigInteger(value: String): BigInteger {
        try {
            return value.toBigInteger()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroBigIntValue()
    }

    fun toBigInteger(value: String, defaultValue: BigInteger): BigInteger {
        try {
            return value.toBigInteger()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toBigDecimal(value: String): BigDecimal {
        try {
            return value.toBigDecimal()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroBigDecimalValue()
    }

    fun toBigDecimal(value: String, defaultValue: BigDecimal): BigDecimal {
        try {
            return value.toBigDecimal()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toByte(value: String): Byte {
        try {
            return value.toByte()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroByteValue()
    }

    fun toByte(value: String, defaultValue: Byte): Byte {
        try {
            return value.toByte()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toShort(value: String): Short {
        try {
            return value.toShort()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroShortValue()
    }

    fun toShort(value: String, defaultValue: Short): Short {
        try {
            return value.toShort()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toLong(value: String): Long {
        try {
            return value.toLong()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return zeroLongValue()
    }

    fun toLong(value: String, defaultValue: Long): Long {
        try {
            return value.toLong()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

    fun toBoolean(value: String): Boolean {
        try {
            return value.toBoolean()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return false
    }

    fun toBoolean(value: String, defaultValue: Boolean): Boolean {
        try {
            return value.toBoolean()
        } catch (e: Throwable) {
            ExtNSLogHelper.printStackTrace(TAG, e)
        }
        return defaultValue
    }

}