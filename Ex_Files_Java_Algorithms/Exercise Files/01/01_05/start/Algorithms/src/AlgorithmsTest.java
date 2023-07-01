import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void isAtEvenIndex() {
        // Arrange
        String testCaseOne = "HeLLo";
        String testCaseTwo = "";
        String testCaseThree = null;

        // Act
        boolean actualOne = Algorithms.isAtEvenIndex(testCaseOne, 'L');
        boolean actualTwo = Algorithms.isAtEvenIndex(testCaseOne, 'e');
        boolean actualThree = Algorithms.isAtEvenIndex(testCaseOne, 'T');
        boolean actualFour = Algorithms.isAtEvenIndex(testCaseOne, 'H');
        boolean actualFive = Algorithms.isAtEvenIndex(testCaseTwo, 'L');
        boolean actualSix = Algorithms.isAtEvenIndex(testCaseThree, 'o');

        // Assert
        assertTrue(actualOne);
        assertFalse(actualTwo);
        assertFalse(actualThree);
        assertTrue(actualFour);
        assertFalse(actualFive);
        assertFalse(actualSix);
    }
}