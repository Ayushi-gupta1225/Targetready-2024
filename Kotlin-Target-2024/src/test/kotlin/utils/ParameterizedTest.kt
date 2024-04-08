package utils

//import org.junit.jupiter.api.Assertions.assertEquals
import org.example.utils.helper
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


@RunWith(value=Parameterized::class)
class ParameterizedTest (val input:String , val expectedval:Boolean) {
    @Test
    fun test() {
        val Helper = helper()

        val result = Helper.isPalindrome(input)
        assertEquals(expectedval, result)
    }
    companion object{
        @JvmStatic
        @Parameterized.Parameters
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("a" ,true)
            )
        }
    }
}