import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void bookIndexTest() {
        // Arrange
        int[] testcase1 = {1, 13, 14, 15, 37, 38, 70};
        String expected1 = "1, 13-15, 37-38, 70";

        int[] testcase2 = {5, 6, 7, 8, 9};
        String expected2 = "5-9";

        int[] testcase3 = {1, 2, 3, 7, 9, 15, 16, 17};
        String expected3 = "1-3, 7, 9, 15-17";

        int[] testcase4 = {12};
        String expected4 = "12";

        int[] testcase5 = {};
        String expected5 = "";

        int[] testcase6 = null;
        String expected6 = "";

        // Act
        String actual1 = Solution.bookIndex(testcase1);
        String actual2 = Solution.bookIndex(testcase2);
        String actual3 = Solution.bookIndex(testcase3);
        String actual4 = Solution.bookIndex(testcase4);
        String actual5 = Solution.bookIndex(testcase5);
        String actual6 = Solution.bookIndex(testcase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}