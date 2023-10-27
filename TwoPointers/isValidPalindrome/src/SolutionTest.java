import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        // Arrange
        String testCase1 = "A man, a plan, a canal: Panama";
        boolean expected1 = true;

        String testCase2 = "Delia saw I was ailed.";
        boolean expected2 = true;

        String testCase3 = "r a,ce A c?a/r!";
        boolean expected3 = false;

        String testCase4 = "R a,c#E  % c?a/r!";
        boolean expected4 = true;

        String testCase5 = "r0";
        boolean expected5 = false;

        String testCase6 = "100301";
        boolean expected6 = false;

        String testCase7 = "@123%4#321";
        boolean expected7 = true;

        String testCase8 = "         A +    b = b,,,,,,,,,   a  ";
        boolean expected8 = true;

        String testCase9 = "sS";
        boolean expected9 = true;

        String testCase10 = " ";
        boolean expected10 = true;

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
    }
}