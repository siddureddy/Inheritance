package classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add() {
//positive testcase
        assertEquals("error in add()",  3, Adder.add(1, 2));
        assertEquals("error in add()", -3, Adder.add(-1, -2));
        assertEquals("error in add()",  9, Adder.add(9, 0));
  //negative testcase
        assertNotEquals("error in add()", 0, Adder.add(1, 2));
    }

    @Test
    public void add1() {
        assertEquals("error in add()",  5, Adder.add(1, 2,2));
        assertEquals("error in add()", -5, Adder.add(-1, -2,-2));
        assertEquals("error in add()",  12, Adder.add(9, 0,3));
        assertNotEquals("error in add()", 0, Adder.add(1, 2));

    }
}

