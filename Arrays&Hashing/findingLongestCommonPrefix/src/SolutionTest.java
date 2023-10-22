import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void longestCommonPrefix() {
        // Arrange
        String[] testCase1 = {"flower","flow","flight"};
        String expected1 = "fl";

        String[] testCase2 = {"flashlight","flakes","fla"};
        String expected2 = "fla";

        String[] testCase3 = {"this", "thatcat", "thosehats"};
        String expected3 = "th";

        String[] testCase4 = {"","cook","meal"};
        String expected4 = "";

        String[] testCase5 = {"fl","f","th"};
        String expected5 = "";

        String[] testCase6 = {"Happy","Happy",""};
        String expected6 = "";

        String[] testCase7 = {"rain"};
        String expected7 = "rain";

        // Act
        String actual1 = Solution.longestCommonPrefix(testCase1);
        String actual2 = Solution.longestCommonPrefix(testCase2);
        String actual3 = Solution.longestCommonPrefix(testCase3);
        String actual4 = Solution.longestCommonPrefix(testCase4);
        String actual5 = Solution.longestCommonPrefix(testCase5);
        String actual6 = Solution.longestCommonPrefix(testCase6);
        String actual7 = Solution.longestCommonPrefix(testCase7);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
    }
}