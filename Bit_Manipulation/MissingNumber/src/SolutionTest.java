import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void missingNumber() {
        // Arrange
        int[] testcase1 = {3,0,1};
        int expected1 = 2;

        int[] testcase2 = {0,1};
        int expected2 = 2;

        int[] testcase3 = {3,0,1,2,4};
        int expected3 = 5;

        int[] testcase4 = {9,6,4,2,3,5,7,0,1};
        int expected4 = 8;

        int[] testcase5 = {9,6,4,2,3,5,7,0,1,8};
        int expected5 = 10;

        int[] testcase6 = {1};
        int expected6 = 0;

        // Act
        int actual1 = Solution.missingNumber(testcase1);
        int actual2 = Solution.missingNumber(testcase2);
        int actual3 = Solution.missingNumber(testcase3);
        int actual4 = Solution.missingNumber(testcase4);
        int actual5 = Solution.missingNumber(testcase5);
        int actual6 = Solution.missingNumber(testcase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}