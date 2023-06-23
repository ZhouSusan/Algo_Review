import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void reverseEachWord() {
        // Act
        String testCaseOne = "sally is a great worker";
        String testCaseTwo = "racer racecar madam";
        String testCaseThree = "what can I do today";
        String testCaseFour = "";
        String testCaseFive = " ";
        String testCaseSix = null;

        String expectedOne = "yllas si a taerg rekrow";
        String expectedTwo = "recar racecar madam";
        String expectedThree = "tahw nac I od yadot";
        String expectedFour = "";
        String expectedFive = " ";
        String expectedSix = null;

        // Arrange
        String actualOne = Algorithms.reverseEachWord(testCaseOne);
        String actualTwo = Algorithms.reverseEachWord(testCaseTwo);
        String actualThree = Algorithms.reverseEachWord(testCaseThree);
        String actualFour = Algorithms.reverseEachWord(testCaseFour);
        String actualFive = Algorithms.reverseEachWord(testCaseFive);
        String actualSix = Algorithms.reverseEachWord(testCaseSix);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);
    }

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
        String actualFive = Algorithms.reverse(testCaseFive);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
    }
}