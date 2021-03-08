package Class;


import org.junit.Test;




import static org.junit.Assert.*;

public class AnimalTest {



    @Test
    public void eat() {
        System.out.println("This is the testcase in this class");
        String str1="eating";
        assertEquals("eating", str1);

    }

}