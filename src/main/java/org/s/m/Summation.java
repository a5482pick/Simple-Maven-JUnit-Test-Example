package src.main.java.org.s.m;  //Package org.s.m is sufficient when using Maven, not command line.

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

