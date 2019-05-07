package com.quobis.formacionkarumi

class StringCalculator {

    fun add(numbers: String): Int {
        return if (numbers.isEmpty()) {
            0
        } else {
            numbers.split(Regex("[,|^\n]")).sumBy { number ->
                if (number.toInt() < 0) {
                    throw Exception("Negatives not allowed")
                } else {
                    number.toInt()
                }
            }
        }
    }
}