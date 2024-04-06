package utils

import org.example.utils.helper
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class helperTest {

    @Test
    fun isPalindrome() {
        //arrange
        val Helper=helper()
        //act
        val result=Helper.isPalindrome("hello")

        //assert
        assertEquals(false,result)
    }
}