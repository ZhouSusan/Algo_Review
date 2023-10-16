import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void searchRange() {
        // Arrange
        int[] testCase1And2 = {5,7,7,8,8,10};
        int target1 = 8;
        int[] expected1 = {3, 4};

        int target2 = 11;
        int[] expected2 = {-1, -1};

        int[] testCase3 = {-20,-20,-9,-6,-6,-3,-2,-2,-2,-2,-2,-2,-1};
        int target3 = -2;
        int[] expected3 = {6, 11};

        int[] testCase4 = {-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-5,0,1,2,3,4};
        int target4 = -10;
        int[] expected4 = {0, 10};

        int[] testCase5 = {-12, -11, -10};
        int target5 = -10;
        int[] expected5 = {2,2};

        int[] testCase6 = {3};
        int target6 = 3;
        int[] expected6 = {0,0};

        int[] testCase7 = {1};
        int target7 = 2;
        int[] expected7 = {-1,-1};

        int[] testCase8 = {};
        int target8 = 0;
        int[] expected8 = {-1,-1};

        // Act
        int[] actual1 = Solution.searchRange(testCase1And2, target1);
        int[] actual2 = Solution.searchRange(testCase1And2, target2);
        int[] actual3 = Solution.searchRange(testCase3, target3);
        int[] actual4 = Solution.searchRange(testCase4, target4);
        int[] actual5 = Solution.searchRange(testCase5, target5);
        int[] actual6 = Solution.searchRange(testCase6, target6);
        int[] actual7 = Solution.searchRange(testCase7, target7);
        int[] actual8 = Solution.searchRange(testCase8, target8);

        // Assert
        assertNotNull(actual1);
        assertEquals(2, actual1.length);
        assertArrayEquals(expected1, actual1);

        assertNotNull(actual2);
        assertEquals(2, actual2.length);
        assertArrayEquals(expected2, actual2);

        assertNotNull(actual3);
        assertEquals(2, actual3.length);
        assertArrayEquals(expected3, actual3);

        assertNotNull(actual4);
        assertEquals(2, actual4.length);
        assertArrayEquals(expected4, actual4);

        assertNotNull(actual5);
        assertEquals(2, actual5.length);
        assertArrayEquals(expected5, actual5);

        assertNotNull(actual6);
        assertEquals(2, actual6.length);
        assertArrayEquals(expected6, actual6);

        assertNotNull(actual7);
        assertEquals(2, actual7.length);
        assertArrayEquals(expected7, actual7);

        assertNotNull(actual8);
        assertEquals(2, actual8.length);
        assertArrayEquals(expected8, actual8);
    }
}