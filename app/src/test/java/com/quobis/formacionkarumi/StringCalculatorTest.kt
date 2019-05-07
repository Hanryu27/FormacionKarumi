package com.quobis.formacionkarumi

import junit.framework.Assert.assertEquals
import org.junit.Test

class StringCalculatorTest {

    @Test
    fun whenTheInputIsEmptyReturnZero() {
        assertEquals(0, givenAStringCalculator().add(""))
    }


    @Test
    fun whenTheInputIsJustANumberReturnSameNumber() {
        assertEquals(1, givenAStringCalculator().add("1"))
    }


    @Test
    fun whenTheInputIsTwoNumbersReturnSum() {
        assertEquals(3, givenAStringCalculator().add("1,2"))
    }


    private fun givenAStringCalculator(): StringCalculator {
        return StringCalculator()
    }

}