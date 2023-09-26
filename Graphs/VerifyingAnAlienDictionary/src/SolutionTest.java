import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isAlienSorted() {
        // Arrange
        String[] words1 = {"hello","leetcode"};
        String order1 = "hlabcdefgijkmnopqrstuvwxyz";
        boolean expected1 = true;

        String[] words2 = {"word","world","row"};
        String order2 = "worldabcefghijkmnpqstuvxyz";
        boolean expected2 = false;

        String[] words3 = {"apple","app"};
        String order3 = "abcdefghijklmnopqrstuvwxyz";
        boolean expected3 = false;

        String[] words4 = {"apple"};
        String order4 = "abcdefghijklmnopqrstuvwxyz";
        boolean expected4 = true;

        String[] words5 = {"hel","hello"};
        String order5 = "hlabcdefgijkmnopqrstuvwxyz";
        boolean expected5 = true;

        // Act
        boolean actual1 = Solution.isAlienSorted(words1, order1);
        boolean actual2 = Solution.isAlienSorted(words2, order2);
        boolean actual3 = Solution.isAlienSorted(words3, order3);
        boolean actual4 = Solution.isAlienSorted(words4, order4);
        boolean actual5 = Solution.isAlienSorted(words5, order5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}