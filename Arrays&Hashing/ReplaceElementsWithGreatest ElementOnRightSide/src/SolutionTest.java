import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void replaceElementsTest() {
        // Arrange
        int[] testcase1 = {17,18,5,4,6,1};
        int[] expected1 = { 18 ,6, 6, 6, 1, -1};

        int[] testcase2 = {1000, 2000};
        int[] expected2 = {2000, -1};

        int[] testcase3 = {10, 9, 8, 7};
        int[] expected3 = {9, 8, 7, -1};

        int[] testcase4 = {78};
        int[] expected4 = {-1};

        // Act
        Solution.replaceElements(testcase1);
        Solution.replaceElements(testcase2);
        Solution.replaceElements(testcase3);
        Solution.replaceElements(testcase4);

        //Assert
        assertNotNull(testcase1);
        assertEquals(6, testcase1.length);
        assertArrayEquals(expected1, testcase1);

        assertNotNull(testcase2);
        assertEquals(2, testcase2.length);
        assertArrayEquals(expected2, testcase2);

        assertNotNull(testcase3);
        assertEquals(4, testcase3.length);
        assertArrayEquals(expected3, testcase3);

        assertNotNull(testcase4);
        assertEquals(1, testcase4.length);
        assertArrayEquals(expected4, testcase4);
    }
}