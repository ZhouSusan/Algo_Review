import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void linearSearch() {
        int[] arrTestCaseOne = {};
        int[] arrTestCaseTwo = {1};
        int[] arrTestCaseThree = {1, 5, 17, 19, 30, -5, 10, -9};
        int[] arrTestCaseFour = null;

        boolean actualOne = Algorithms.linearSearch(arrTestCaseOne, 2);
        boolean actualTwo = Algorithms.linearSearch(arrTestCaseTwo, 9);
        boolean actualThree = Algorithms.linearSearch(arrTestCaseThree, -5);
        boolean actualFour = Algorithms.linearSearch(arrTestCaseFour, 1);

        assertEquals(arrTestCaseOne.length, 0);
        assertNotNull(actualOne);
        assertFalse(actualOne);
        assertEquals(arrTestCaseTwo.length, 1);
        assertNotNull(actualTwo);
        assertFalse(actualTwo);
        assertEquals(arrTestCaseThree.length, 8);
        assertNotNull(actualThree);
        assertTrue(actualThree);
        assertFalse(actualFour);
    }
}