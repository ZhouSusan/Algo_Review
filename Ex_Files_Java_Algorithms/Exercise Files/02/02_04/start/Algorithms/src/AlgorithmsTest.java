import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    int[] arr1 = { -9, 3, 2, -8, 12, -16 };
    int[] arr2 = { 0, -3, -8, -35, 40, 20, 7 };

    @org.junit.jupiter.api.Test
    void findEvenNums() {
    int[] actual = Algorithms.findEvenNums(arr1, arr2);
    int[] expected = {2, -8, 12,-16, 0, -8, 40, 20};

    assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findEvenNumbers2() {
        int[] actual = Algorithms.findEvenNumbers2(arr1, arr2);
        int[] expected = {2, -8, 12,-16, 0, -8, 40, 20};

        assertArrayEquals(expected, actual);
    }
}