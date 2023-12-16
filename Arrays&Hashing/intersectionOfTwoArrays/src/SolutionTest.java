import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void intersection() {
        // Arrange
        int[] testCase1a = {1,2,2,1};
        int[] testCase1b = {2,2};
        int[] expected1 = {2};

        int[] testCase2a = {4,9,5};
        int[] testCase2b = {9,4,9,8,4};
        int[] expected2 = {4, 9};

        int[] testCase3a = {11, 11, 11, 11, 11, 11, 11, 11};
        int[] testCase3b = {11, 2, 3, 4, 5, 6, 11};
        int[] expected3 = {11};

        int[] testCase4a = {17, 12, 19, 0, 999, 88, 1000};
        int[] testCase4b = {2, 0, 9, 12};
        int[] expected4 = {0, 12};

        int[] testCase5a = {171};
        int[] testCase5b = {5, 70, 90, 100, 171, 1, 3};
        int[] expected5 = {171};

        int[] testCase6a = {90000};
        int[] testCase6b = {2};
        int[] expected6 = {};

        // Act
        int[] actual1 = Solution.intersection(testCase1a, testCase1b);
        int[] actual2 = Solution.intersection(testCase2a, testCase2b);
        int[] actual3 = Solution.intersection(testCase3a, testCase3b);
        int[] actual4 = Solution.intersection(testCase4a, testCase4b);
        int[] actual5 = Solution.intersection(testCase5a, testCase5b);
        int[] actual6 = Solution.intersection(testCase6a, testCase6b);

        // Assert
        assertNotNull(actual1);
        assertArrayEquals(expected1, actual1);
        assertEquals(expected1.length, actual1.length);

        assertNotNull(actual2);
        assertArrayEquals(expected2, actual2);
        assertEquals(expected2.length, actual2.length);

        assertNotNull(actual3);
        assertArrayEquals(expected3, actual3);
        assertEquals(expected3.length, actual3.length);

        assertNotNull(actual4);
        assertArrayEquals(expected4, actual4);
        assertEquals(expected4.length, actual4.length);

        assertNotNull(actual5);
        assertArrayEquals(expected5, actual5);
        assertEquals(expected5.length, actual5.length);

        assertNotNull(actual6);
        assertArrayEquals(expected6, actual6);
        assertEquals(expected6.length, actual6.length);
    }

}