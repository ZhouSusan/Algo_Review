import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isValid() {
        // Arrange
        String testCase1 = "{[(([{}]))]}";
        boolean expected1 = true;

        String testCase2 = "(((()))))";
        boolean expected2 = false;

        String testCase3 = "{{}[]()}";
        boolean expected3 = true;

        String testCase4 = "{(})";
        boolean expected4 = false;

        String testCase5 = "(}";
        boolean expected5 = false;

        String testCase6 = "[]";
        boolean expected6 = true;

        String testCase7 = "(";
        boolean expected7 = false;

        // Act
        boolean actual1 = Solution.isValid(testCase1);
        boolean actual2 = Solution.isValid(testCase2);
        boolean actual3 = Solution.isValid(testCase3);
        boolean actual4 = Solution.isValid(testCase4);
        boolean actual5 = Solution.isValid(testCase5);
        boolean actual6 = Solution.isValid(testCase6);
        boolean actual7 = Solution.isValid(testCase7);

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