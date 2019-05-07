package com.quobis.formacionkarumi

import junit.framework.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {

    @Test
    fun whenTheInputIsEmptyReturnZero() {
        assertEquals(0, givenAStringCalculator().add(""))
    }


    private fun givenAStringCalculator(): StringCalculator {
        return StringCalculator()
    }

}