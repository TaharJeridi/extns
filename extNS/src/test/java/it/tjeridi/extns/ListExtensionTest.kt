package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrNewArrayList
import org.junit.Test

class ListExtensionTest {

    companion object {

        private val NULL_LIST: List<Int>? = null

        private val LIST_NOT_NULL: List<Int> = listOf(1, 2, 3)

        private val DEFAULT_LIST: List<Int> = listOf(4, 5, 6)
    }

    @Test
    fun notNullOrNewArrayListTest() {
        assert(NULL_LIST.notNullOrNewArrayList().isNotNull() && LIST_NOT_NULL.notNullOrNewArrayList().containsAll(LIST_NOT_NULL))
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_LIST.notNullOrDefault(DEFAULT_LIST).containsAll(DEFAULT_LIST) && LIST_NOT_NULL.notNullOrDefault(DEFAULT_LIST).containsAll(LIST_NOT_NULL))
    }

}