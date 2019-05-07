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


    @Test
    fun whenTheInputIsMoreThanTwoNumbersReturnSum() {
        assertEquals(13, givenAStringCalculator().add("5,2,3,3"))
    }

    @Test
    fun whenTheInputIsWithLineBreakReturnSum() {
        assertEquals(26, givenAStringCalculator().add("15\n5\n3\n3"))
    }

    @Test(expected = Exception::class)
    fun whenTheInputHaveNegativeNumberRaiseException() {
        givenAStringCalculator().add("-3,4")
    }

    @Test(expected = Exception::class)
    fun whenSeparatorIsWrong() {
        givenAStringCalculator().add("1.2")
    }


    private fun givenAStringCalculator(): StringCalculator {
        return StringCalculator()
    }

}