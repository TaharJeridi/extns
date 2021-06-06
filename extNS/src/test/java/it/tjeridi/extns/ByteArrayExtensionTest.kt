package it.tjeridi.extns

import it.tjeridi.extns.extension.isNotNull
import it.tjeridi.extns.extension.extNSBANotNullOrDefault
import it.tjeridi.extns.extension.extNSBANotNullOrNewByteArray
import org.junit.Test

class ByteArrayExtensionTest {

    companion object {

        private val NULL_BYTE_ARRAY_VALUE: ByteArray? = null

        private val NOT_NULL_BYTE_ARRAY_VALUE: ByteArray = byteArrayOf(2, 3, 4)

        private val DEFAULT_BYTE_ARRAY_VALUE: ByteArray = byteArrayOf(5, 6, 7)

    }

    @Test
    fun notNullOrNewByteArrayTest() {
        assert(NULL_BYTE_ARRAY_VALUE.extNSBANotNullOrNewByteArray(2).isNotNull()
                && NOT_NULL_BYTE_ARRAY_VALUE.extNSBANotNullOrNewByteArray(2).contentEquals(NOT_NULL_BYTE_ARRAY_VALUE))
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_BYTE_ARRAY_VALUE.extNSBANotNullOrDefault(DEFAULT_BYTE_ARRAY_VALUE).contentEquals(DEFAULT_BYTE_ARRAY_VALUE)
                && NOT_NULL_BYTE_ARRAY_VALUE.extNSBANotNullOrDefault(DEFAULT_BYTE_ARRAY_VALUE).contentEquals(NOT_NULL_BYTE_ARRAY_VALUE))
    }
}