import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @org.junit.jupiter.api.Test
    void diagonalDifference() {
        // Arrange
        List<List<Integer>> testCase1 = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6),Arrays.asList(9,8,9));
        int expected1 = 2;

        List<List<Integer>> testCase2 = Arrays.asList(Arrays.asList(11,2,4),Arrays.asList(4,5,6), Arrays.asList(10,8,-12));
        int expected2 = 15;

        List<List<Integer>> testCase3 = Arrays.asList(Arrays.asList(-1,-2,-3), Arrays.asList(-4,-5,-6),Arrays.asList(-9,-8,-9));
        int expected3 = 2;

        List<List<Integer>> testCase4 = Arrays.asList(Arrays.asList(1,1,1),Arrays.asList(1,1,1), Arrays.asList(1,1,1));
        int expected4 = 0;

        List<List<Integer>> testCase5 = Arrays.asList(Arrays.asList(0,0,0), Arrays.asList(0,0,0),Arrays.asList(0,0,0));
        int expected5 = 0;


        // Act
        int actual1 = Result.diagonalDifference(testCase1);
        int actual2 = Result.diagonalDifference(testCase2);
        int actual3 = Result.diagonalDifference(testCase3);
        int actual4 = Result.diagonalDifference(testCase4);
        int actual5 = Result.diagonalDifference(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}