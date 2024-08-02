package test.kotlin

// src/test/kotlin/StringCalculatorTest.kt
import main.kotlin.StringCalculator
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class StringCalculatorTest {

    @Test
    fun `empty string should return 0`() {
        val calculator = StringCalculator()
        assertEquals(0, calculator.add(""))
    }

    @Test
    fun `single number should return its value`() {
        val calculator = StringCalculator()
        assertEquals(1, calculator.add("1"))
    }

    @Test
    fun `two numbers should return their sum`() {
        val calculator = StringCalculator()
        assertEquals(3, calculator.add("1,2"))
    }

    @Test
    fun `multiple numbers should return their sum`() {
        val calculator = StringCalculator()
        assertEquals(10, calculator.add("1,2,3,4"))
    }

    @Test
    fun `new lines between numbers should be handled`() {
        val calculator = StringCalculator()
        assertEquals(6, calculator.add("1\n2,3"))
    }

    @Test
    fun `negative numbers should throw exception`() {
        val calculator = StringCalculator()
        val exception = assertThrows<IllegalArgumentException> {
            calculator.add("1,-2,3")
        }
        assertEquals("negative numbers not allowed: -2", exception.message)
    }

    @Test
    fun `multiple negative numbers should be reported in exception`() {
        val calculator = StringCalculator()
        val exception = assertThrows<IllegalArgumentException> {
            calculator.add("1,-2,-3")
        }
        assertEquals("negative numbers not allowed: -2, -3", exception.message)
    }
}
