import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void sortedSquares() {
        // Arrange
        int[] testCase1 = {-4,-1,0,3,10};
        int[] expected1 = {0,1,9,16,100};

        int[] testCase2 = {-7,-3,2,3,11};
        int[] expected2 = {4,9,9,49,121};

        int[] testCase3 = {10,3,20,-3,-5};
        int[] expected3 = {9,9,25,100,400};

        int[] testCase4 = {-1,-2,0};
        int[] expected4 = {0,1,4};

        int[] testCase5 = {7,9,3};
        int[] expected5 = {9,49,81};

        int[] testCase6 = {10};
        int[] expected6 = {100};

        // Act
        int[] actual1 = Solution.sortedSquares(testCase1);
        int[] actual2 = Solution.sortedSquares(testCase2);
        int[] actual3 = Solution.sortedSquares(testCase3);
        int[] actual4 = Solution.sortedSquares(testCase4);
        int[] actual5 = Solution.sortedSquares(testCase5);
        int[] actual6 = Solution.sortedSquares(testCase6);

        // Assert
        assertNotNull(actual1);
        assertArrayEquals(expected1, actual1);

        assertNotNull(actual2);
        assertArrayEquals(expected2, actual2);

        assertNotNull(actual3);
        assertArrayEquals(expected3, actual3);

        assertNotNull(actual4);
        assertArrayEquals(expected4, actual4);

        assertNotNull(actual5);
        assertArrayEquals(expected5, actual5);

        assertNotNull(actual6);
        assertArrayEquals(expected6, actual6);
    }
}