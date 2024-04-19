package junit.jupiter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class UtilityTest {
    Utility utility = new Utility();
    @Test
    void reverseStringTest(){
        assertEquals("hannah", utility.reverseString("hannah"));
        assertEquals("Ankush", utility.reverseString("hsuknA"));
        assertEquals("1234", utility.reverseString("4321"));
    }

    @Test
    void reverseIntegerTest(){
        assertEquals(4321, utility.reverseInteger(1234));
        assertEquals(44664321, utility.reverseInteger(12346644));
    }
}
