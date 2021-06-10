package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrNewCharArray
import org.junit.Test

class CharArrayExtensionTest {

    companion object {

        private val CHAR_ARRAY_NULL: CharArray? = null

        private val CHAR_ARRAY_NOT_NULL: CharArray = charArrayOf('1', '2', '3')

        private val DEFAULT_CHAR_ARRAY: CharArray = charArrayOf('4', '5', '6')

    }

    @Test
    fun notNullOrNewCharArrayTest() {
        assert(CHAR_ARRAY_NULL.notNullOrNewCharArray(2).isNotNull() && CHAR_ARRAY_NOT_NULL.notNullOrNewCharArray(2).contentEquals(CHAR_ARRAY_NOT_NULL))
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(CHAR_ARRAY_NULL.notNullOrDefault(DEFAULT_CHAR_ARRAY).contentEquals(DEFAULT_CHAR_ARRAY)
                && CHAR_ARRAY_NOT_NULL.notNullOrDefault(DEFAULT_CHAR_ARRAY).contentEquals(CHAR_ARRAY_NOT_NULL))
    }

}