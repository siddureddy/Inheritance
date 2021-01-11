package Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestInterfaceTest {

    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void print() {
        System.out.println("This is the testcase in this class");
        String str1="hello";
        assertEquals("Hello", str1);

    }
    @After
    public void tearDown() throws Exception {

    }
}