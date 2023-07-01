import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void findEvenNums() {
        // Arrange
        int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };
        int[] arr3 = {};
        int[] arr4 = {};
        int[] arr5 = null;
        int[] arr6 = null;
        int[] arr7 = {0, 4};

        int[] expectedOne = {2, -8, 12,-16, 0, -8, 40, 20};
        int[] expectedTwo = {};
        int[] expectedThree = {};
        int[] expectedFour = {0, 4};
        int[] expectedFive = {2, -8, 12, -16};

        // Act
        int[] actualOne = Algorithms.findEvenNums(arr1, arr2);
        int[] actualTwo = Algorithms.findEvenNums(arr3, arr4);
        int[] actualThree = Algorithms.findEvenNums(arr5, arr6);
        int[] actualFour = Algorithms.findEvenNums(arr3, arr7);
        int[] actualFive = Algorithms.findEvenNums(arr1, arr4);

        // Assert
        assertArrayEquals(expectedOne, actualOne);
        assertArrayEquals(expectedTwo, actualTwo);
        assertArrayEquals(expectedThree, actualThree);
        assertNotNull(actualThree);
        assertArrayEquals(expectedFour, actualFour);
        assertArrayEquals(expectedFive, actualFive);
    }

    @org.junit.jupiter.api.Test
    void findEvenNumbers2() {

        // Arrange
        int[] arr1 = { -9, 3, 2, -8, 12, -16 };
        int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };
        int[] arr3 = {};
        int[] arr4 = {};
        int[] arr5 = null;
        int[] arr6 = null;
        int[] arr7 = {1, 3, 6};

        int[] expectedOne = {2, -8, 12,-16, 0, -8, 40, 20};
        int[] expectedTwo = {};
        int[] expectedThree = {};
        int[] expectedFour = {6};
        int[] expectedFive = {0, -8, 40, 20};

        // Act
        int[] actualOne = Algorithms.findEvenNumbers2(arr1, arr2);
        int[] actualTwo = Algorithms.findEvenNums(arr3, arr4);
        int[] actualThree = Algorithms.findEvenNums(arr5, arr6);
        int[] actualFour = Algorithms.findEvenNums(arr7, arr3);
        int[] actualFive = Algorithms.findEvenNums(arr2, arr4);

        // Assert
        assertArrayEquals(expectedOne, actualOne);
        assertArrayEquals(expectedTwo, actualTwo);
        assertArrayEquals(expectedThree, actualThree);
        assertNotNull(actualThree);
        assertArrayEquals(expectedFour, actualFour);
        assertArrayEquals(expectedFive, actualFive);
    }
}