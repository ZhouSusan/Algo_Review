import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void firstFactorial() {
        // Arrange
        int testCase1 = 4;
        int expected1 = 24;

        int testCase2 = 8;
        int expected2 = 40320;

        int testCase3 = 12;
        int expected3 = 479001600;

        int testCase4 = 10;
        int expected4 = 3628800;

        int testCase5 = 2;
        int expected5 = 2;

        int testCase6 = 1;
        int expected6 = 1;

        // Act
        int actual1 = Main.firstFactorial(testCase1);
        int actual2 = Main.firstFactorial(testCase2);
        int actual3 = Main.firstFactorial(testCase3);
        int actual4 = Main.firstFactorial(testCase4);
        int actual5 = Main.firstFactorial(testCase5);
        int actual6 = Main.firstFactorial(testCase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}