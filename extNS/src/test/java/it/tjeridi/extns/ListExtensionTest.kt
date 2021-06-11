package it.tjeridi.extns

import it.tjeridi.extns.extension.*
import org.junit.Test

class ListExtensionTest {

    companion object {

        private val NULL_LIST: List<Int>? = null

        private val LIST_NOT_NULL: List<Int> = listOf(1, 2, 3)

        private val DEFAULT_LIST: List<Int> = listOf(4, 5, 6)
    }

    @Test
    fun notNullOrNewArrayListTest() {
        assert(
            NULL_LIST.notNullOrNewArrayList().isNotNull() && LIST_NOT_NULL.notNullOrNewArrayList()
                .containsAll(LIST_NOT_NULL)
        )
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(
            NULL_LIST.notNullOrDefault(DEFAULT_LIST)
                .containsAll(DEFAULT_LIST) && LIST_NOT_NULL.notNullOrDefault(DEFAULT_LIST)
                .containsAll(LIST_NOT_NULL)
        )
    }

    @Test
    fun safeSubListTest() {
        assert(
            NULL_LIST.safeSubList(0, 5).containsAll(emptyList())
                    && LIST_NOT_NULL.safeSubList(0, 1).containsAll(LIST_NOT_NULL.subList(0, 1))
                    && LIST_NOT_NULL.safeSubList(0, 500).containsAll(LIST_NOT_NULL)
        )
    }

    @Test
    fun safeSwapTest() {
        NULL_LIST.safeSwap(2, 4)
        LIST_NOT_NULL.safeSwap(0, 200)
        DEFAULT_LIST.safeSwap(0, 2)
        assert(
            NULL_LIST.isNull()
                    && LIST_NOT_NULL.indexOf(2) == 1
                    && DEFAULT_LIST.indexOf(4) == 2
                    && DEFAULT_LIST.indexOf(6) == 0
        )
    }

}