import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void plusOne() {
        // Arrange
        int[] testCase1 = {1,2,3};
        int[] expected1 = {1,2,4};

        int[] testCase2 = {4,3,2,1};
        int[] expected2 = {4,3,2,2};

        int[] testCase3 = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        int[] expected3 = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,4};

        int[] testCase4 = {1};
        int[] expected4 = {2};

        int[] testCase5 = {9};
        int[] expected5 = {1,0};

        // Act
        int[] actual1 = Solution.plusOne(testCase1);
        int[] actual2 = Solution.plusOne(testCase2);
        int[] actual3 = Solution.plusOne(testCase3);
        int[] actual4 = Solution.plusOne(testCase4);
        int[] actual5 = Solution.plusOne(testCase5);

        //Assert
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
    }
}