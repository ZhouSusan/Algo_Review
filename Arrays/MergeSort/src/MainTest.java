import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void mergeTest() {
        // Arrange
        int[] testcase1a = {17, 20, 31};
        int[] testcase1b = {5, 19, 29};
        int[] expected1 = {5, 17, 19, 20, 29, 31};

        int[] testcase2a = {-3, 0, 48};
        int[] testcase2b = { -20, -12, 61};
        int[] expected2 = {-20, -12, -3, 0, 48, 61};

        int[] testcase3a = {1, 2, 3};
        int[] testcase3b = {};
        int[] expected3 = {1, 2, 3};

        int[] testcase4a = {};
        int[] testcase4b = {-3, -2, -1};
        int[] expected4 = {-3, -2, -1};

        int[] testcase5a = {};
        int[] testcase5b = {};
        int[] expected5 = {};

        // Act
        int[] actual1 = Main.merge(testcase1a, testcase1b);
        int[] actual2 = Main.merge(testcase2a, testcase2b);
        int[] actual3 = Main.merge(testcase3a, testcase3b);
        int[] actual4 = Main.merge(testcase4a, testcase4b);
        int[] actual5 = Main.merge(testcase5a, testcase5b);

        // Assert
        assertNotNull(actual1);
        assertEquals(testcase1b.length+ testcase1a.length, actual1.length);
        assertArrayEquals(expected1, actual1);

        assertNotNull(actual2);
        assertEquals(testcase2a.length+ testcase2b.length, actual2.length);
        assertArrayEquals(expected2, actual2);

        assertNotNull(actual3);
        assertEquals(testcase3a.length+ testcase3b.length, actual3.length);
        assertArrayEquals(expected3, actual3);

        assertNotNull(actual4);
        assertEquals(testcase4a.length+ testcase4b.length, actual4.length);
        assertArrayEquals(expected4, actual4);

        assertNotNull(actual5);
        assertEquals(0, actual5.length);
        assertArrayEquals(expected5, actual5);
    }

    @org.junit.jupiter.api.Test
    void mergeSortTest() {
        // Arrange
        int[] testcase1 = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int[] expected1 = {6, 8, 19, 20, 23, 41, 49, 53, 56, 87};

        int[] testcase2 = new int[] {-9, -2, 0, 1, 45, 8 };
        int[] expected2 = new int[] {-9, -2, 0, 1, 8, 45 };

        int[] testcase3 = new int[] {5,3,1,8,7,2,4,2,5,1,2,3,6};
        int[] expected3 = new int[] {1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6, 7, 8};

        int[] testcase4 = new int[] {-13,-12, -20, -2, -4, -10};
        int[] expected4 = new int[] {-20, -13, -12, -10, -4, -2};

        int[] testcase5 = new int[] {1};
        int[] expected5 = new int[] {1};

        int[] testcase6 = new int[] {};
        int[] expected6 = new int[] {};

        // Act
        int[] actual1 = Main.mergeSort(testcase1, 0, testcase1.length-1);
        int[] actual2 = Main.mergeSort(testcase2, 0, testcase2.length-1);
        int[] actual3 = Main.mergeSort(testcase3, 0, testcase3.length-1);
        int[] actual4 = Main.mergeSort(testcase4, 0, testcase4.length-1);
        int[] actual5 = Main.mergeSort(testcase5, 0, testcase5.length-1);
        int[] actual6 = Main.mergeSort(testcase6, 0, 0);

        // Assert
        assertNotNull(actual1);
        assertEquals(testcase1.length, actual1.length);
        assertArrayEquals(expected1, actual1);

        assertNotNull(actual2);
        assertEquals(testcase2.length, actual2.length);
        assertArrayEquals(expected2, actual2);

        assertNotNull(actual3);
        assertEquals(testcase3.length, actual3.length);
        assertArrayEquals(expected3, actual3);

        assertNotNull(actual4);
        assertEquals(testcase4.length, actual4.length);
        assertArrayEquals(expected4, actual4);

        assertNotNull(actual5);
        assertTrue(actual5.length == 1);
        assertArrayEquals(expected5, actual5);

        assertNotNull(actual6);
        assertTrue(actual6.length == 0);
        assertArrayEquals(expected6, actual6);
    }
}