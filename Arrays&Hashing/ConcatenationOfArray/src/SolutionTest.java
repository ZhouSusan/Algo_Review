import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void getConcatenationTest() {
        // Arrange
        int[] testcase1 = {1, 2, 3, 4, 5};
        int[] expected1 = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};

        int[] testcase2 = {2, 3, 2};
        int[] expected2 = {2, 3, 2, 2, 3, 2};

        int[] testcase3 = {111, 220, 313, 891, 8};
        int[] expected3 = { 111, 220, 313, 891, 8, 111, 220, 313, 891, 8};

        int[] testcase4 = {1000};
        int[] expected4 = {1000, 1000};

        // Act
        int[] actual1 = Solution.getConcatenation(testcase1);
        int[] actual2 = Solution.getConcatenation(testcase2);
        int[] actual3 = Solution.getConcatenation(testcase3);
        int[] actual4 = Solution.getConcatenation(testcase4);

        // Assert
        assertNotNull(actual1);
        assertArrayEquals(expected1, actual1);
        assertTrue(expected1.length == actual1.length);
        assertTrue(actual1.length == 10);

        assertNotNull(actual2);
        assertArrayEquals(expected2, actual2);
        assertTrue(expected2.length == actual2.length);
        assertTrue(actual2.length == 6);

        assertNotNull(actual3);
        assertArrayEquals(expected3, actual3);
        assertTrue(expected3.length == actual3.length);
        assertTrue(actual3.length > 5);

        assertNotNull(actual4);
        assertArrayEquals(expected4, actual4);
        assertTrue(expected4.length == actual4.length);
        assertTrue(actual4.length == 2);
    }
}