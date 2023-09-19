import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void reverseWordsTest() {
        // Arrange
        String testcase1 = "the sky is blue";
        String expected1 = "blue is sky the";

        String testcase2 = "  hello world  ";
        String expected2 = "world hello";

        String testcase3 = "a good   movie";
        String expected3 = "movie good a";

        String testcase4 = "  the     blue   skirt    ";
        String expected4 = "skirt blue the";

        String testcase5 = "it ";
        String expected5 = "it";

        String testcase6 = "   ";
        String expected6 = "";

        // Act
        String actual1 = Solution.reverseWords(testcase1);
        String actual2 = Solution.reverseWords(testcase2);
        String actual3 = Solution.reverseWords(testcase3);
        String actual4 = Solution.reverseWords(testcase4);
        String actual5 = Solution.reverseWords(testcase5);
        String actual6 = Solution.reverseWords(testcase6);

        // Assert
        assertEquals(expected1, actual1);
        assertTrue(expected1.length() == actual1.length());
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}