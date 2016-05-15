A simple example of testing with JUnit, while using Maven.  Put pom.xml and 'src' directory in the same new directory.  The commands 
1. _mvn clean install_ 
2. _mvn test_ 
will perform the test operation when issued from this new directory.

To see 'failure' in action, change _assertEquals(10, total);_ in src/test/java/org/s/m/SummationTest.java to e.g. _assertEquals(9, total);_. &nbsp;  Why?  Because method _public int evaluate(String expression)_ in src/main/java/org/s/m/Summation.java returns 10 for "5+5", not 9.
