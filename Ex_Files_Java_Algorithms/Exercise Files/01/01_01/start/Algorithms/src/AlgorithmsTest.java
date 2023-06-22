import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {
    // Act
    String testCaseOne = "WELCOME";
    String testCaseTwo = "HoMe";
    String testCaseThree = "friend";

    @org.junit.jupiter.api.Test
    void isUpperCase() {
        // Arrange
        boolean actualOne = Algorithms.isUpperCase(testCaseOne);
        boolean actualTwo = Algorithms.isUpperCase(testCaseTwo);
        boolean actualThree = Algorithms.isUpperCase(testCaseThree);

        // Assert
        assertTrue(actualOne);
        assertFalse(actualTwo);
        assertFalse(actualThree);
    }

    @org.junit.jupiter.api.Test
    void isLowerCase() {
        // Arrange
        boolean actualOne = Algorithms.isLowerCase(testCaseOne);
        boolean actualTwo = Algorithms.isLowerCase(testCaseTwo);
        boolean actualThree = Algorithms.isLowerCase(testCaseThree);

        // Assert
        assertFalse(actualOne);
        assertFalse(actualTwo);
        assertTrue(actualThree);
    }
}