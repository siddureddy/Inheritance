package classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {


    @Test
    public void eat() {
        System.out.println("This is the testcase in this class");
        String str1 = "eating";
        assertEquals("eating", str1);

    }

    @Test
    public void meow() {
        System.out.println("This is the testcase in this class");
        String str1 = "meow";
        assertEquals("meow", str1);

    }
}
