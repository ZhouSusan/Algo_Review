import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void reverse() {
        int[] arrTestCaseOne = { 1, 2, 3, 4, 5, 6 };
        int[] arrTestCaseTwo = new int[0];
        int[] arrTestCaseThree = {-9};
        int[] arrTestCaseFour = { -20, -12, -3, 0 , 1, 10 };
        int[] arrTestCaseFive = null;

        int[] expectedOne = {6, 5, 4, 3, 2, 1};
        int[] expectedTwo = {};
        int[] expectedThree = {-9};
        int[] expectedFour = {10, 1, 0, -3, -12, -20};
        int[] expectedFive = new int[0];

        int[] actualOne = Algorithms.reverse(arrTestCaseOne);
        int[] actualTwo = Algorithms.reverse(arrTestCaseTwo);
        int[] actualThree = Algorithms.reverse(arrTestCaseThree);
        int[] actualFour = Algorithms.reverse(arrTestCaseFour);
        int[] actualFive = Algorithms.reverse(arrTestCaseFive);

        assertArrayEquals(expectedOne, actualOne);
        assertArrayEquals(expectedTwo, actualTwo);
        assertArrayEquals(expectedThree, actualThree);
        assertArrayEquals(expectedFour, actualFour);
        assertArrayEquals(expectedFive, actualFive);
        assertNotNull(actualFive);
    }

    @org.junit.jupiter.api.Test
    void reverseInPlace() {
        int[] arrTestCaseOne = { 1, 2, 3, 4, 5, 6 };
        int[] arrTestCaseTwo = new int[0];

        int[] expectedOne = {6, 5, 4, 3, 2, 1};
        int[] expectedTwo = {};

        Algorithms.reverseInPlace(arrTestCaseOne);
        assertArrayEquals(arrTestCaseOne, expectedOne);

        Algorithms.reverseInPlace(arrTestCaseTwo);
        assertArrayEquals(arrTestCaseTwo, expectedTwo);
    }
}