package it.tjeridi.extns

import it.tjeridi.extns.extension.extNSSHNotNullOrDefault
import it.tjeridi.extns.extension.extNSSHNotNullOrMinValue
import org.junit.Test

class ShortExtensionTest {

    companion object{

        val SHORT_VALUE_NULL:Short? = null

    }

    @Test
    fun notNullOrMinValueTest(){
        assert(SHORT_VALUE_NULL.extNSSHNotNullOrMinValue() == Short.MIN_VALUE)
    }

    @Test
    fun notNullOrDefaultTest(){
        assert(SHORT_VALUE_NULL.extNSSHNotNullOrDefault(Short.MAX_VALUE) == Short.MAX_VALUE)
    }
}