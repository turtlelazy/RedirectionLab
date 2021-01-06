javac PigLatinTester.java
java PigLatinTester | diff testerExpected.txt -
javac PigLatin.java
java PigLatin < sonnet.txt | diff expectedOutput.txt -