import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchingTest {

    @org.junit.jupiter.api.Test
    void linearSearchTest() {
        // Arrange
        int[] testCaseOne = new int[] {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int expectedOne = 7;
        int expectedTwo = 1;
        int expectedThree = -1;


        // Act
        int actualOne = Searching.linearSearch(testCaseOne, 41);
        int actualTwo = Searching.linearSearch(testCaseOne, 20);
        int actualThree = Searching.linearSearch(testCaseOne, 100);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
    }

    @org.junit.jupiter.api.Test
    void binarySearchTest() {
        // Arrange
        int[] testCaseOne = new int[] {-10, -6, 0, 8, 19, 56, 23, 87, 49, 53};
        int[] testCaseTwo = new int[] {0, 10, 20, 30, 40};
        int[] testCaseThree = new int[] {};
        int[] testCaseFour = null;

        int expectedOne = 2;
        int expectedTwo = 4;
        int expectedThree = 7;
        int expectedFour = 0;
        int expectedFive = -1;
        int expectedSix = 4;
        int expectedSeven = -1;
        int expectedEight = -1;

        // Act
        int actualOne = Searching.binarySearch(testCaseOne, 0);
        int actualTwo = Searching.binarySearch(testCaseOne, 19);
        int actualThree = Searching.binarySearch(testCaseOne, 87);
        int actualFour = Searching.binarySearch(testCaseTwo, 0);
        int actualFive = Searching.binarySearch(testCaseTwo, 50);
        int actualSix = Searching.binarySearch(testCaseTwo, 40);
        int actualSeven = Searching.binarySearch(testCaseThree, 2);
        int actualEight = Searching.binarySearch(testCaseFour, 4);

        // Assert
        assertNotNull(actualOne);
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);

        assertNotNull(actualFour);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);

        assertEquals(expectedSeven, actualSeven);
        assertEquals(expectedEight, actualEight);
    }
}