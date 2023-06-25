import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void reverse() {
        int[] arrTestCaseOne = { 1, 2, 3, 4, 5, 6 };
        int[] arrTestCaseTwo = new int[0];

        int[] expectedOne = {6, 5, 4, 3, 2, 1};
        int[] expectedTwo = {};

        int[] actualOne = Algorithms.reverse(arrTestCaseOne);
        int[] actualTwo = Algorithms.reverse(arrTestCaseTwo);

        assertArrayEquals(expectedOne, actualOne);
        assertArrayEquals(expectedTwo, actualTwo);
    }
}