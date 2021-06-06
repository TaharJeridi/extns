package it.tjeridi.extns

import it.tjeridi.extns.extension.extNSBLNotNullOrDefault
import it.tjeridi.extns.extension.extNSBLNotNullOrFalse
import it.tjeridi.extns.extension.extNSBLNotNullOrTrue
import org.junit.Test

class BooleanExtensionTest {

    companion object {

        private val NULL_BOOLEAN_VALUE: Boolean? = null

        private const val NOT_NULL_FALSE_BOOLEAN_VALUE = false

        private const val NOT_NULL_TRUE_BOOLEAN_VALUE = true

        private const val DEFAULT_BOOLEAN_VALUE = true
    }

    @Test
    fun notNullOrFalseTest() {
        assert(!NULL_BOOLEAN_VALUE.extNSBLNotNullOrFalse()
                && NOT_NULL_TRUE_BOOLEAN_VALUE.extNSBLNotNullOrFalse() == NOT_NULL_TRUE_BOOLEAN_VALUE)
    }

    @Test
    fun notNullOrTrueTest() {
        assert(NULL_BOOLEAN_VALUE.extNSBLNotNullOrTrue()
                && NOT_NULL_FALSE_BOOLEAN_VALUE.extNSBLNotNullOrTrue() == NOT_NULL_FALSE_BOOLEAN_VALUE)
    }

    @Test
    fun notNullOrDefaultValue() {
        assert(NULL_BOOLEAN_VALUE.extNSBLNotNullOrDefault(DEFAULT_BOOLEAN_VALUE) == DEFAULT_BOOLEAN_VALUE
                && NOT_NULL_FALSE_BOOLEAN_VALUE.extNSBLNotNullOrDefault(DEFAULT_BOOLEAN_VALUE) == NOT_NULL_FALSE_BOOLEAN_VALUE)
    }
}