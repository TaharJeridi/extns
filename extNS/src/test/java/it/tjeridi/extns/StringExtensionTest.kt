package it.tjeridi.extns

import it.tjeridi.extns.extension.*
import org.junit.Test
import java.math.BigDecimal
import java.math.BigInteger

class StringExtensionTest {

    companion object {

        private const val DEFAULT_STRING: String = "default_string"

        private val NULL_STRING: String? = null

        private const val NOT_NULL_STRING: String = "not_null_string"

        private const val INT_VALUE_STRING: String = "12"

        private const val BOOLEAN_VALUE_STRING: String = "true"

        private const val FLOAT_VALUE_STRING: String = "12.0"

        private const val DEFAULT_VALUE_INT = 11

        private const val DEFAULT_VALUE_FLOAT = 11F

        private const val DEFAULT_VALUE_DOUBLE = 11.0

        private val DEFAULT_BIG_INTEGER_VALUE = BigInteger.valueOf(11)

        private val DEFAULT_BIG_DECIMAL_VALUE = BigDecimal.valueOf(13)

        private const val DEFAULT_BYTE_VALUE = 11.toByte()

        private const val DEFAULT_SHORT_VALUE = 11.toShort()

        private const val DEFAULT_LONG_VALUE = 11.toLong()

    }

    @Test
    fun notNullOrEmptyTest() {
        assert(NULL_STRING.notNullOrEmpty() == emptyString() && NOT_NULL_STRING.notNullOrEmpty() == NOT_NULL_STRING)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(
                NULL_STRING.notNullOrDefault(DEFAULT_STRING) == DEFAULT_STRING && NOT_NULL_STRING.notNullOrDefault(
                        DEFAULT_STRING
                ) == NOT_NULL_STRING
        )
    }

    @Test
    fun toIntValueTest() {
        assert(INT_VALUE_STRING.toSafeInt() == 12 && NOT_NULL_STRING.toSafeInt() == 0 && NULL_STRING.toSafeInt() == 0)
    }

