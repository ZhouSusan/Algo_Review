import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSort2Test {

    @Test
    void mergeTest() {
        // Arrange
        int[] arr1 = new int[] {-2, 0, 1};
        int[] arr2 = new int[] {-9, 45, 8};
        int[] expectedOne = new int[] {-9, -2, 0, 1, 45, 8 };

        // Act
        int[] actualOne = MergeSort2.merge(arr1, arr2);

        // Assert
        assertEquals(expectedOne.length, actualOne.length);
        assertArrayEquals(expectedOne, actualOne);
    }

    @Test
    void mergeSortTest() {
        // Arrange
        int[] testCaseOne = new int[] {-9, -2, 0, 1, 45, 8 };
        int[] testCaseTwo = new int[] {1};
        int[] expectedOne = new int[] {-9, -2, 0, 1, 8, 45 };
        int[] expectedTwo = new int[] {1};

        // Act
        int[] actualOne = MergeSort2.mergeSort(testCaseOne, 0, testCaseOne.length-1);
        int[] actualTwo = MergeSort2.mergeSort(testCaseTwo, 0, testCaseTwo.length-1);
        // Act
        assertArrayEquals(expectedOne, actualOne);
        assertArrayEquals(expectedTwo, actualTwo);
    }
}