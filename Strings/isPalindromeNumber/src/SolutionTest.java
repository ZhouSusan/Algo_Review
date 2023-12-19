import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        // Arrange
        int testCase1 = 1212121;
        boolean expected1 = true;

        int testCase2 = -99999;
        boolean expected2 = false;

        int testCase3 = 43210;
        boolean expected3 = false;

        int testCase4 = 1111;
        boolean expected4 = true;

        int testCase5 = 7;
        boolean expected5 = true;

        int testCase6 = -2;
        boolean expected6 = false;

        int testCase7 = 0;
        boolean expected7 = true;

        // Act
        boolean actual1 = Solution.isPalindrome(testCase1);
        boolean actual2 = Solution.isPalindrome(testCase2);
        boolean actual3 = Solution.isPalindrome(testCase3);
        boolean actual4 = Solution.isPalindrome(testCase4);
        boolean actual5 = Solution.isPalindrome(testCase5);
        boolean actual6 = Solution.isPalindrome(testCase6);
        boolean actual7 = Solution.isPalindrome(testCase7);

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