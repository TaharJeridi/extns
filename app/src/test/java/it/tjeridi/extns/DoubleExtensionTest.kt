package it.tjeridi.extns

import it.tjeridi.extns.extension.extNSDBNotNullOrDefault
import it.tjeridi.extns.extension.extNSDBNotNullOrZero
import org.junit.Test

class DoubleExtensionTest {

    companion object {

        private val DOUBLE_VALUE_NULL: Double? = null

        private const val DOUBLE_VALUE_NOT_NULL = 2.0

        private const val DEFAULT_VALUE_DOUBLE = 33.0

    }


    @Test
    fun notNullOrZeroTest() {
        assert(DOUBLE_VALUE_NULL.extNSDBNotNullOrZero() == 0.0
                && DOUBLE_VALUE_NOT_NULL.extNSDBNotNullOrZero() == DOUBLE_VALUE_NOT_NULL)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(DOUBLE_VALUE_NULL.extNSDBNotNullOrDefault(DEFAULT_VALUE_DOUBLE) == DEFAULT_VALUE_DOUBLE
                && DOUBLE_VALUE_NOT_NULL.extNSDBNotNullOrDefault(DEFAULT_VALUE_DOUBLE) == DOUBLE_VALUE_NOT_NULL)
    }
}