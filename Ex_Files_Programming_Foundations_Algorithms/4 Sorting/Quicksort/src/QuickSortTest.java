import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @org.junit.jupiter.api.Test
    void quickSortTest() {
        // Arrange
        int[] testCaseOne = new int[] {20, 6, 8, 53, 56, 23, 87, 41, 49, 19};
        int[] expectedOne = new int[] {6, 8, 19, 20, 23, 41, 49, 53, 56, 87};

        // Act
        QuickSort.quickSort(testCaseOne, 0, testCaseOne.length-1);

        // Assert
        assertArrayEquals(expectedOne, testCaseOne);
    }
}