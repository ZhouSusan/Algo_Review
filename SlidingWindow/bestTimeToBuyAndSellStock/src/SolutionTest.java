import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void maxProfit() {
        // Arrange
        int[] testCase1 = {7,1,5,3,6,4};
        int expected1 = 5;

        int[] testCase2 = {2,3,5,1,7,4,3,9};
        int expected2= 8;

        int[] testCase3 = {2,2,2,2,2,2,2,2};
        int expected3= 0;

        int[] testCase4 = {3,4,6,5,4,2};
        int expected4= 3;

        int[] testCase5 = {7,6,4,3,1};
        int expected5= 0;

        int[] testCase6 = {3,8};
        int expected6= 5;

        int[] testCase7 = {9};
        int expected7= 0;

        // Act
        int actual1 = Solution.maxProfit(testCase1);
        int actual2 = Solution.maxProfit(testCase2);
        int actual3 = Solution.maxProfit(testCase3);
        int actual4 = Solution.maxProfit(testCase4);
        int actual5 = Solution.maxProfit(testCase5);
        int actual6 = Solution.maxProfit(testCase6);
        int actual7 = Solution.maxProfit(testCase7);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
    }
}