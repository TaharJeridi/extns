package it.tjeridi.extns

import it.tjeridi.extns.extension.extNSBDNotNullOrDefault
import it.tjeridi.extns.extension.extNSBDNotNullOrZero
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
        assert(NULL_BIG_DECIMAL_VALUE.extNSBDNotNullOrZero() == zeroBigDecimalValue()
                && NOT_NULL_BIG_DECIMAL_VALUE.extNSBDNotNullOrZero() == NOT_NULL_BIG_DECIMAL_VALUE)
    }

    @Test
    fun notNullOrDefaultTest() {
        assert(NULL_BIG_DECIMAL_VALUE.extNSBDNotNullOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == DEFAULT_BIG_DECIMAL_VALUE
                && NOT_NULL_BIG_DECIMAL_VALUE.extNSBDNotNullOrDefault(DEFAULT_BIG_DECIMAL_VALUE) == NOT_NULL_BIG_DECIMAL_VALUE)
    }
}