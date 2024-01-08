import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring() {
        // Arrange
        String testCase1 = "abcabcbb";
        int expected1 = 3;

        String testCase2 = "bbbbb";
        int expected2 = 1;

        String testCase3 = "0pw,wke-w1-";
        int expected3 = 5;

        String testCase4 = "00010001000001000001";
        int expected4 = 2;

        String testCase5 = "ab4ab-56 ct,asabt";
        int expected5 = 10;

        String testCase6 = "                 ";
        int expected6 = 1;

        String testCase7 = "[{(01-a)}]";
        int expected7 = 10;

        String testCase8 = "[{])()}";
        int expected8 = 5;

        String testCase9 = "z";
        int expected9 = 1;

        String testCase10 = "";
        int expected10 = 0;

        // Act
        int actual1 = Solution.lengthOfLongestSubstring(testCase1);
        int actual2 = Solution.lengthOfLongestSubstring(testCase2);
        int actual3 = Solution.lengthOfLongestSubstring(testCase3);
        int actual4 = Solution.lengthOfLongestSubstring(testCase4);
        int actual5 = Solution.lengthOfLongestSubstring(testCase5);
        int actual6 = Solution.lengthOfLongestSubstring(testCase6);
        int actual7 = Solution.lengthOfLongestSubstring(testCase7);
        int actual8 = Solution.lengthOfLongestSubstring(testCase8);
        int actual9 = Solution.lengthOfLongestSubstring(testCase9);
        int actual10 = Solution.lengthOfLongestSubstring(testCase10);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
        assertEquals(expected9, actual9);
        assertEquals(expected10, actual10);
    }
}