package src.test.java.org.s.a;  //'package org.s.a' is sufficient when using Maven.  The longer version is needed for the command line.

import src.main.java.org.s.a.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SummationTest {
  
    @Test
    public void getTheTotal() {
  
        Summation sum = new Summation();
        int total = sum.evaluate("5+5");
        
        //Change '10' to '9' to witness failure.
        assertEquals(10, total);
    }
}
