import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void checkIfPangramTest() {

        // Arrange
        String testcaseOne = "thequickbrownfoxjumpsoverthelazydog";
        boolean expectedOne = true;

        String testcaseTwo = "leetcode";
        boolean expectedTwo = false;

        String testcaseThree = "l";
        boolean expectedThree = false;

        String testcaseFour = "thequickbeatlebrownanimalcrawledunderafoxandthefoxjumpsoverthesleepydogz";
        boolean expectedFour = true;

        // Act
        boolean actualOne = Solution.checkIfPangram(testcaseOne);
        boolean actualTwo = Solution.checkIfPangram(testcaseTwo);
        boolean actualThree = Solution.checkIfPangram(testcaseThree);
        boolean actualFour = Solution.checkIfPangram(testcaseFour);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
    }
}