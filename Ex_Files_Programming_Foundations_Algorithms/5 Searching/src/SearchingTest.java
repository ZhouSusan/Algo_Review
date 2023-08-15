import static org.junit.jupiter.api.Assertions.*;

class SearchingTest {

    @org.junit.jupiter.api.Test
    void linearSearchTest() {
        // Arrange
        int[] testCaseOne = new int[] {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int expectedOne = 7;
        int expectedTwo = 1;
        int expectedThree = -1;


        // Act
        int actualOne = Searching.LinearSearch(testCaseOne, 41);
        int actualTwo = Searching.LinearSearch(testCaseOne, 20);
        int actualThree = Searching.LinearSearch(testCaseOne, 100);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
    }
}