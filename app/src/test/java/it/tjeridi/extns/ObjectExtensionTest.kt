package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.extNSOBJNotNullOrDefaultValue
import it.tjeridi.extns.extension.extNSOBJNotNullOrNewObject
import org.junit.Test

class ObjectExtensionTest {

    companion object{

        private val OBJECT_NULL:Any? = null

        private val OBJECT_NOT_NULL = Any()
    }

    @Test
    fun notNullOrNewObjectTest(){
        assert(OBJECT_NULL.extNSOBJNotNullOrNewObject().isNotNull())
    }

    @Test
    fun notNullOrDefaultValueTest(){
        assert(OBJECT_NULL.extNSOBJNotNullOrDefaultValue(OBJECT_NOT_NULL) == OBJECT_NOT_NULL)
    }
}