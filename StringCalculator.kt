package main.kotlin

// src/main/kotlin/StringCalculator.kt
class StringCalculator {

    fun add(numbers: String): Int {
        if (numbers.isEmpty()) return 0
        // Check for custom delimiter
        val (delimiter, numbersPart) = if (numbers.startsWith("//")) {
            val delimiterIndex = numbers.indexOf('\n')
            val delimiter = numbers.substring(2, delimiterIndex)
            val numbersPart = numbers.substring(delimiterIndex + 1)
            delimiter to numbersPart
        } else {
            "," to numbers
        }

        // Split using the delimiter and convert to integers
        val numList = numbers.split(delimiter, "\n").map { it.toInt() }

        // Check for negative numbers
        val negatives = numList.filter { it < 0 }
        if (negatives.isNotEmpty()) {
            throw IllegalArgumentException("negative numbers not allowed: ${negatives.joinToString(", ")}")
        }

        return numList.sum()
    }
}
