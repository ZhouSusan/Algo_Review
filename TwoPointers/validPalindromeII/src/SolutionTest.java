import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void validPalindrome() {
        // Arrange
        String testCase1 = "aba";
        boolean expected1 = true;

        String testCase2 = "tftgtft";
        boolean expected2 = true;

        String testCase3 = "lafalatralafal";
        boolean expected3 = true;

        String testCase4 = "efg";
        boolean expected4 = false;

        String testCase5 = "topgolftimefolgpot";
        boolean expected5 = false;

        String testCase6 = "aaaaaaaaaaaaaabdaaaaaaaaaataaa";
        boolean expected6 = false;

        String testCase7 = "a";
        boolean expected7 = true;

        // Act
        boolean actual1 = Solution.validPalindrome(testCase1);
        boolean actual2 = Solution.validPalindrome(testCase2);
        boolean actual3 = Solution.validPalindrome(testCase3);
        boolean actual4 = Solution.validPalindrome(testCase4);
        boolean actual5 = Solution.validPalindrome(testCase5);
        boolean actual6 = Solution.validPalindrome(testCase6);
        boolean actual7 = Solution.validPalindrome(testCase7);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
    }

    @org.junit.jupiter.api.Test
    void isSubStringPalindrome() {
        // Arrange
        String testCase1 = "abbe";
        boolean expected1 = false;

        String testCase2 = "abca";
        boolean expected2 = true;
        boolean expected3 = true;

        String testCase3 = "abchpcba";
        boolean expected4 = true;
        boolean expected5 = true;

        String testCase4 = "raceatcar";
        boolean expected6 = false;
        boolean expected7 = false;

        // Act
        boolean actual1 = Solution.isSubStringPalindrome(testCase1, 0, testCase1.length()-1);
        boolean actual2 = Solution.isSubStringPalindrome(testCase2, 2, 2);
        boolean actual3 = Solution.isSubStringPalindrome(testCase2, 1, 1);
        boolean actual4 = Solution.isSubStringPalindrome(testCase3, 4, 4);
        boolean actual5 = Solution.isSubStringPalindrome(testCase3, 3, 3);
        boolean actual6 = Solution.isSubStringPalindrome(testCase4, 4, 5);
        boolean actual7 = Solution.isSubStringPalindrome(testCase4, 3, 4);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
    }
}