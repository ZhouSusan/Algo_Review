import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void linearSearch2() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int expectedOne = 5;

        OptionalInt actualOne = Algorithms.linearSearch2(arr, 5);
        OptionalInt actualTwo = Algorithms.linearSearch2(arr, -9);

        assertTrue(actualOne.isPresent());
        assertEquals(expectedOne, actualOne.getAsInt());
        assertTrue(actualTwo.isEmpty());
    }
}