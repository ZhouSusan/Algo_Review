import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void mergeAlternately() {
        // Arrange
        String testCase1a = "abc", testCase1b = "pqr";
        String expected1 = "apbqcr";

        String testCase2a = "aaaaa", testCase2b ="bb";
        String expected2 = "ababaaa";

        String testCase3a = "panda", testCase3b = "express";
        String expected3 = "peaxnpdraess";

        String testCase4a = "animal", testCase4b = "barn";
        String expected4 = "abnairmnal";

        String testCase5a = "c", testCase5b ="rates";
        String expected5 = "crates";

        // Act
        String actual1 = Solution.mergeAlternately(testCase1a, testCase1b);
        String actual2 = Solution.mergeAlternately(testCase2a, testCase2b);
        String actual3 = Solution.mergeAlternately(testCase3a, testCase3b);
        String actual4 = Solution.mergeAlternately(testCase4a, testCase4b);
        String actual5 = Solution.mergeAlternately(testCase5a, testCase5b);

        // Assert
        assertEquals(testCase1a.length() + testCase1b.length(), actual1.length());
        assertEquals(expected1, actual1);

        assertEquals(testCase2a.length()+testCase2b.length(), actual2.length());
        assertEquals(expected2, actual2);

        assertEquals(testCase3a.length()+testCase3b.length(), actual3.length());
        assertEquals(expected3, actual3);

        assertEquals(testCase4a.length()+testCase4b.length(), actual4.length());
        assertEquals(expected4, actual4);

        assertEquals(testCase5a.length()+testCase5b.length(), actual5.length());
        assertEquals(expected5, actual5);
    }
}