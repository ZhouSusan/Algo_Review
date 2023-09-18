import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void addStringsTest() {
        // Arrange
        String num1 = "456", num2 = "77";
        String expected1 = "533";

        String num3 = "11", num4 = "123";
        String expected2 = "134";

        String num5 = "0", num6 = "0";
        String expected3 = "0";

        // Act
        String actual1 = Solution.addStrings(num1, num2);
        String actual2 = Solution.addStrings(num3, num4);
        String actual3 = Solution.addStrings(num5, num6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}