import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findIntersection() {
        // Arrange
        String[] testCase1 = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        String expected1 = "1,4,13";

        String[] testCase2 = {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
        String expected2 = "1,9,10";

        String[] testCase3 = {"1, 2, 3, 4, 5", "6, 7, 8, 9, 10"};
        String expected3 = "false";

        String[] testCase4 = {"11", "1, 4, 9, 11"};
        String expected4 = "11";

        String[] testCase5 = {"-3, -1, 0, 9, 10, 17, 18", "-1, 4, 9, 19"};
        String expected5 = "-1,9";

        // Act
        String actual1 = Solution.findIntersection(testCase1);
        String actual2 = Solution.findIntersection(testCase2);
        String actual3 = Solution.findIntersection(testCase3);
        String actual4 = Solution.findIntersection(testCase4);
        String actual5 = Solution.findIntersection(testCase5);


        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}