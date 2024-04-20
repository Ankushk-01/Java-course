package junit.jupiter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class UtilityTest {
    Utility utility = new Utility();
    @Test
    void reverseStringTest_one_word(){
        assertEquals("hannah", utility.reverseString("hannah"),"The expected reverse string is not matching the actual reverse String");
        assertEquals("Ankush", utility.reverseString("hsuknA"),"The expected reverse string is not matching the actual reverse String");
        assertEquals("1234", utility.reverseString("4321"),"The expected reverse string is not matching the actual reverse String");
    }

    @Test
    void reverseIntegerTest(){
        assertEquals(4321, utility.reverseInteger(1234),"the reverse int value function is not working fine");
        assertEquals(44664321, utility.reverseInteger(12346644));
    }

    @Test
    void reverseString_multiple_words(){
        assertEquals("tseb si hsuknA", utility.reverseString("Ankush is best"),"the multiline reverse string logic is failing");
    }
}
