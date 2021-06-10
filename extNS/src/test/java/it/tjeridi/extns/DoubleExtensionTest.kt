package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrZero
import org.junit.Test

class DoubleExtensionTest {

    companion object {

        private val DOUBLE_VALUE_NULL: Double? = null

        private const val DOUBLE_VALUE_NOT_NULL = 2.0

        private const val DEFAULT_VALUE_DOUBLE = 33.0

    }


    @Test
    fun notNullOrZeroTest() {
        assert(DOUBLE_VALUE_NULL.notNullOrZero() == 0.0
                && DOUBLE_VALUE_NOT_NULL.notNullOrZero() == DOUBLE_VALUE_NOT_NULL)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(DOUBLE_VALUE_NULL.notNullOrDefault(DEFAULT_VALUE_DOUBLE) == DEFAULT_VALUE_DOUBLE
                && DOUBLE_VALUE_NOT_NULL.notNullOrDefault(DEFAULT_VALUE_DOUBLE) == DOUBLE_VALUE_NOT_NULL)
    }
}