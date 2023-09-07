import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isAnagramTest() {

        // Arrange
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean expected1 =true;

        String s2 = "ccaa";
        String t2 = "ccca";
        boolean expected2 = false;

        String s3 = "rat";
        String t3 = "car";
        boolean expected3 = false;

        String s4 = "rat";
        String t4 = "cars";
        boolean expected4 = false;

        String s5 = "daces";
        String t5 = "spade";
        boolean expected5 = false;

        //Act
        boolean actual1 = Solution.isAnagram(s1, t1);
        boolean actual2 = Solution.isAnagram(s2, t2);
        boolean actual3 = Solution.isAnagram(s3, t3);
        boolean actual4 = Solution.isAnagram(s4, t4);
        boolean actual5 = Solution.isAnagram(s5, t5);

        //Assert
        assertEquals(actual1, expected1);
        assertEquals(actual2, expected2);
        assertEquals(actual3, expected3);
        assertEquals(actual4, expected4);
        assertEquals(actual5, expected5);
    }
}