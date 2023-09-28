import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void moveZeroes() {
        // Arrange
        int[] testcase1 = {0, 1, 0, 3, 12};
        int[] expected1 = {1, 3, 12, 0, 0};

        int[] testcase2 = {-2, 0, -9, 0, -3, -17, 0};
        int[] expected2 = {-2, -9, -3, -17, 0, 0, 0};

        int[] testcase3 = {7, 0, -7, 0, -13, 0, 0, 13, 16};
        int[] expected3 = {7, -7, -13, 13, 16, 0, 0, 0, 0};

        int[] testcase4 = {0, 0, 0, 0};
        int[] expected4 = {0, 0, 0, 0};

        int[] testcase5 = {7, 0};
        int[] expected5 = {7, 0};

        int[] testcase6 = {0};
        int[] expected6 = {0};

        // Act
        Solution.moveZeroes(testcase1);
        Solution.moveZeroes(testcase2);
        Solution.moveZeroes(testcase3);
        Solution.moveZeroes(testcase4);
        Solution.moveZeroes(testcase5);
        Solution.moveZeroes(testcase6);

        // Assert
        assertArrayEquals(expected1, testcase1);
        assertEquals(5, testcase1.length);
        assertArrayEquals(expected2, testcase2);
        assertEquals(7, testcase2.length);
        assertArrayEquals(expected3, testcase3);
        assertEquals(9, testcase3.length);
        assertArrayEquals(expected4, testcase4);
        assertEquals(4, testcase4.length);
        assertArrayEquals(expected5, testcase5);
        assertEquals(2, testcase5.length);
        assertArrayEquals(expected6, testcase6);
        assertEquals(1, testcase6.length);
    }
}