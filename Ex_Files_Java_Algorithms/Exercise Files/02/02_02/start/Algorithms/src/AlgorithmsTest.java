import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void linearSearchTest() {
        int[] arrTestCaseOne = {};
        int[] arrTestCaseTwo = {1};
        int[] arrTestCaseThree = { 1, 2, 3, 4, 5, 6 };
        Integer expectedTwo = 1;
        Integer expectedThree = 5;
        Integer expectedNull = null;

        Integer actualOne = Algorithms.linearSearch(arrTestCaseOne, -1);
        Integer actualTwo = Algorithms.linearSearch(arrTestCaseTwo, 1);
        Integer actualThree = Algorithms.linearSearch(arrTestCaseThree, 5);
        Integer actualFour = Algorithms.linearSearch(arrTestCaseThree, -9);

        assertNull(actualOne);
        assertEquals(expectedNull, actualOne);
        assertNotNull(actualTwo);
        assertEquals(expectedTwo, actualTwo);
        assertNotNull(actualThree);
        assertEquals(expectedThree, actualThree);
        assertNull(actualFour);
        assertEquals(expectedNull, actualFour);
    }

    @org.junit.jupiter.api.Test
    void linearSearch2Test() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int expectedOne = 6;

        OptionalInt actualOne = Algorithms.linearSearch2(arr, 6);
        OptionalInt actualTwo = Algorithms.linearSearch2(arr, -9);

        assertTrue(actualOne.isPresent());
        assertEquals(expectedOne, actualOne.getAsInt());
        assertTrue(actualTwo.isEmpty());
    }
}