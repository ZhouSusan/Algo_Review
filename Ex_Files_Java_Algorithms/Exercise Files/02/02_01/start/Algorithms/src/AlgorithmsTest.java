import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void linearSearch() {
        int[] arrTestCaseOne = {};
        int[] arrTestCaseTwo = {1};
        int[] arrTestCaseThree = {1, 5, 17, 19, 30, -5, 10, -9};

        boolean actualOne = Algorithms.linearSearch(arrTestCaseOne, 2);
        boolean actualTwo = Algorithms.linearSearch(arrTestCaseTwo, 9);
        boolean actualThree = Algorithms.linearSearch(arrTestCaseThree, -5);

        assertFalse(actualOne);
        assertFalse(actualTwo);
        assertTrue(actualThree);
    }
}