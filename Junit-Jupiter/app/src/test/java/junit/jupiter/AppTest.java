/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package junit.jupiter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class AppTest {
    Demo d1;
    @BeforeEach
    void init(){
        System.out.println("before test");
        d1 = new Demo();
    }

    @AfterEach
    void destroy(){
        System.out.println("after the test case");
    }
    @Test 
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void reverseStringTest(){
        System.out.println("actual test running");
        assertEquals("hannah",d1.reverseString("annah"));
    }
}
