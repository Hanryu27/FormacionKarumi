package com.quobis.formacionkarumi

class StringCalculator {

    fun add(numbers: String): Int {
        return if (numbers.isEmpty()) {
            0
        } else {
            if (numbers.length > 1) {
                val filteredNumbers = numbers.split(Regex("[,|^\n]"))
                if (filteredNumbers.isEmpty()) {
                    throw Exception("Delimiter is not correct")
                } else {
                    filteredNumbers.sumBy { number ->
                        if (number.toInt() < 0) {
                            throw Exception("Negatives not allowed")
                        } else {
                            number.toInt()
                        }
                    }
                }

            } else {
                return numbers.toInt()
            }


        }
    }
}