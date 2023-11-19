import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void mySqrt() {
        // Act
        int testCase1 = 4;
        int expected1 = 2;

        int testCase2 = 8;
        int expected2 = 2;

        int testCase3 = 1200;
        int expected3 = 34;

        int testCase4 = 144;
        int expected4 = 12;

        int testCase5 = 0;
        int expected5 = 0;

        // Arrange
        int actual1 = Solution.mySqrt(testCase1);
        int actual2 = Solution.mySqrt(testCase2);
        int actual3 = Solution.mySqrt(testCase3);
        int actual4 = Solution.mySqrt(testCase4);
        int actual5 = Solution.mySqrt(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}