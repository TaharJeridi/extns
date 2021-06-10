package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrZero
import it.tjeridi.extns.extension.notNullOrDefault
import org.junit.Test

class FloatExtensionTest {

    companion object {

        private const val FLOAT_VALUE_NOT_NULL = 3.0F

        private val FLOAT_VALUE_NULL: Float? = null

        private const val DEFAULT_VALUE_FLOAT = 10.0F

    }

    @Test
    fun notNullOrZeroTest() {
        assert(FLOAT_VALUE_NULL.notNullOrZero() == 0F
                && FLOAT_VALUE_NOT_NULL.notNullOrZero() == FLOAT_VALUE_NOT_NULL)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(FLOAT_VALUE_NULL.notNullOrDefault(DEFAULT_VALUE_FLOAT) == DEFAULT_VALUE_FLOAT
                && FLOAT_VALUE_NOT_NULL.notNullOrDefault(DEFAULT_VALUE_FLOAT) == FLOAT_VALUE_NOT_NULL)
    }
}