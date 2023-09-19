import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void strStrTest() {
        // Arrange
        String haystack1 = "sadbutsad", needle1 = "sad";
        int expected1 = 0;

        String haystack2 = "leetcode", needle2 = "leets";
        int expected2 = -1;

        String haystack3 = "moonwave", needle3 = "wave";
        int expected3 = 4;

        String haystack4 = "d", needle4 = "sd";
        int expected4 = -1;

        // Act
        int actual1 = Solution.strStr(haystack1, needle1);
        int actual2 = Solution.strStr(haystack2, needle2);
        int actual3 = Solution.strStr(haystack3, needle3);
        int actual4 = Solution.strStr(haystack4, needle4);

        // Assert
        assertEquals(expected1, actual1);
        assertTrue(expected2 == actual2);
        assertEquals(expected3, actual3);
        assertTrue(expected4 == actual4);
    }
}