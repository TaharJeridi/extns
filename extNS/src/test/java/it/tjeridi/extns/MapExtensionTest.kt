package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrNewMap
import org.junit.Test

class MapExtensionTest {

    companion object{

        private val NULL_MAP:HashMap<Int,Int>? = null

        private val NOT_NULL_MAP:HashMap<Int,Int> = hashMapOf(Pair(5,5),Pair(2,3))

        private val DEFAULT_MAP:HashMap<Int,Int> = hashMapOf(Pair(2,2),Pair(2,2))

    }

    @Test
    fun notNullOrNewMapTest(){
        assert(NULL_MAP.notNullOrNewMap().isNotNull() && NULL_MAP.notNullOrNewMap().isEmpty())
    }

    @Test
    fun notNullOrDefaultTest(){
        assert(NOT_NULL_MAP.notNullOrDefault(DEFAULT_MAP) == NOT_NULL_MAP)
    }


}