package it.tjeridi.extns

import it.tjeridi.extns.extension.*
import org.junit.Test

class CharSequenceExtensionTest {

    companion object {

        private val NULL_CHAR_SEQUENCE_VALUE: CharSequence? = null

        private val NOT_NULL_CHAR_SEQUENCE_VALUE: CharSequence = "sssssdddddd"

        private val DEFAULT_CHAR_SEQUENCE_VALUE: CharSequence = "llllllppppppaaaaaa"

    }

    @Test
    fun notNullOrEmptyStringTest() {
        assert(
            NULL_CHAR_SEQUENCE_VALUE.notNullOrEmptyString() == emptyString()
                    && NOT_NULL_CHAR_SEQUENCE_VALUE.notNullOrEmptyString() == NOT_NULL_CHAR_SEQUENCE_VALUE
        )
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(
            NULL_CHAR_SEQUENCE_VALUE.notNullOrDefault(DEFAULT_CHAR_SEQUENCE_VALUE) == DEFAULT_CHAR_SEQUENCE_VALUE
                    && NOT_NULL_CHAR_SEQUENCE_VALUE.notNullOrDefault(DEFAULT_CHAR_SEQUENCE_VALUE) == NOT_NULL_CHAR_SEQUENCE_VALUE
        )
    }

    @Test
    fun toSafeStringTest(){
        assert(NULL_CHAR_SEQUENCE_VALUE.toSafeString() == emptyString()
                && NOT_NULL_CHAR_SEQUENCE_VALUE.toSafeString() == NOT_NULL_CHAR_SEQUENCE_VALUE.toString())
    }

    @Test
    fun toSafeStringOrDefaultTest(){
        assert(NULL_CHAR_SEQUENCE_VALUE.toSafeStringOrDefault(DEFAULT_CHAR_SEQUENCE_VALUE) == DEFAULT_CHAR_SEQUENCE_VALUE
                && NOT_NULL_CHAR_SEQUENCE_VALUE.toSafeStringOrDefault(DEFAULT_CHAR_SEQUENCE_VALUE) == NOT_NULL_CHAR_SEQUENCE_VALUE)
    }


}