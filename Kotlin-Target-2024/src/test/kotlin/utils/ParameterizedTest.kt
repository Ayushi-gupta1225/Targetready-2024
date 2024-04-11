package utils

import org.example.utils.helper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

//import org.junit.jupiter.api.Assertions.assertEquals

class ParameterizedTest {
    private val Helper = helper()

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
        Assertions.assertEquals(expected, Helper.isPalindrome(input))
    }

}

//@RunWith(value=Parameterized::class)
//class ParameterizedTest (val input:String , val expectedval:Boolean) {
//    @Test
//    fun test() {
//        val Helper = helper()
//
//        val result = Helper.isPalindrome(input)
//        assertEquals(expectedval, result)
//    }
//    companion object{
//        @JvmStatic
//        @Parameterized.Parameters
//        fun data(): List<Array<Any>>{
//            return listOf(
//                arrayOf("hello",false),
//                arrayOf("level",true),
//                arrayOf("a" ,true)
//            )
//        }
//    }
//}


//, here database configs is an object of class DatabaseConfigs w
//hich include url , username , password , uniique key  and list
//of ids to compare two database which are on postgre

