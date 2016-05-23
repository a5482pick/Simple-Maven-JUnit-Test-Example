package src.main.java.org.s.a;  //'package org.s.a' is sufficient when using Maven.  The longer version is needed for the command line.

public class Summation {

    public int evaluate(String expression) {
  
        int theSum = 0;
        
        //Split the string about '+', and sum the resulting numbers.
        for (String stringNum: expression.split("\\+"))   {
     
            theSum += Integer.valueOf(stringNum);
        }
        
        return theSum;
    }
}

