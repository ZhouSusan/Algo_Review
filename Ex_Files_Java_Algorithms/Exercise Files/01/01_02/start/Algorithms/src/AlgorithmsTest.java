import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void isPasswordComplex() {
        // Arrange
        String testCaseOne = "Hell0";
        String testCaseTwo = "Hello";
        String testCaseThree = "hell0";
        String testCaseFour = "HeLLo";
        String testCaseFive = "hello";
        String testCaseSix = " ";
        String testCaseSeven = "1098234";
        String testCaseEight = "";
        String testCaseNine = null;

        // Act
        boolean actualOne = Algorithms.isPasswordComplex(testCaseOne);
        boolean actualTwo = Algorithms.isPasswordComplex(testCaseTwo);
        boolean actualThree = Algorithms.isPasswordComplex(testCaseThree);
        boolean actualFour = Algorithms.isPasswordComplex(testCaseFour);
        boolean actualFive = Algorithms.isPasswordComplex(testCaseFive);
        boolean actualSix = Algorithms.isPasswordComplex(testCaseSix);
        boolean actualSeven = Algorithms.isPasswordComplex(testCaseSeven);
        boolean actualEight = Algorithms.isPasswordComplex(testCaseEight);
        boolean actualNine = Algorithms.isPasswordComplex(testCaseNine);

        //Assert
        assertTrue(actualOne);
        assertFalse(actualTwo);
        assertFalse(actualThree);
        assertFalse(actualFour);
        assertFalse(actualFive);
        assertFalse(actualSix);
        assertFalse(actualSeven);
        assertFalse(actualEight);
        assertFalse(actualNine);
    }
}