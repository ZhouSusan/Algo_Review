import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void romanToIntTest() {
        // Arrange
        String testcase1 = "III";
        int expected1 = 3;

        String testcase2 = "IV";
        int expected2 = 4;

        String testcase3 = "IX";
        int expected3 = 9;

        String testcase4 = "LVIII";
        int expected4 = 58;

        String testcase5 = "MCMXCIV";
        int expected5 = 1994;

        String testcase6 = "IIIIIIIIIIIIIIIIII";
        int expected6 = 18;

        // Act
        int actual1 = Solution.romanToInt(testcase1);
        int actual2 = Solution.romanToInt(testcase2);
        int actual3 = Solution.romanToInt(testcase3);
        int actual4 = Solution.romanToInt(testcase4);
        int actual5 = Solution.romanToInt(testcase5);
        int actual6 = Solution.romanToInt(testcase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}