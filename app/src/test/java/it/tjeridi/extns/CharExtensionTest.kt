package it.tjeridi.extns

import it.tjeridi.extns.extension.extNSCRNotNullOrDefault
import it.tjeridi.extns.extension.extNSCRNotNullOrMinValue
import org.junit.Test

class CharExtensionTest {

    companion object{

        private val CHAR_VALUE_NULL:Char? = null

        private const val CHAR_VALUE_NOT_NULL = '1'

        private const val DEFAULT_CHAR_VALUE = '3'

    }

    @Test
    fun notNullOrMinValueTest(){
        assert(CHAR_VALUE_NULL.extNSCRNotNullOrMinValue() == Char.MIN_VALUE
                && CHAR_VALUE_NOT_NULL.extNSCRNotNullOrMinValue() == CHAR_VALUE_NOT_NULL)
    }

    @Test
    fun notNullOrDefaultTest(){
        assert(CHAR_VALUE_NULL.extNSCRNotNullOrDefault(DEFAULT_CHAR_VALUE) == DEFAULT_CHAR_VALUE
                && CHAR_VALUE_NOT_NULL.extNSCRNotNullOrDefault(DEFAULT_CHAR_VALUE) == CHAR_VALUE_NOT_NULL)
    }
}