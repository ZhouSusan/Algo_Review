import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void search() {
        // Arrange
        int[] testCase1 = {-1,0,3,5,9,12};
        int target1 = 14;
        int expected1 = -1;

        int[] testCase2 = {0,3,4,5,9,12};
        int target2 = 4;
        int expected2 = 2;

        int[] testCase3 = {-10,-8,-6,-4,-2};
        int target3 = -2;
        int expected3 = 4;

        int[] testCase4 = {1};
        int target4 = 1;
        int expected4 = 0;

        int[] testCase5 = {-3};
        int target5 = 3;
        int expected5 = -1;

        // Act
        int actual1 = Solution.search(testCase1, target1);
        int actual2 = Solution.search(testCase2, target2);
        int actual3 = Solution.search(testCase3, target3);
        int actual4 = Solution.search(testCase4, target4);
        int actual5 = Solution.search(testCase5, target5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}