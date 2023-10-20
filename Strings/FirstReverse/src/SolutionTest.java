import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void firstReverse() {
        // Arrange
        String testCase1 = "Hello World and Coders";
        String expected1 = "sredoC dna dlroW olleH";

        String testCase2 = "Recess Cups && Ice Creams || Cake!";
        String expected2 = "!ekaC || smaerC ecI && spuC sseceR";

        String testCase3 = "1 Lo-----ve C0de   ";
        String expected3 = "   ed0C ev-----oL 1";

        String testCase4 = "eee";
        String expected4 = "eee";

        String testCase5 = "q";
        String expected5 = "q";

        String testCase6 = "";
        String expected6 = "";

        String testCase7 = null;
        String expected7 = "";

        String testCase8 = "     1-2-3-4-5-6-7-8-9-10     ";
        String expected8 = "     01-9-8-7-6-5-4-3-2-1     ";

        // Act
        String actual1 = Solution.firstReverse(testCase1);
        String actual2 = Solution.firstReverse(testCase2);
        String actual3 = Solution.firstReverse(testCase3);
        String actual4 = Solution.firstReverse(testCase4);
        String actual5 = Solution.firstReverse(testCase5);
        String actual6 = Solution.firstReverse(testCase6);
        String actual7 = Solution.firstReverse(testCase7);
        String actual8 = Solution.firstReverse(testCase8);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
    }
}