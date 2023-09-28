import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void removeDuplicates() {
        // Arrange
        int[] testcase1 = {1,1,2};
        int expected1 = 2;

        int[] testcase2 = {0,0,1,1,1,2,2,3,3,4};
        int expected2 = 5;

        int[] testcase3 = {-10,-10,-9,-8,-7,-7,-6,-6,-5,-4,-3,-2,-1,-1,0,0,1,1,1,2,2,3,3,4};
        int expected3 = 15;

        int[] testcase4 = {-10, -10, -9, -9, -8, -7, -7, -6, -6, -5};
        int expected4 = 6;

        int[] testcase5 = {1};
        int expected5 = 1;

        // Act
        int actual1 = Solution.removeDuplicates(testcase1);
        int actual2 = Solution.removeDuplicates(testcase2);
        int actual3 = Solution.removeDuplicates(testcase3);
        int actual4 = Solution.removeDuplicates(testcase4);
        int actual5 = Solution.removeDuplicates(testcase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}