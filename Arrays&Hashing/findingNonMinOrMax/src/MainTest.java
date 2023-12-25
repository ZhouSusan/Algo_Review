import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void findNonMinOrMax() {
        // Arrange
        int[] testCase1 = {3,2,1,4};
        int expected1 = 2;

        int[] testCase2 = {2,1,3};
        int expected2 = 2;

        int[] testCase3 = {20,21};
        int expected3 = -1;

        int[] testCase4 = {33};
        int expected4 = -1;

        // Act
        int actual1 = Main.findNonMinOrMax(testCase1);
        int actual2 = Main.findNonMinOrMax(testCase2);
        int actual3 = Main.findNonMinOrMax(testCase3);
        int actual4 = Main.findNonMinOrMax(testCase4);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
    }
}