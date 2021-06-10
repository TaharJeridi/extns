package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrMinValue
import org.junit.Test

class CharExtensionTest {

    companion object{

        private val CHAR_VALUE_NULL:Char? = null

        private const val CHAR_VALUE_NOT_NULL = '1'

        private const val DEFAULT_CHAR_VALUE = '3'

    }

    @Test
    fun notNullOrMinValueTest(){
        assert(CHAR_VALUE_NULL.notNullOrMinValue() == Char.MIN_VALUE
                && CHAR_VALUE_NOT_NULL.notNullOrMinValue() == CHAR_VALUE_NOT_NULL)
    }

    @Test
    fun notNullOrDefaultTest(){
        assert(CHAR_VALUE_NULL.notNullOrDefault(DEFAULT_CHAR_VALUE) == DEFAULT_CHAR_VALUE
                && CHAR_VALUE_NOT_NULL.notNullOrDefault(DEFAULT_CHAR_VALUE) == CHAR_VALUE_NOT_NULL)
    }
}