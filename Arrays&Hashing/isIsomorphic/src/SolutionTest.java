import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isIsomorphic() {
        // Arrange
        String s1 = "egg", t1 = "add";
        boolean expected1 = true;

        String s2 = "foo", t2 = "bar";
        boolean expected2 = false;

        String s3 = "paper", t3 = "title";
        boolean expected3 = true;

        String s4 = "same", t4 = "same";
        boolean expected4 = true;

        String s5 = "pear", t5 = "pears";
        boolean expected5 = false;

        String s6 = "a", t6 = "ee";
        boolean expected6 = false;

        String s7 = "p", t7 = "t";
        boolean expected7 = true;

        // Act
        boolean actual1 = Solution.isIsomorphic(s1, t1);
        boolean actual2 = Solution.isIsomorphic(s2, t2);
        boolean actual3 = Solution.isIsomorphic(s3, t3);
        boolean actual4 = Solution.isIsomorphic(s4, t4);
        boolean actual5 = Solution.isIsomorphic(s5, t5);
        boolean actual6 = Solution.isIsomorphic(s6, t6);
        boolean actual7 = Solution.isIsomorphic(s7, t7);

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