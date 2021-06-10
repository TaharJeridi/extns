package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrZero
import it.tjeridi.extns.extension.zeroByteValue
import org.junit.Test

class ByteExtensionTest {

    companion object {

        private val BYTE_NULL_VALUE: Byte? = null

        private const val BYTE_NOT_NULL_VALUE: Byte = 2.toByte()

        private const val DEFAULT_BYTE_VALUE = 3.toByte()


    }

    @Test
    fun notNullOrZeroTest() {
        assert(BYTE_NULL_VALUE.notNullOrZero() == zeroByteValue() && BYTE_NOT_NULL_VALUE.notNullOrZero() == BYTE_NOT_NULL_VALUE)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(BYTE_NULL_VALUE.notNullOrDefault(DEFAULT_BYTE_VALUE) == DEFAULT_BYTE_VALUE
                && BYTE_NOT_NULL_VALUE.notNullOrDefault(DEFAULT_BYTE_VALUE) == BYTE_NOT_NULL_VALUE)
    }
}