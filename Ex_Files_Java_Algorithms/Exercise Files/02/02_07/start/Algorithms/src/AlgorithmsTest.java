import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void rotateArrayLeft() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        int[] expected = {2, 3, 4, 5, 6, 7, 1};

        Algorithms.rotateArrayLeft(arr);
        assertArrayEquals(arr,expected);
    }

    @org.junit.jupiter.api.Test
    void rotateArrayRight() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7};
        int[] expected = {7, 1, 2, 3, 4, 5, 6};

        Algorithms.rotateArrayRight(arr);
        assertArrayEquals(arr, expected);
    }
}