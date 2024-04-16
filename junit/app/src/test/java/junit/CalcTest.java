package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

// import org.junit.Assert;
import org.junit.Test;
public class CalcTest {
    @Test
    public void testDivideMethod(){
        Calc c1 = new Calc();
        int result = c1.divide(10, 5);
        int expected = 2;
        assertEquals(result, expected);
        System.out.println("divide method success test case pass");

        expected = 20;
        assertNotEquals(result, expected);
        System.out.println("divide method fail test case pass");
    }
}
