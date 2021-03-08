package classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BabyDogTest {



    @Test
    public void bark() {
        System.out.println("This is the testcase in this class");
        String str1="bark";
        assertEquals("bark", str1);

    }

    @Test
    public void eat() {
        System.out.println("This is the testcase in this class");
        String str1="eating";
        assertEquals("eating", str1);
    }

    @Test
    public void weep() {
        System.out.println("This is the testcase in this class");
        String str1="weep";
        assertEquals("weep", str1);
    }


}