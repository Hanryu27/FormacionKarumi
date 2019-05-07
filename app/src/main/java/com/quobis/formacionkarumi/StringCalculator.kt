package com.quobis.formacionkarumi

class StringCalculator {

    public fun add(numbers: String): Int {
        return if (numbers.isEmpty()) {
            0
        } else {
            numbers.split(Regex("[,|^\n]")).sumBy { it.toInt() }
        }
    }
}