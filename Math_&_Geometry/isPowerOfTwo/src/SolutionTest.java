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

        int testCase6 = -1000000;
        boolean expected6 = false;

        int testCase7 = -8;
        boolean expected7 = false;

        int testCase8 = 131072;
        boolean expected8 = true;

        // Act
        boolean actual1 = Solution.isPowerOfTwo(testCase1);
        boolean actual2 = Solution.isPowerOfTwo(testCase2);
        boolean actual3 = Solution.isPowerOfTwo(testCase3);
        boolean actual4 = Solution.isPowerOfTwo(testCase4);
        boolean actual5 = Solution.isPowerOfTwo(testCase5);
        boolean actual6 = Solution.isPowerOfTwo(testCase6);
        boolean actual7 = Solution.isPowerOfTwo(testCase7);
        boolean actual8 = Solution.isPowerOfTwo(testCase8);

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
    }

}