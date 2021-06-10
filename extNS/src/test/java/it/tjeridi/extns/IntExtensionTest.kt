package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrZero
import org.junit.Test

class IntExtensionTest {

    companion object {

        private const val NOT_NULL_INT: Int = 2

        private val NULL_INT: Int? = null

        private const val DEFAULT_VALUE_INT = 3

    }

    @Test
    fun notNullOrZeroTest() {
        assert(NULL_INT.notNullOrZero() == 0 && NOT_NULL_INT.notNullOrZero() == NOT_NULL_INT)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_INT.notNullOrDefault(DEFAULT_VALUE_INT) == DEFAULT_VALUE_INT && NOT_NULL_INT.notNullOrDefault(DEFAULT_VALUE_INT) == NOT_NULL_INT)
    }
}