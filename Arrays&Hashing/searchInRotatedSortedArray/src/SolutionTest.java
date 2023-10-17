import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void search() {
        // Arrange
        int[] testCase1 = {4,5,6,7,0,1,2};
        int target1 = 1;
        int expected1 = 5;

        int[] testCase2 = {0, 1, 3, 5, 6, -12, -11, -10};
        int target2 = -11;
        int expected2 = 6;

        int[] testCase3 = {4,5,6,7,-3,-1,0,1,2};
        int target3 = -3;
        int expected3 = 4;

        int[] testCase4 = {15, 16, 17, 18, 19, 0, 1, 2, 3, 4};
        int target4 = 5;
        int expected4 = -1;

        int[] testCase5 = {4,5,6,7,8,-4,-3,-1,0};
        int target5 = -2;
        int expected5 = -1;

        int[] testCase6 = {4};
        int target6 = 0;
        int expected6 = -1;

        int[] testCase7 = {0};
        int target7 = 0;
        int expected7 = 0;

        int[] testCase8 = {1};
        int target8 = 0;
        int expected8 = -1;

        // Act
        int actual1 = Solution.search(testCase1, target1);
        int actual2 = Solution.search(testCase2, target2);
        int actual3 = Solution.search(testCase3, target3);
        int actual4 = Solution.search(testCase4, target4);
        int actual5 = Solution.search(testCase5, target5);
        int actual6 = Solution.search(testCase6, target6);
        int actual7 = Solution.search(testCase7, target7);
        int actual8 = Solution.search(testCase8, target8);

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