package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrZero
import org.junit.Test

class LongExtensionTest {

    companion object {

        private val LONG_NULL_VALUE: Long? = null

        private const val LONG_VALUE_NOT_NULL = 2.toLong()

        private const val DEFAULT_LONG_VALUE = 3.toLong()
    }

    @Test
    fun notNullOrZero() {
        assert(LONG_NULL_VALUE.notNullOrZero() == 0L && LONG_VALUE_NOT_NULL.notNullOrZero() == LONG_VALUE_NOT_NULL)
    }

    @Test
    fun notNullOrDefault() {
        assert(LONG_NULL_VALUE.notNullOrDefault(DEFAULT_LONG_VALUE) == 3.toLong())
    }
}