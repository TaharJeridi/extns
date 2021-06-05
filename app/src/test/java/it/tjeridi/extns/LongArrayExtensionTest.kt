package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.extNSLANotNullOrDefaultValue
import it.tjeridi.extns.extension.extNSLANotNullOrNewLongArray
import org.junit.Test

class LongArrayExtensionTest {

    companion object {

        private val LONG_ARRAY_NULL: LongArray? = null

        private val LONG_ARRAY_DEFAULT: LongArray = longArrayOf(2, 3)

        private val LONG_ARRAY: LongArray = longArrayOf(4, 5)

    }

    @Test
    fun notNullOrNewArrayTest() {
        assert(LONG_ARRAY_NULL.extNSLANotNullOrNewLongArray(2).isNotNull() && LONG_ARRAY.extNSLANotNullOrNewLongArray(2).contentEquals(LONG_ARRAY))
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(LONG_ARRAY_NULL.extNSLANotNullOrDefaultValue(LONG_ARRAY_DEFAULT).contentEquals(LONG_ARRAY_DEFAULT) && LONG_ARRAY.extNSLANotNullOrDefaultValue(LONG_ARRAY_DEFAULT).contentEquals(LONG_ARRAY))
    }


}