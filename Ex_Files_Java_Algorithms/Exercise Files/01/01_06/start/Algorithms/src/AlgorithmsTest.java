import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void reverse() {

        // Act
        String testCaseOne = "cheese";
        String testCaseTwo = "World";
        String testCaseThree = "Bears!";
        String testCaseFour = "";
        String testCaseFive = null;

        String expectedOne = "eseehc";
        String expectedTwo = "dlroW";
        String expectedThree = "!sraeB";
        String expectedFour = "";
        String expectedFive = null;

        // Arrange
        String actualOne = Algorithms.reverse(testCaseOne);
        String actualTwo = Algorithms.reverse(testCaseTwo);
        String actualThree = Algorithms.reverse(testCaseThree);
        String actualFour = Algorithms.reverse(testCaseFour);
        String actualFIve = Algorithms.reverse(testCaseFive);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFIve);
    }
}