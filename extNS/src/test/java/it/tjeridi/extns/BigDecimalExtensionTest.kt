package it.tjeridi.extns

import it.tjeridi.extns.extension.notNullOrDefault
import it.tjeridi.extns.extension.notNullOrZero
import it.tjeridi.extns.extension.zeroBigDecimalValue
import org.junit.Test
import java.math.BigDecimal

class BigDecimalExtensionTest {

    companion object {

        private val NULL_BIG_DECIMAL_VALUE: BigDecimal? = null

        private val NOT_NULL_BIG_DECIMAL_VALUE = BigDecimal.valueOf(2.0)

        private val DEFAULT_BIG_DECIMAL_VALUE = BigDecimal.valueOf(3.0)

    }

    @Test
    fun notNullOrZeroTest() {
        assert(NULL_BIG_DECIMAL_VALUE.notNullOrZero() == zeroBigDecimalValue()
                && NOT_NULL_BIG_DECIMAL_VALUE.notNullOrZero() == NOT_NULL_BIG_DECIMAL_VALUE)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_BIG_DECIMAL_VALUE.notNullOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == DEFAULT_BIG_DECIMAL_VALUE
                && NOT_NULL_BIG_DECIMAL_VALUE.notNullOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == NOT_NULL_BIG_DECIMAL_VALUE)
    }
}