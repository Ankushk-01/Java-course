package junit.jupiter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void reverseIntegerTest(){
        assertEquals(4321, utility.reverseInteger(1234),()->"the reverse int value function is not working fine");
        assertEquals(44664321, utility.reverseInteger(12346644));
    }

    @Test
    void reverseString_multiple_words(){
        assertEquals("tseb si hsuknA", utility.reverseString("Ankush is best"),"the multiline reverse string logic is failing");
        // it evaluate the comment in each case it can be pass and fail
    }
    @Test
    void reverseString_multiple_words_supplier_interface(){
        assertEquals("tseb si hsuknA", utility.reverseString("Ankush is best"),()->"the multiline reverse string logic is failing"); // supplier interface 
        // it evaluate the comment only when the test case is fails
    }
    @Test
    void reverseString_multiple_words_supplier_interface(){
        assertNotEquals("best si hsuknA", utility.reverseString("Ankush is best"),()->"the multiline reverse string logic is failing"); // intensionally compare the wrong value to the result so that the functionality if changes in some edge case can be found out 
    }

    @Test

    public void test(){
        String str = "Ankush";
        assertTrue(str.equals("Ankush"));
    }
}
