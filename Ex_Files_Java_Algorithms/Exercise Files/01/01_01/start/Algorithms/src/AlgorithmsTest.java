import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {
    
    @org.junit.jupiter.api.Test
    void isUpperCase() {
        // Arrange
        String testCaseOne = "WELCOME";
        String testCaseTwo = "HoMe";
        String testCaseThree = "friend";
        String testCaseFour = "";

        // Act
        boolean actualOne = Algorithms.isUpperCase(testCaseOne);
        boolean actualTwo = Algorithms.isUpperCase(testCaseTwo);
        boolean actualThree = Algorithms.isUpperCase(testCaseThree);
        boolean actualFour = Algorithms.isUpperCase(testCaseFour);

        // Assert
        assertTrue(actualOne);
        assertFalse(actualTwo);
        assertFalse(actualThree);
        assertFalse(actualFour);
    }

    @org.junit.jupiter.api.Test
    void isLowerCase() {
        // Arrange
        String testCaseOne = "WELCOME";
        String testCaseTwo = "HoMe";
        String testCaseThree = "friend";
        String testCaseFour = "";
        
        // Act
        boolean actualOne = Algorithms.isLowerCase(testCaseOne);
        boolean actualTwo = Algorithms.isLowerCase(testCaseTwo);
        boolean actualThree = Algorithms.isLowerCase(testCaseThree);
        boolean actualFour = Algorithms.isLowerCase(testCaseFour);

        // Assert
        assertFalse(actualOne);
        assertFalse(actualTwo);
        assertTrue(actualThree);
        assertFalse(actualFour);
    }
}