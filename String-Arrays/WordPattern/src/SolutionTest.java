import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void wordPatternTest() {

        // Arrange
        String pattern1 = "abba", s1 = "dog cat cat dog";
        boolean expected1 = true;

        String pattern2 = "abba", s2 = "dog cat cat fish";
        boolean expected2 = false;

        String pattern3 = "abba", s3 = "dog dog dog dog";
        boolean expected3 = false;

        String pattern4 = "aaaa", s4 = "dog dog dog dog";
        boolean expected4 = true;

        String pattern5 = "aaa", s5= "aa aa aa aa";
        boolean expected5 = false;

        // Act
        boolean actual1 = Solution.wordPattern(pattern1, s1);
        boolean actual2 = Solution.wordPattern(pattern2, s2);
        boolean actual3 = Solution.wordPattern(pattern3, s3);
        boolean actual4 = Solution.wordPattern(pattern4, s4);
        boolean actual5 = Solution.wordPattern(pattern5, s5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}