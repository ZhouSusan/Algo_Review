import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void rotateArrayLeft() {
        // Arrange
        int[] arrTestCase1 = { 1, 2, 3, 4, 5, 6, 7};
        int[] arrTestCase2 = {1};
        int[] arrTestCase3 = {};
        int[] arrTestCase4 = null;

        int[] expectedOne = {2, 3, 4, 5, 6, 7, 1};
        int[] expectedTwo = {1};
        int[] expectedThree = {};

        // Act
        Algorithms.rotateArrayLeft(arrTestCase1);
        Algorithms.rotateArrayLeft(arrTestCase2);
        Algorithms.rotateArrayLeft(arrTestCase3);
        Algorithms.rotateArrayLeft(arrTestCase4);

        // Assert
        assertNotNull(arrTestCase1);
        assertEquals(arrTestCase1.length, expectedOne.length);
        assertArrayEquals(arrTestCase1,expectedOne);
        assertEquals(arrTestCase1.length, 7);
        assertEquals(arrTestCase1[0], 2);
        assertEquals(arrTestCase1[arrTestCase1.length-1], 1);

        assertNotNull(arrTestCase2);
        assertEquals(arrTestCase2.length, expectedTwo.length);
        assertEquals(arrTestCase2.length, 1);
        assertArrayEquals(arrTestCase2,expectedTwo);
        assertEquals(arrTestCase2[0], expectedTwo[0]);

        assertNotNull(arrTestCase3);
        assertEquals(arrTestCase3.length, expectedThree.length);
        assertEquals(arrTestCase3.length, 0);
        assertArrayEquals(arrTestCase3,expectedThree);

        assertNull(arrTestCase4);
    }

    @org.junit.jupiter.api.Test
    void rotateArrayRight() {
        // Arrange
        int[] arrTestCase1 = { 1, 2, 3, 4, 5, 6, 7};
        int[] arrTestCase2 = {-8};
        int[] arrTestCase3 = {};
        int[] arrTestCase4 = null;

        int[] expectedOne = {7, 1, 2, 3, 4, 5, 6};
        int[] expectedTwo = {-8};
        int[] expectedThree = {};

        // Act
        Algorithms.rotateArrayRight(arrTestCase1);
        Algorithms.rotateArrayRight(arrTestCase2);
        Algorithms.rotateArrayRight(arrTestCase3);
        Algorithms.rotateArrayRight(arrTestCase4);

        // Assert
        assertNotNull(arrTestCase1);
        assertEquals(arrTestCase1.length, expectedOne.length);
        assertArrayEquals(arrTestCase1, expectedOne);
        assertEquals(arrTestCase1.length, 7);
        assertEquals(arrTestCase1[0], 7);
        assertEquals(arrTestCase1[arrTestCase1.length-1], 6);

        assertNotNull(arrTestCase2);
        assertEquals(arrTestCase2.length, expectedTwo.length);
        assertEquals(arrTestCase2.length, 1);
        assertArrayEquals(arrTestCase2,expectedTwo);
        assertEquals(arrTestCase2[0], expectedTwo[0]);

        assertNotNull(arrTestCase3);
        assertEquals(arrTestCase3.length, expectedThree.length);
        assertEquals(arrTestCase3.length, 0);
        assertArrayEquals(arrTestCase3,expectedThree);

        assertNull(arrTestCase4);
    }
}