import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void minimumDifference() {
        // Arrange
        int[] testCase1 = {9,4,1,7};
        int k1 = 2;
        int expected1 = 2;

        int[] testCase2 = {120,90,10,3,30,150,40};
        int k2 = 3;
        int expected2 = 27;

        int[] testCase3 = {12,25,7,10,19,8,10,38};
        int k3 = 4;
        int expected3 = 3;

        int[] testCase4 = {10,8,5,6,7};
        int k4 = 4;
        int expected4 = 3;

        int[] testCase5 = {1000, 1001};
        int k5 = 1;
        int expected5 = 0;

        int[] testCase6 = {78};
        int k6 = 1;
        int expected6 = 0;

        // Act
        int actual1 = Solution.minimumDifference(testCase1, k1);
        int actual2 = Solution.minimumDifference(testCase2, k2);
        int actual3 = Solution.minimumDifference(testCase3, k3);
        int actual4 = Solution.minimumDifference(testCase4, k4);
        int actual5 = Solution.minimumDifference(testCase5, k5);
        int actual6 = Solution.minimumDifference(testCase6, k6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}