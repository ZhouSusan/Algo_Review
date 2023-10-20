import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void longestWord() {

        // Arrange
        String testCase1 = "fun&!! time";
        String expected1 = "time";

        String testCase2 = "I love chocolate cookies!";
        String expected2 = "chocolate";

        String testCase3 = " !  Game Time, Let's Play!";
        String expected3 = "Game";

        String testCase4 = "Hello world123 567";
        String expected4 = "world123";

        String testCase5 = "!@#$%@#$%";
        String expected5 = "";

        // Act
        String actual1 = Solution.longestWord(testCase1);
        String actual2 = Solution.longestWord(testCase2);
        String actual3 = Solution.longestWord(testCase3);
        String actual4 = Solution.longestWord(testCase4);
        String actual5 = Solution.longestWord(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}