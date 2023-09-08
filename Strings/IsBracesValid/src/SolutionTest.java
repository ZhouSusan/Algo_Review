import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isBracesValidTest() {
        // Arrange
        String testcase1 = "W(a{t}s[o(n{ c}o)m]e )h[e{r}e]!";
        boolean expected1 = true;

        String testcase2 = "D(i{a}l[ t]o)n{e";
        boolean expected2 = false;

        String testcase3 = "A(1)s[O (n]0{t) 0}k";
        boolean expected3 = false;

        String testcase4 = "({}[]())";
        boolean expected4 = true;

        String testcase5 = "{";
        boolean expected5 = false;

        String testcase6 = "";
        boolean expected6 = true;

        String testcase7 = null;
        boolean expected7 = false;

        // Act
        boolean actual1 = Solution.isBracesValid(testcase1);
        boolean actual2 = Solution.isBracesValid(testcase2);
        boolean actual3 = Solution.isBracesValid(testcase3);
        boolean actual4 = Solution.isBracesValid(testcase4);
        boolean actual5 = Solution.isBracesValid(testcase5);
        boolean actual6 = Solution.isBracesValid(testcase6);
        boolean actual7 = Solution.isBracesValid(testcase7);

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