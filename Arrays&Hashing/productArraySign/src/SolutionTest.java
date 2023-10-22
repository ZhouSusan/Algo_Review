import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void arraySign() {
        // Arrange
        int[] testCase1 = {-1,4,-2,1,-1,-2,-3};
        int expected1 = -1;

        int[] testCase2 = {-1,2,3,-4,-3,2,-1};
        int expected2 = 1;

        int[] testCase3 = {10,10,10,10,0,10,10};
        int expected3 = 0;

        int[] testCase4 = {-1,1,-1,1,-1};
        int expected4 = -1;

        int[] testCase5 = {1,5,0,2,-3};
        int expected5 = 0;

        int[] testCase6 = {-6,-4};
        int expected6 = 1;

        int[] testCase7 = {-1,9};
        int expected7 = -1;

        int[] testCase8 = {3};
        int expected8 = 1;

        // Act
        int actual1 = Solution.arraySign(testCase1);
        int actual2 = Solution.arraySign(testCase2);
        int actual3 = Solution.arraySign(testCase3);
        int actual4 = Solution.arraySign(testCase4);
        int actual5 = Solution.arraySign(testCase5);
        int actual6 = Solution.arraySign(testCase6);
        int actual7 = Solution.arraySign(testCase7);
        int actual8 = Solution.arraySign(testCase8);

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