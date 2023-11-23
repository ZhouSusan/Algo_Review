import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isPerfectSquare() {
        // Arrange
        int testCase1 = 16;
        boolean expected1 = true;

        int testCase2 = 14;
        boolean expected2 = false;

        int testCase3 = 808201;
        boolean expected3 = true;

        int testCase4 = 2147483647;
        boolean expected4 = false;

        int testCase5 = 1;
        boolean expected5 = true;

        // Act
        boolean actual1 = Solution.isPerfectSquare(testCase1);
        boolean actual2 = Solution.isPerfectSquare(testCase2);
        boolean actual3 = Solution.isPerfectSquare(testCase3);
        boolean actual4 = Solution.isPerfectSquare(testCase4);
        boolean actual5 = Solution.isPerfectSquare(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}