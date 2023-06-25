import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void binarySearch() {
        int[] arrOne = {};
        int[] arrTwo = {1, 2, 3, 17, 21, 32, 45, 46};

        boolean actualOne = Algorithms.binarySearch(arrOne, 3);
        boolean actualTwo = Algorithms.binarySearch(arrTwo, 45);
        boolean actualThree = Algorithms.binarySearch(arrTwo, 3);
        boolean actualFour = Algorithms.binarySearch(arrTwo, 29);

        assertFalse(actualOne);
        assertTrue(actualTwo);
        assertTrue(actualThree);
        assertFalse(actualFour);
    }
}