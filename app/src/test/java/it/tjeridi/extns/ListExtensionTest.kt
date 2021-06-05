package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.extNSListNotNullOrDefault
import it.tjeridi.extns.extension.extNSListNotNullOrNewArrayList
import org.junit.Test

class ListExtensionTest {

    companion object {

        private val NULL_LIST: List<Int>? = null

        private val LIST_NOT_NULL: List<Int> = listOf(1, 2, 3)

        private val DEFAULT_LIST: List<Int> = listOf(4, 5, 6)
    }

    @Test
    fun notNullOrNewArrayListTest() {
        assert(NULL_LIST.extNSListNotNullOrNewArrayList().isNotNull() && LIST_NOT_NULL.extNSListNotNullOrNewArrayList().containsAll(LIST_NOT_NULL))
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_LIST.extNSListNotNullOrDefault(DEFAULT_LIST).containsAll(DEFAULT_LIST) && LIST_NOT_NULL.extNSListNotNullOrDefault(DEFAULT_LIST).containsAll(LIST_NOT_NULL))
    }

}