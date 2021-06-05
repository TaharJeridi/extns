package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.extNSCANotNullOrDefault
import it.tjeridi.extns.extension.extNSCANotNullOrNewCharArray
import org.junit.Test

class CharArrayExtensionTest {

    companion object {

        private val CHAR_ARRAY_NULL: CharArray? = null

        private val CHAR_ARRAY_NOT_NULL: CharArray = charArrayOf('1', '2', '3')

        private val DEFAULT_CHAR_ARRAY: CharArray = charArrayOf('4', '5', '6')

    }

    @Test
    fun notNullOrNewCharArrayTest() {
        assert(CHAR_ARRAY_NULL.extNSCANotNullOrNewCharArray(2).isNotNull() && CHAR_ARRAY_NOT_NULL.extNSCANotNullOrNewCharArray(2).contentEquals(CHAR_ARRAY_NOT_NULL))
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(CHAR_ARRAY_NULL.extNSCANotNullOrDefault(DEFAULT_CHAR_ARRAY).contentEquals(DEFAULT_CHAR_ARRAY)
                && CHAR_ARRAY_NOT_NULL.extNSCANotNullOrDefault(DEFAULT_CHAR_ARRAY).contentEquals(CHAR_ARRAY_NOT_NULL))
    }

}