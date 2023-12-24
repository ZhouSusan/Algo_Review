import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void thirdMax() {
        // Arrange
        int[] testCase1 = {2,2,3,1};
        int expected1 = 1;

        int[] testCase2 = {-2,-3,-1,-4};
        int expected2 = -3;

        int[] testCase3 = {12,-1,8,-9,10,11};
        int expected3 = 10;

        int[] testCase4 = {1,2};
        int expected4 = 2;

        int[] testCase5 = {-1,-1};
        int expected5 = -1;

        int[] testCase6 = {1,2,-2147483648};
        int expected6 = -2147483648;

        int[] testCase7 = {1,2,-2147483648};
        int expected7 = -2147483648;

        int[] testCase8 = {9};
        int expected8 = 9;

        // Act
        int actual1 = Solution.thirdMax(testCase1);
        int actual2 = Solution.thirdMax(testCase2);
        int actual3 = Solution.thirdMax(testCase3);
        int actual4 = Solution.thirdMax(testCase4);
        int actual5 = Solution.thirdMax(testCase5);
        int actual6 = Solution.thirdMax(testCase6);
        int actual7 = Solution.thirdMax(testCase7);
        int actual8 = Solution.thirdMax(testCase8);

        // Assert
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