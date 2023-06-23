import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void isPasswordComplex() {
        // Act
        String testCaseOne = "Hell0";
        String testCaseTwo = "Hello";
        String testCaseThree = "hell0";
        String testCaseFour = "HeLLo";
        String testCaseFive = "hello";
        String testCaseSix = " ";

        // Arrange
        boolean actualOne = Algorithms.isPasswordComplex(testCaseOne);
        boolean actualTwo = Algorithms.isPasswordComplex(testCaseTwo);
        boolean actualThree = Algorithms.isPasswordComplex(testCaseThree);
        boolean actualFour = Algorithms.isPasswordComplex(testCaseFour);
        boolean actualFive = Algorithms.isPasswordComplex(testCaseFive);
        boolean actualSix = Algorithms.isPasswordComplex(testCaseSix);

        //Assert
        assertTrue(actualOne);
        assertFalse(actualTwo);
        assertFalse(actualThree);
        assertFalse(actualFour);
        assertFalse(actualFive);
        assertFalse(actualSix);
    }
}