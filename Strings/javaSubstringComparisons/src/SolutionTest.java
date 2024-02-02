import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void getSmallestAndLargest() {
        // Arrange
        String testCase1Str = "welcometojava";
        int testCase1K = 3;
        String expected1 = "ava" + "\n" + "wel";

        String testCase2Str = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        int testCase2K = 7;
        String expected2 = "zzzzzzz" + "\n" + "zzzzzzz";

        String testCase3Str = "GilmoreGirls";
        int testCase3K = 1;
        String expected3 = "G" + "\n" + "s";

        String testCase4Str = "breakingbad";
        int testCase4K = 2;
        String expected4 = "ad" + "\n" + "re";

        String testCase5Str = "x";
        int testCase5K = 0;
        String expected5 = "" + "\n" + "";

        // Act
        String actual1 = Solution.getSmallestAndLargest(testCase1Str, testCase1K);
        String actual2 = Solution.getSmallestAndLargest(testCase2Str, testCase2K);
        String actual3 = Solution.getSmallestAndLargest(testCase3Str, testCase3K);
        String actual4 = Solution.getSmallestAndLargest(testCase4Str, testCase4K);
        String actual5 = Solution.getSmallestAndLargest(testCase5Str, testCase5K);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}