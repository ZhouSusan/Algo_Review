import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void pivotIndex() {
        // Arrange
        int[] testCase1 = {1,7,3,6,5,6};
        int expected1 = 3;

        int[] testCase2 = {4,5,-3,10,-1};
        int expected2 = 2;

        int[] testCase3 = {1,2,3,4};
        int expected3 = -1;

        int[] testCase4 = {2,1,-1};
        int expected4 = 0;

        int[] testCase5 = {1,-1,4};
        int expected5 = 2;

        int[] testCase6 = {100};
        int expected6 = 0;

        // Act
        int actual1 = Solution.pivotIndex(testCase1);
        int actual2 = Solution.pivotIndex(testCase2);
        int actual3 = Solution.pivotIndex(testCase3);
        int actual4 = Solution.pivotIndex(testCase4);
        int actual5 = Solution.pivotIndex(testCase5);
        int actual6 = Solution.pivotIndex(testCase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}