import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @org.junit.jupiter.api.Test
    void bubbleSort() {

        // Arrange
        int[] testCase1 = { -2, 45, 0, 11, -9 };
        int[] testCase2 = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int[] testCase3 = {3};
        int[] testCase4 = {};
        int[] testCase5 = null;

        int testCaseSize1 = 5;
        int testCaseSize2 = 10;
        int testCaseSize3 = 1;
        int testCaseSize4 = 0;

        // Act
        BubbleSort.bubbleSort(testCase1);
        BubbleSort.bubbleSort(testCase2);
        BubbleSort.bubbleSort(testCase3);
        BubbleSort.bubbleSort(testCase4);
        BubbleSort.bubbleSort(testCase5);

        // Asset
        assertNotNull(testCase1);
        assertEquals(testCaseSize1, testCase1.length);
        assertArrayEquals(new int[] {-9, -2, 0, 11, 45 }, testCase1);

        assertNotNull(testCase2);
        assertEquals(testCaseSize2, testCase2.length);
        assertArrayEquals(new int[] {6, 8, 19, 20, 23, 41, 49, 53, 56, 87}, testCase2);

        assertNotNull(testCase3);
        assertEquals(testCaseSize3, testCase3.length);
        assertArrayEquals(new int[] {3}, testCase3);

        assertNotNull(testCase4);
        assertEquals(testCaseSize4, testCase4.length);
        assertArrayEquals(new int[] {}, testCase4);

        assertNull(testCase5);
    }
}