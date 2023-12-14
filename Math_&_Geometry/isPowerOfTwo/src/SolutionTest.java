import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isPowerOfTwo() {
        // Arrange
        int testCase1 = 512;
        boolean expected1 = true;

        int testCase2 = 8192;
        boolean expected2 = true;

        int testCase3 = 2000;
        boolean expected3 = false;

        int testCase4 = 1;
        boolean expected4 = true;

        int testCase5 = 0;
        boolean expected5 = false;

        // Act
        boolean actual1 = Solution.isPowerOfTwo(testCase1);
        boolean actual2 = Solution.isPowerOfTwo(testCase2);
        boolean actual3 = Solution.isPowerOfTwo(testCase3);
        boolean actual4 = Solution.isPowerOfTwo(testCase4);
        boolean actual5 = Solution.isPowerOfTwo(testCase5);

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}