    @Test
    fun toIntValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toSafeIntOrDefault(DEFAULT_VALUE_INT) == 12
                && NOT_NULL_STRING.toSafeIntOrDefault(DEFAULT_VALUE_INT) == DEFAULT_VALUE_INT
                && NULL_STRING.toSafeIntOrDefault(DEFAULT_VALUE_INT) == DEFAULT_VALUE_INT)
    }

    @Test
    fun toFloatValueTest() {
        assert(FLOAT_VALUE_STRING.toSafeFloat() == 12F
                && NOT_NULL_STRING.toSafeFloat() == 0F
                && NULL_STRING.toSafeFloat() == 0F)
    }

    @Test
    fun toFloatValueOrDefaultTest() {
        assert(FLOAT_VALUE_STRING.toSafeFloatOrDefault(DEFAULT_VALUE_FLOAT) == 12F
                && NOT_NULL_STRING.toSafeFloatOrDefault(DEFAULT_VALUE_FLOAT) == DEFAULT_VALUE_FLOAT
                && NULL_STRING.toSafeFloatOrDefault(DEFAULT_VALUE_FLOAT) == DEFAULT_VALUE_FLOAT)
    }

    @Test
    fun toDoubleValueTest() {
        assert(FLOAT_VALUE_STRING.toSafeDouble() == 12.0
                && NOT_NULL_STRING.toSafeDouble() == 0.0
                && NULL_STRING.toSafeDouble() == 0.0)
    }

    @Test
    fun toDoubleValueOrDefault() {
        assert(FLOAT_VALUE_STRING.toSafeDoubleOrDefault(DEFAULT_VALUE_DOUBLE) == 12.0
                && NOT_NULL_STRING.toSafeDoubleOrDefault(DEFAULT_VALUE_DOUBLE) == DEFAULT_VALUE_DOUBLE
                && NULL_STRING.toSafeDoubleOrDefault(DEFAULT_VALUE_DOUBLE) == DEFAULT_VALUE_DOUBLE)
    }

    @Test
    fun toBigIntegerValueTest() {
        assert(INT_VALUE_STRING.toSafeBigIntegerOrDefault() == BigInteger.valueOf(12)
                && NOT_NULL_STRING.toSafeBigIntegerOrDefault() == BigInteger.valueOf(0)
                && NULL_STRING.toSafeBigIntegerOrDefault() == BigInteger.valueOf(0))
    }

    @Test
    fun toBigIntegerValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toSafeBigIntegerOrDefault(DEFAULT_BIG_INTEGER_VALUE) == BigInteger.valueOf(12)
                && NOT_NULL_STRING.toSafeBigIntegerOrDefault(DEFAULT_BIG_INTEGER_VALUE) == DEFAULT_BIG_INTEGER_VALUE
                && NULL_STRING.toSafeBigIntegerOrDefault(DEFAULT_BIG_INTEGER_VALUE) == DEFAULT_BIG_INTEGER_VALUE)
    }

    @Test
    fun toBigDecimalValueTest() {
        assert(FLOAT_VALUE_STRING.toSafeBigDecimal() == BigDecimal.valueOf(12.0)
                && NOT_NULL_STRING.toSafeBigDecimal() == BigDecimal.valueOf(0)
                && NULL_STRING.toSafeBigDecimal() == BigDecimal.valueOf(0))
    }

    @Test
    fun toBigDecimalValueOrDefaultTest() {
        assert(FLOAT_VALUE_STRING.toSafeBigDecimalOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == BigDecimal.valueOf(12.0)
                && NOT_NULL_STRING.toSafeBigDecimalOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == DEFAULT_BIG_DECIMAL_VALUE
                && NULL_STRING.toSafeBigDecimalOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == DEFAULT_BIG_DECIMAL_VALUE)
    }

    @Test
    fun toByteValueTest() {
        assert(INT_VALUE_STRING.toSafeByte() == 12.toByte()
                && NOT_NULL_STRING.toSafeByte() == 0.toByte()
                && NULL_STRING.toSafeByte() == 0.toByte())
    }

    @Test
    fun toByteValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toSafeByteOrDefault(DEFAULT_BYTE_VALUE) == 12.toByte()
                && NOT_NULL_STRING.toSafeByteOrDefault(DEFAULT_BYTE_VALUE) == DEFAULT_BYTE_VALUE
                && NULL_STRING.toSafeByteOrDefault(DEFAULT_BYTE_VALUE) == DEFAULT_BYTE_VALUE)
    }

    @Test
    fun toShortValueTest() {
        assert(INT_VALUE_STRING.toSafeShort() == 12.toShort()
                && NOT_NULL_STRING.toSafeShort() == 0.toShort()
                && NULL_STRING.toSafeShort() == 0.toShort())
    }

    @Test
    fun toShortValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toSafeShortOrDefault(DEFAULT_SHORT_VALUE) == 12.toShort()
                && NOT_NULL_STRING.toSafeShortOrDefault(DEFAULT_SHORT_VALUE) == DEFAULT_SHORT_VALUE
                && NULL_STRING.toSafeShortOrDefault(DEFAULT_SHORT_VALUE) == DEFAULT_SHORT_VALUE)
    }

    @Test
    fun toLongValueTest() {
        assert(INT_VALUE_STRING.toSafeLong() == 12.toLong()
                && NOT_NULL_STRING.toSafeLong() == 0.toLong()
                && NULL_STRING.toSafeLong() == 0.toLong())
    }

    @Test
    fun toLongValueOrDefault() {
        assert(INT_VALUE_STRING.toSafeLongOrDefault(DEFAULT_LONG_VALUE) == 12.toLong()
                && NOT_NULL_STRING.toSafeLongOrDefault(DEFAULT_LONG_VALUE) == DEFAULT_LONG_VALUE
                && NULL_STRING.toSafeLongOrDefault(DEFAULT_LONG_VALUE) == DEFAULT_LONG_VALUE)
    }

    @Test
    fun toBooleanValueTest() {
        assert(BOOLEAN_VALUE_STRING.toSafeBoolean() && !NOT_NULL_STRING.toSafeBoolean() && !NULL_STRING.toSafeBoolean())
    }

    @Test
    fun toBooleanValueOrDefaultTest() {
        assert(BOOLEAN_VALUE_STRING.toSafeBooleanOrDefault(false) && !NOT_NULL_STRING.toSafeBooleanOrDefault(true) && NULL_STRING.toSafeBooleanOrDefault(true))
    }

    @Test
    fun stringArrayTest(){
        assert(notEmptyStringArray(BOOLEAN_VALUE_STRING, NOT_NULL_STRING) == arrayListOf(BOOLEAN_VALUE_STRING, NOT_NULL_STRING))
    }


}