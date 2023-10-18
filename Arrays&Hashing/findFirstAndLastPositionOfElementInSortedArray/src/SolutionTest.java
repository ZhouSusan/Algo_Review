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

    @org.junit.jupiter.api.Test
    void binarySearch() {
        int[] testCase1 = {-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-5,0,1,2,3,4};
        int target1 = -10;
        int expected1 = 0; // starting position of a given value target
        int expected2 = 10; // last position of a given value target

        int[] testCase2 = {-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-10,-5,0,1,2,3,4};
        int target2 = 0;
        int expected3 = 12; // starting position of a given value target
        int expected4 = 12; // last position of a given value target

        int[] testCase3 = {-20,-20,-9,-6,-6,-3,-2,-2,-2,-2,-2,-2,-1};
        int target3 = -2;
        int expected5 = 6; // starting position of a given value target
        int expected6 = 11; // last position of a given value target

        int[] testCase4 = {0,1};
        int target4 = 2;
        int expected7 = -1; // starting position of a given value target
        int expected8 = -1; // last position of a given value target

        int[] testCase5 = {1};
        int target5 = 1;
        int expected9 = 0; // starting position of a given value target
        int expected10 = 0; // last position of a given value target

        int actual1 = Solution.binarySearch(testCase1, target1, true);
        int actual2 = Solution.binarySearch(testCase1, target1, false);
        int actual3 = Solution.binarySearch(testCase2, target2, true);
        int actual4 = Solution.binarySearch(testCase2, target2, false);
        int actual5 = Solution.binarySearch(testCase3, target3, true);
        int actual6 = Solution.binarySearch(testCase3, target3, false);
        int actual7 = Solution.binarySearch(testCase4, target4, true);
        int actual8 = Solution.binarySearch(testCase4, target4, false);
        int actual9 = Solution.binarySearch(testCase5, target5, true);
        int actual10 = Solution.binarySearch(testCase5, target5, false);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
        assertEquals(expected9, actual9);
        assertEquals(expected10, actual10);
    }
}