import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void nextGreaterElement() {
        // Arrange
        int[] testCase1a = {4,1,2}, testCase1b = {1,3,4,2};
        int[] expected1 = {-1,3,-1};

        int[] testCase2a = {2,4}, testCase2b = {1,2,3,4};
        int[] expected2 = {3,-1};

        int[] testCase3a = {400, 55, 78, 100}, testCase3b = {400, 20, 40, 55, 1, 12, 100, 78, 99, 12};
        int[] expected3 = {-1,100,99,-1};

        int[] testCase4a = {3}, testCase4b = {4,3,2,1};
        int[] expected4 = {-1};

        int[] testCase5a = {2}, testCase5b = {2};
        int[] expected5 = {-1};

        // Act
        int[] actual1 = Solution.nextGreaterElement(testCase1a, testCase1b);
        int[] actual2 = Solution.nextGreaterElement(testCase2a, testCase2b);
        int[] actual3 = Solution.nextGreaterElement(testCase3a, testCase3b);
        int[] actual4 = Solution.nextGreaterElement(testCase4a, testCase4b);
        int[] actual5 = Solution.nextGreaterElement(testCase5a, testCase5b);

        // Assert
        assertNotNull(actual1);
        assertEquals(testCase1a.length, actual1.length);
        assertArrayEquals(expected1, actual1);

        assertNotNull(actual2);
        assertEquals(testCase2a.length, actual2.length);
        assertArrayEquals(expected2, actual2);

        assertEquals(testCase3a.length, actual3.length);
        assertArrayEquals(expected3, actual3);

        assertEquals(testCase4a.length, actual4.length);
        assertArrayEquals(expected4, actual4);

        assertEquals(testCase5a.length, actual5.length);
        assertArrayEquals(expected5, actual5);
    }
}