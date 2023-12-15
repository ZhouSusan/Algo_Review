import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isUgly2() {
        // Arrange
        int testCase1 = 6;
        boolean expected1 = true;

        int testCase2 = 1;
        boolean expected2 = true;

        int testCase3 = 1096;
        boolean expected3 = false;

        int testCase4 = 15;
        boolean expected4 = true;

        int testCase5 = 1;
        boolean expected5 = true;

        int testCase6 = 0;
        boolean expected6 = false;

        int testCase7 = -100;
        boolean expected7 = false;

        // Act
        boolean actual1 = Solution.isUgly(testCase1);
        boolean actual2 = Solution.isUgly(testCase2);
        boolean actual3 = Solution.isUgly(testCase3);
        boolean actual4 = Solution.isUgly(testCase4);
        boolean actual5 = Solution.isUgly(testCase5);
        boolean actual6 = Solution.isUgly(testCase6);
        boolean actual7 = Solution.isUgly(testCase7);

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