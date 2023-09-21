import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isSubsequenceTest() {
        // Arrange
        String s1 = "axc", t1 = "ahbgdc";
        boolean expected1 = false;

        String s2 = "abc", t2 = "ahbgdc";
        boolean expected2 = true;

        String s3 = "aec", t3 = "abcde";
        boolean expected3 = false;

        String s4 = "ace", t4 = "abcde";
        boolean expected4 = true;

        String s5 = "ab", t5 = "a";
        boolean expected5 = false;

        String s6 = "a", t6 = "";
        boolean expected6 = false;

        String s7 = "", t7 = "egt";
        boolean expected7 = true;

        String s8 = "", t8 = "";
        boolean expected8 = true;

        // Act
        boolean actual1 = Solution.isSubsequence(s1, t1);
        boolean actual2 = Solution.isSubsequence(s2, t2);
        boolean actual3 = Solution.isSubsequence(s3, t3);
        boolean actual4 = Solution.isSubsequence(s4, t4);
        boolean actual5 = Solution.isSubsequence(s5, t5);
        boolean actual6 = Solution.isSubsequence(s6, t6);
        boolean actual7 = Solution.isSubsequence(s7, t7);
        boolean actual8 = Solution.isSubsequence(s8, t8);

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