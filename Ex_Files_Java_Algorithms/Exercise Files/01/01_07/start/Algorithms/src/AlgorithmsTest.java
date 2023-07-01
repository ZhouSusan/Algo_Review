import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void reverse2() {

        // Arrange
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

        // Act
        String actualOne = Algorithms.reverse2(testCaseOne);
        String actualTwo = Algorithms.reverse2(testCaseTwo);
        String actualThree = Algorithms.reverse2(testCaseThree);
        String actualFour = Algorithms.reverse2(testCaseFour);
        String actualFIve = Algorithms.reverse2(testCaseFive);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFIve);
    }
}