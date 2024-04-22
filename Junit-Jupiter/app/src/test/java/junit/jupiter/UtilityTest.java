package junit.jupiter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

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
    void reverseIntegerTest_supplerMethod(){
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
    void reverseString_multiple_words_supplier_interface_notEquals(){
        assertNotEquals("best si hsuknA", utility.reverseString("Ankush is best"),()->"the multiline reverse string logic is failing"); // intensionally compare the wrong value to the result so that the functionality if changes in some edge case can be found out 
    }

    @Test
    public void test(){
        String str = "Ankush";
        assertTrue(str.equals("Ankush"));
    }

    @Test
    public void testReverseBoolean(){
        assertTrue(utility.reversBoolean(false));
    }
    @Test
    public void testReverseBooleanWithAssertFalse(){
        assertFalse(utility.reversBoolean(true));
    }
    @Test
    public void testArrays(){
        int expected[] = {2,4,6,8};
        int actual[] = {8,2,6,4};
        Arrays.sort(actual);
        // assertEquals(expected, actual); // give false or test case as it matching the reference variable of the variables which are different
        assertArrayEquals(expected, actual); // matching the values inside the both arrays
    }

    @Test 
    public void sortArrayMethodTest(){
        int [] input = {5,8,6,7,3,4};
        int [] result = utility.sortArray(input); 
        int [] expected = {3,4,5,6,7,8};
        assertArrayEquals(expected, result);
    }
}
