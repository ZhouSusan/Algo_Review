import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void addBinaryTest() {
        // Arrange
        String a1 = "11", b1 = "1";
        String expected1 = "100";

        String a2 = "1010", b2 = "1011";
        String expected2 = "10101";

        String a3 = "1", b3 = "100";
        String expected3 = "101";

        String a4 = "1111", b4 = "1111";
        String expected4 = "11110";

        // Act
        String actual1 = Solution.addBinary(a1, b1);
        String actual2 = Solution.addBinary(a2, b2);
        String actual3 = Solution.addBinary(a3, b3);
        String actual4 = Solution.addBinary(a4, b4);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }
}