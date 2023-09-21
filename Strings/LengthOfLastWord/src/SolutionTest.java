import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void lengthOfLastWordTest() {
        // Arrange
        String testCase1 = "Hello World";
        int expected1 = 5;

        String testCase2 = "   fly me   to   the moon  ";
        int expected2 = 4;

        String testCase3 = "luffy is still joyboy";
        int expected3 = 6;

        String testCase4 = "  sweet       laughter          ";
        int expected4 = 8;

        String testCase5 = "            cakes";
        int expected5 = 5;

        String testCase6 = " ";
        int expected6 = 0;

        // Act
        int actual1 = Solution.lengthOfLastWord(testCase1);
        int actual2 = Solution.lengthOfLastWord(testCase2);
        int actual3 = Solution.lengthOfLastWord(testCase3);
        int actual4 = Solution.lengthOfLastWord(testCase4);
        int actual5 = Solution.lengthOfLastWord(testCase5);
        int actual6 = Solution.lengthOfLastWord(testCase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}