import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void maxNumberOfBalloons() {
        // Arrange
        String testCaseOne = "nlaebolko";
        int expectedOne = 1;

        String testCaseTwo = "loonbalxballpoon";
        int expectedTwo = 2;

        String testCaseThree = "leetcode";
        int expectedThree = 0;

        String testCaseFour = "lebaksloolnblaslon";
        int expectedFour = 1;

        String testCaseFive = "least";
        int expectedFive = 0;

        String testCaseSix = "l";
        int expectedSix = 0;

        // Act
        int actualOne = Solution.maxNumberOfBalloons(testCaseOne);
        int actualTwo = Solution.maxNumberOfBalloons(testCaseTwo);
        int actualThree = Solution.maxNumberOfBalloons(testCaseThree);
        int actualFour = Solution.maxNumberOfBalloons(testCaseFour);
        int actualFive = Solution.maxNumberOfBalloons(testCaseFive);
        int actualSix = Solution.maxNumberOfBalloons(testCaseSix);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);
    }
}