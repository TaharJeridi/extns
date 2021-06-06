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
        assert(NULL_STRING.extNSSNotNullOrEmpty() == emptyString() && NOT_NULL_STRING.extNSSNotNullOrEmpty() == NOT_NULL_STRING)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(
                NULL_STRING.extNSSNotNullOrDefault(DEFAULT_STRING) == DEFAULT_STRING && NOT_NULL_STRING.extNSSNotNullOrDefault(
                        DEFAULT_STRING
                ) == NOT_NULL_STRING
        )
    }

    @Test
    fun toIntValueTest() {
        assert(INT_VALUE_STRING.toIntExtNSS() == 12 && NOT_NULL_STRING.toIntExtNSS() == 0 && NULL_STRING.toIntExtNSS() == 0)
    }

    @Test
    fun toIntValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toIntOrDefaultExtNSS(DEFAULT_VALUE_INT) == 12
                && NOT_NULL_STRING.toIntOrDefaultExtNSS(DEFAULT_VALUE_INT) == DEFAULT_VALUE_INT
                && NULL_STRING.toIntOrDefaultExtNSS(DEFAULT_VALUE_INT) == DEFAULT_VALUE_INT)
    }

    @Test
    fun toFloatValueTest() {
        assert(FLOAT_VALUE_STRING.toFloatExtNSS() == 12F
                && NOT_NULL_STRING.toFloatExtNSS() == 0F
                && NULL_STRING.toFloatExtNSS() == 0F)
    }

    @Test
    fun toFloatValueOrDefaultTest() {
        assert(FLOAT_VALUE_STRING.toFloatOrDefaultExtNSS(DEFAULT_VALUE_FLOAT) == 12F
                && NOT_NULL_STRING.toFloatOrDefaultExtNSS(DEFAULT_VALUE_FLOAT) == DEFAULT_VALUE_FLOAT
                && NULL_STRING.toFloatOrDefaultExtNSS(DEFAULT_VALUE_FLOAT) == DEFAULT_VALUE_FLOAT)
    }

    @Test
    fun toDoubleValueTest() {
        assert(FLOAT_VALUE_STRING.toDoubleExtNSS() == 12.0
                && NOT_NULL_STRING.toDoubleExtNSS() == 0.0
                && NULL_STRING.toDoubleExtNSS() == 0.0)
    }

    @Test
    fun toDoubleValueOrDefault() {
        assert(FLOAT_VALUE_STRING.toDoubleOrDefaultExtNSS(DEFAULT_VALUE_DOUBLE) == 12.0
                && NOT_NULL_STRING.toDoubleOrDefaultExtNSS(DEFAULT_VALUE_DOUBLE) == DEFAULT_VALUE_DOUBLE
                && NULL_STRING.toDoubleOrDefaultExtNSS(DEFAULT_VALUE_DOUBLE) == DEFAULT_VALUE_DOUBLE)
    }

    @Test
    fun toBigIntegerValueTest() {
        assert(INT_VALUE_STRING.toBigIntegerExtNSS() == BigInteger.valueOf(12)
                && NOT_NULL_STRING.toBigIntegerExtNSS() == BigInteger.valueOf(0)
                && NULL_STRING.toBigIntegerExtNSS() == BigInteger.valueOf(0))
    }

    @Test
    fun toBigIntegerValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toBigIntegerExtNSS(DEFAULT_BIG_INTEGER_VALUE) == BigInteger.valueOf(12)
                && NOT_NULL_STRING.toBigIntegerExtNSS(DEFAULT_BIG_INTEGER_VALUE) == DEFAULT_BIG_INTEGER_VALUE
                && NULL_STRING.toBigIntegerExtNSS(DEFAULT_BIG_INTEGER_VALUE) == DEFAULT_BIG_INTEGER_VALUE)
    }

    @Test
    fun toBigDecimalValueTest() {
        assert(FLOAT_VALUE_STRING.toBigDecimalExtNSS() == BigDecimal.valueOf(12.0)
                && NOT_NULL_STRING.toBigDecimalExtNSS() == BigDecimal.valueOf(0)
                && NULL_STRING.toBigDecimalExtNSS() == BigDecimal.valueOf(0))
    }

    @Test
    fun toBigDecimalValueOrDefaultTest() {
        assert(FLOAT_VALUE_STRING.toBigDecimalOrDefaultExtNSS(DEFAULT_BIG_DECIMAL_VALUE) == BigDecimal.valueOf(12.0)
                && NOT_NULL_STRING.toBigDecimalOrDefaultExtNSS(DEFAULT_BIG_DECIMAL_VALUE) == DEFAULT_BIG_DECIMAL_VALUE
                && NULL_STRING.toBigDecimalOrDefaultExtNSS(DEFAULT_BIG_DECIMAL_VALUE) == DEFAULT_BIG_DECIMAL_VALUE)
    }

    @Test
    fun toByteValueTest() {
        assert(INT_VALUE_STRING.toByteExtNSS() == 12.toByte()
                && NOT_NULL_STRING.toByteExtNSS() == 0.toByte()
                && NULL_STRING.toByteExtNSS() == 0.toByte())
    }

    @Test
    fun toByteValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toByteOrDefaultExtNSS(DEFAULT_BYTE_VALUE) == 12.toByte()
                && NOT_NULL_STRING.toByteOrDefaultExtNSS(DEFAULT_BYTE_VALUE) == DEFAULT_BYTE_VALUE
                && NULL_STRING.toByteOrDefaultExtNSS(DEFAULT_BYTE_VALUE) == DEFAULT_BYTE_VALUE)
    }

    @Test
    fun toShortValueTest() {
        assert(INT_VALUE_STRING.toShortExtNSS() == 12.toShort()
                && NOT_NULL_STRING.toShortExtNSS() == 0.toShort()
                && NULL_STRING.toShortExtNSS() == 0.toShort())
    }

    @Test
    fun toShortValueOrDefaultTest() {
        assert(INT_VALUE_STRING.toShortOrDefaultExtNSS(DEFAULT_SHORT_VALUE) == 12.toShort()
                && NOT_NULL_STRING.toShortOrDefaultExtNSS(DEFAULT_SHORT_VALUE) == DEFAULT_SHORT_VALUE
                && NULL_STRING.toShortOrDefaultExtNSS(DEFAULT_SHORT_VALUE) == DEFAULT_SHORT_VALUE)
    }

    @Test
    fun toLongValueTest() {
        assert(INT_VALUE_STRING.toLongExtNSS() == 12.toLong()
                && NOT_NULL_STRING.toLongExtNSS() == 0.toLong()
                && NULL_STRING.toLongExtNSS() == 0.toLong())
    }

    @Test
    fun toLongValueOrDefault() {
        assert(INT_VALUE_STRING.toLongOrDefaultExtNSS(DEFAULT_LONG_VALUE) == 12.toLong()
                && NOT_NULL_STRING.toLongOrDefaultExtNSS(DEFAULT_LONG_VALUE) == DEFAULT_LONG_VALUE
                && NULL_STRING.toLongOrDefaultExtNSS(DEFAULT_LONG_VALUE) == DEFAULT_LONG_VALUE)
    }

    @Test
    fun toBooleanValueTest() {
        assert(BOOLEAN_VALUE_STRING.toBooleanExtNSS() && !NOT_NULL_STRING.toBooleanExtNSS() && !NULL_STRING.toBooleanExtNSS())
    }

    @Test
    fun toBooleanValueOrDefaultTest() {
        assert(BOOLEAN_VALUE_STRING.toBooleanOrDefaultExtNSS(false) && !NOT_NULL_STRING.toBooleanOrDefaultExtNSS(true) && NULL_STRING.toBooleanOrDefaultExtNSS(true))
    }

    @Test
    fun stringArrayTest(){
        assert(extNSSStringArray(BOOLEAN_VALUE_STRING, NOT_NULL_STRING) == arrayListOf(BOOLEAN_VALUE_STRING, NOT_NULL_STRING))
    }


}