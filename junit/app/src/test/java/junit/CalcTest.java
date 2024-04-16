package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
// import org.junit.Assert;
import org.junit.Test;
public class CalcTest {
    Calc c1 = new Calc();
    @Test
    public void testDivideMethod(){
        int result = c1.divide(10, 5);
        int expected = 2;
        assertEquals(result, expected);
        System.out.println("divide method success test case pass");

        expected = 20;
        assertNotEquals(result, expected);
        System.out.println("divide method fail test case pass");
    }

    @Test
    public void testMultiplyMethod(){
        int result = c1.multiply(2, 5);
        assertEquals(result, 10);
        System.out.println("Multiply test case pass");
    }
}
