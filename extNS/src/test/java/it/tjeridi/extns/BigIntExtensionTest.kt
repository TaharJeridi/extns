package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrZero
import org.junit.Test
import java.math.BigInteger

class BigIntExtensionTest {

    companion object {

        private val NULL_VALUE_BIG_INT: BigInteger? = null

        private val NOT_NULL_VALUE_BIG_INT = BigInteger.valueOf(1)

        private val DEFAULT_BIG_INT_VALUE = BigInteger.valueOf(3)

    }

    @Test
    fun notNullOrZeroTest() {
        assert(NULL_VALUE_BIG_INT.notNullOrZero() == BigInteger.ZERO
                && NOT_NULL_VALUE_BIG_INT.notNullOrZero() == NOT_NULL_VALUE_BIG_INT)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_VALUE_BIG_INT.notNullOrDefault(DEFAULT_BIG_INT_VALUE) == DEFAULT_BIG_INT_VALUE
                && NOT_NULL_VALUE_BIG_INT.notNullOrDefault(DEFAULT_BIG_INT_VALUE) == NOT_NULL_VALUE_BIG_INT)
    }
}