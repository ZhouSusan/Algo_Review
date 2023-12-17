import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void toLowerCase() {
        // Arrange
        String testCase1 = "Hello";
        String expected1 = "hello";

        String testCase2 = "here";
        String expected2 = "here";

        String testCase3 = "LOVELY";
        String expected3 = "lovely";

        String testCase4 = "VoLcAno";
        String expected4 = "volcano";

        String testCase5 = "ZZZZZZZZzzzzzzzzZZZZZZZZZZzzzz";
        String expected5 = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";

        String testCase6 = "s";
        String expected6 = "s";

        // Act
        String actual1 = Solution.toLowerCase(testCase1);
        String actual2 = Solution.toLowerCase(testCase2);
        String actual3 = Solution.toLowerCase(testCase3);
        String actual4 = Solution.toLowerCase(testCase4);
        String actual5 = Solution.toLowerCase(testCase5);
        String actual6 = Solution.toLowerCase(testCase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }

}