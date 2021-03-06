**_A simple example of testing with JUnit, using either Maven or the linux command line_**.  

**_(Using Maven:)_***

*note:  Package _org.s.a_ can be used as the package in the class definitions when running the test with Maven.  &nbsp; However, the full package name _src.main.java.org.s.a_ is used because the test is required to run from the command line too.

Put pom.xml and 'src' directory in the same new directory.  &nbsp;The commands 
1. _mvn clean install_ &nbsp;
2. _mvn test_ &nbsp;
will perform the test operation when issued from this new directory.&nbsp;

To see 'failure' in action, change _assertEquals(10, total);_ in file _src/test/java/org/s/a/SummationTest.java_ to e.g. _assertEquals(9, total);_. &nbsp;  Why?  &nbsp;Because method _public int evaluate(String expression)_ in file _src/main/java/org/s/a/Summation.java_ returns 10 for "5+5", not 9.&nbsp;

To avoid using _import src.main.java.org.s.a.*;_ in _SummationTest.java_, declare both _Summation.java_ and _SummationTest.java_ as being in the same package (or both of no package). &nbsp; 

-----------------------

**_(Using the command line:)_**

(The following demonstrates the process for the relatively general situation of having the testing file and the tested file in different directories/packages...)

**Method 1**
The 3 commands:

1.  _javac src/main/java/org/s/a/Summation.java_
2.  _javac -cp /home/USRNAME/Downloads/junit-4.12.jar:. src/test/java/org/s/a/SummationTest.java_
3.  _java -cp /home/USRNAME/Downloads/junit-4.12.jar:/home/USRNAME/Downloads/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore src.test.java.org.s.a.SummationTest_

will perform compile and run when:

1.  You are in the directory with pom.xml and the 'src' root.
2.  The test file is located in _src/test/java/org/s/a/SummationTest.java_.
3.  The tested file is located in _src/main/java/org/s/a/Summation.java_.
4.  _junit-4.12.jar_ and _hamcrest-core-1.3.jar_ are in the Downloads folder.

**Method 2**
If your directory structure is identical to that of 'Method 1' but the  two 'jars' are instead registered in CLASSPATH in e.g. _.bashrc_, you can first check the classpath declaration with: 

_java org.junit.runner.JUnitCore_

...this should list JUnit version, processing time and say 'OK'.  Those 3 commands of 'Method 1' will now in this case simplify to:

1.  _javac src/main/java/org/s/a/Summation.java_
2.  _javac src/test/java/org/s/a/SummationTest.java_
3.  _java org.junit.runner.JUnitCore src.test.java.org.s.a.SummationTest_

**Additional Note**
When using the command line, the compiled classes are stored in the same directories as their source files. &nbsp; If you want to avoid requiring _import src.main.java.org.s.a.*;_ in _SummationTest.java_, put _SummationTest.java_ in the same folder as _Summation.java_, and give both files the same package declaration.  &nbsp;Then adjust the paths in the terminal commands accordingly.
