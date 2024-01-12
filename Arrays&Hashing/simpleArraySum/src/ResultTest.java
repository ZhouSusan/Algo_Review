import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @org.junit.jupiter.api.Test
    void simpleArraySum() {
        // Arrange
        List<Integer> testCase1 = Arrays.asList(1, 2, 3);
        int expected1 = 6;

        List<Integer> testCase2 = Arrays.asList(1, 2, 3, 4, 10, 11);
        int expected2 = 31;

        List<Integer> testCase3 = Arrays.asList(1);
        int expected3 = 1;

        List<Integer> testCase4 = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);
        int expected4 = 5500;

        List<Integer> testCase5 = Arrays.asList(0, 0, 0);
        int expected5 = 0;

        // Act
        int actual1 = Result.simpleArraySum(testCase1);
        int actual2 = Result.simpleArraySum(testCase2);
        int actual3 = Result.simpleArraySum(testCase3);
        int actual4 = Result.simpleArraySum(testCase4);
        int actual5 = Result.simpleArraySum(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}