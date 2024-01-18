import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        // Arrange
        String testCase1 = "civic";
        boolean expected1 = true;

        String testCase2 = "rotator";
        boolean expected2 = true;

        String testCase3 = "borroworrob";
        boolean expected3 = true;

        String testCase4 = "hannah";
        boolean expected4 = true;

        String testCase5 = "rotator";
        boolean expected5 = true;

        String testCase6 = "raceacar";
        boolean expected6 = false;

        String testCase7 = "mama";
        boolean expected7 = false;

        String testCase8 = "abababba";
        boolean expected8 = false;

        String testCase9 = "abc";
        boolean expected9 = false;

        String testCase10 = "v";
        boolean expected10 = true;

        String testCase11 = "";
        boolean expected11 = true;

        // Act
        boolean actual1 = Solution.isPalindrome(testCase1);
        boolean actual2 = Solution.isPalindrome(testCase2);
        boolean actual3 = Solution.isPalindrome(testCase3);
        boolean actual4 = Solution.isPalindrome(testCase4);
        boolean actual5 = Solution.isPalindrome(testCase5);
        boolean actual6 = Solution.isPalindrome(testCase6);
        boolean actual7 = Solution.isPalindrome(testCase7);
        boolean actual8 = Solution.isPalindrome(testCase8);
        boolean actual9 = Solution.isPalindrome(testCase9);
        boolean actual10 = Solution.isPalindrome(testCase10);
        boolean actual11 = Solution.isPalindrome(testCase11);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
        assertEquals(expected9, actual9);
        assertEquals(expected10, actual10);
        assertEquals(expected11, actual11);
    }
}