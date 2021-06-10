package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrMinValue
import org.junit.Test

class ShortExtensionTest {

    companion object{

        val SHORT_VALUE_NULL:Short? = null

    }

    @Test
    fun notNullOrMinValueTest(){
        assert(SHORT_VALUE_NULL.notNullOrMinValue() == Short.MIN_VALUE)
    }

    @Test
    fun notNullOrDefaultTest(){
        assert(SHORT_VALUE_NULL.notNullOrDefault(Short.MAX_VALUE) == Short.MAX_VALUE)
    }
}