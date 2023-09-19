import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void removeDuplicateLettersTest() {
        // Arrange
        String testcase1 = "bcabc";
        String expected1 = "abc";

        String testcase2 = "cbacdcbc";
        String expected2 =  "acdb";

        String testcase3 = "bc";
        String expected3 = "bc";

        String testcase4 = "a";
        String expected4 = "a";

        // Act
        String actual1 = Solution.removeDuplicateLetters(testcase1);
        String actual2 = Solution.removeDuplicateLetters(testcase2);
        String actual3 = Solution.removeDuplicateLetters(testcase3);
        String actual4 = Solution.removeDuplicateLetters(testcase4);

        // Assert
        assertEquals(expected1, actual1);
        assertTrue(actual1.length() == expected1.length());

        assertEquals(expected2, actual2);
        assertTrue(actual2.length() == expected2.length());

        assertEquals(expected3, actual3);
        assertEquals(expected3.length(), actual3.length());

        assertEquals(expected4, actual4);
        assertEquals(expected4.length(), actual4.length());
    }
}