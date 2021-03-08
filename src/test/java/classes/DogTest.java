package Class;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Before
    public void setUp() throws Exception {
    }



    @Test
    public void eat() {
        System.out.println("This is the testcase in this class");
        String str1="eating";
        assertEquals("eating", str1);

    }

    @Test
    public void bark() {
        System.out.println("This is the testcase in this class");
        String str1="bark";
        assertEquals("bark", str1);

    }
    @After
    public void tearDown() throws Exception {
    }
}