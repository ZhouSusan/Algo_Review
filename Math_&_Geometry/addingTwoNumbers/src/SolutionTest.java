import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void solveMeFirst() {
        // Arrange
        int testCase1a = 7;
        int testCase1b = 3;
        int expected1 = 10;

        int testCase2a = 1000;
        int testCase2b = 333;
        int expected2 = 1333;

        int testCase3a = 12;
        int testCase3b = 5;
        int expected3 = 17;

        int testCase4a = 999;
        int testCase4b = 1;
        int expected4 = 1000;

        int testCase5a = 139;
        int testCase5b = 540;
        int expected5 = 679;

        // Act
        int actual1 = Solution.solveMeFirst(testCase1a, testCase1b);
        int actual2 = Solution.solveMeFirst(testCase2a, testCase2b);
        int actual3 = Solution.solveMeFirst(testCase3a, testCase3b);
        int actual4 = Solution.solveMeFirst(testCase4a, testCase4b);
        int actual5 = Solution.solveMeFirst(testCase5a, testCase5b);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}