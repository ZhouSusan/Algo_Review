import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @org.junit.jupiter.api.Test
    void findDay() {
        // Arrange
        int testCase1Month = 8;
        int testCase1Day = 14;
        int testCase1Year = 2017;
        String expected1 = "MONDAY";

        int testCase2Month = 8;
        int testCase2Day = 5;
        int testCase2Year = 2015;
        String expected2 = "WEDNESDAY";

        // Arrange
        int testCase3Month = 3;
        int testCase3Day = 1;
        int testCase3Year = 2050;
        String expected3 = "TUESDAY";

        int testCase4Month = 1;
        int testCase4Day = 1;
        int testCase4Year = 2024;
        String expected4 = "MONDAY";

        // Arrange
        int testCase5Month = 10;
        int testCase5Day = 18;
        int testCase5Year = 2098;
        String expected5 = "SATURDAY";

        // Act
        String actual1 = Solution.findDay(testCase1Month, testCase1Day, testCase1Year);
        String actual2 = Solution.findDay(testCase2Month, testCase2Day, testCase2Year);
        String actual3 = Solution.findDay(testCase3Month, testCase3Day, testCase3Year);
        String actual4 = Solution.findDay(testCase4Month, testCase4Day, testCase4Year);
        String actual5 = Solution.findDay(testCase5Month, testCase5Day, testCase5Year);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }

    @org.junit.jupiter.api.Test
    void findDayExpectedException() {
        int testCase1Month = 7;
        int testCase1Day = 14;
        int testCase1Year = 4047;
        String expectedMessage1 = "INVALID DATE";

        int testCase2Month = 1;
        int testCase2Day = 23;
        int testCase2Year = 1998;
        String expectedMessage2 = "INVALID DATE";

        Error exception1 = assertThrows(Error.class, () -> Solution.findDay(testCase1Month,testCase1Day,testCase1Year));
        String actualMessage1 = exception1.getMessage();
        assertTrue(actualMessage1.contains(expectedMessage1));

        Error exception2 = assertThrows(Error.class, () -> Solution.findDay(testCase2Month,testCase2Day,testCase2Year));
        String actualMessage2 = exception2.getMessage();
        assertTrue(actualMessage2.contains(expectedMessage2));
    }
}