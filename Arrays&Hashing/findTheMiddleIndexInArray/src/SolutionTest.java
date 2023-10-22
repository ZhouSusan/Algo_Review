import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findMiddleIndex() {
        // Arrange
        int[] testCase1 = {6,5,6,1,7,3};
        int expected1 = 2;

        int[] testCase2 = {2,3,-1,8,4};
        int expected2 = 3;

        int[] testCase3 = {-4,-3,0,1};
        int expected3 = -1;

        int[] testCase4 = {5,2,-1,-1};
        int expected4 = 0;

        int[] testCase5 = {3,1,-2,4};
        int expected5 = 2;

        int[] testCase6 = {0};
        int expected6 = 0;

        // Act
        int actual1 = Solution.findMiddleIndex(testCase1);
        int actual2 = Solution.findMiddleIndex(testCase2);
        int actual3 = Solution.findMiddleIndex(testCase3);
        int actual4 = Solution.findMiddleIndex(testCase4);
        int actual5 = Solution.findMiddleIndex(testCase5);
        int actual6 = Solution.findMiddleIndex(testCase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}