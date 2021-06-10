package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.notNullOrDefaultValue
import it.tjeridi.extns.extension.notNullOrNewObject
import org.junit.Test

class ObjectExtensionTest {

    companion object{

        private val OBJECT_NULL:Any? = null

        private val OBJECT_NOT_NULL = Any()
    }

    @Test
    fun notNullOrNewObjectTest(){
        assert(OBJECT_NULL.notNullOrNewObject().isNotNull())
    }

    @Test
    fun notNullOrDefaultValueTest(){
        assert(OBJECT_NULL.notNullOrDefaultValue(OBJECT_NOT_NULL) == OBJECT_NOT_NULL)
    }
}