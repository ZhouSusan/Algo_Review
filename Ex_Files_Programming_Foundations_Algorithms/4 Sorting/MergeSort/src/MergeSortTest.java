import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @org.junit.jupiter.api.Test
    void mergeSortTest() {
        // Arrange
        int [] testCaseOne = {12, 1, -10, 50, 5, -15, 45};
        int [] testCaseTwo = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int [] testCaseThree = {1};
        int [] testCaseFour = {-6, -29, -12, -8};
        int [] testCaseFive = new int[0];
        int[] testCaseSix = null;

        int expectedLengthOne = 7;
        int expectedLengthTwo = 10;
        int expectedLengthThree = 1;
        int expectedLengthFour = 4;
        int expectedLengthFive = 0;

        int[] expectedOne = new int[] {-15, -10, 1, 5, 12, 45, 50};
        int[] expectedTwo = new int[] {6, 8, 19, 20, 23, 41, 49, 53, 56, 87};
        int[] expectedThree = new int[] {1};
        int[] expectedFour = new int[] {-29, -12, -8, -6};
        int[] expectedFive = new int[] {};

        // Act
        MergeSort.mergeSort(testCaseOne, expectedLengthOne);
        MergeSort.mergeSort(testCaseTwo, expectedLengthTwo);
        MergeSort.mergeSort(testCaseThree, expectedLengthThree);
        MergeSort.mergeSort(testCaseFour, expectedLengthFour);
        MergeSort.mergeSort(testCaseFive, expectedLengthFive);
        MergeSort.mergeSort(testCaseSix, null);

        // Act
        assertNotNull(testCaseOne);
        assertEquals(expectedLengthOne, testCaseOne.length);
        assertArrayEquals(expectedOne, testCaseOne);

        assertNotNull(testCaseTwo);
        assertEquals(expectedLengthTwo, testCaseTwo.length);
        assertArrayEquals(expectedTwo, testCaseTwo);

        assertNotNull(testCaseThree);
        assertEquals(expectedLengthThree, testCaseThree.length);
        assertArrayEquals(expectedThree, testCaseThree);

        assertNotNull(testCaseFour);
        assertEquals(expectedLengthFour, testCaseFour.length);
        assertArrayEquals(expectedFour, testCaseFour);

        assertNotNull(testCaseFive);
        assertEquals(expectedLengthFive, testCaseFive.length);
        assertArrayEquals(expectedFive, testCaseFive);

        assertNull(testCaseSix);
    }
}