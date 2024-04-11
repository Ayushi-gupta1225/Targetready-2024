package co.vinod.tests

import co.vinod.utils.Helper
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class HelperTest {
    private val helper = Helper()

    @ParameterizedTest(name = "{0} is palindrome: {1}")
    @CsvSource(
        "radar, true",
        "level, true",
        "hello, false",
        "racecar, true",
        "noon, true",
        "abcd, false",
        "'', true" // empty string is considered palindrome
    )
    fun testIsPalindrome(input: String, expected: Boolean) {
        assertEquals(expected, helper.isPalindrome(input))
    }

}