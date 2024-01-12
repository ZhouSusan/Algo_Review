import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @org.junit.jupiter.api.Test
    void compareTriplets() {
        // Arrange
        List<Integer> testCase1a = Arrays.asList(1, 2, 3);
        List<Integer> testCase1b = Arrays.asList(3, 2, 1);
        List<Integer> expected1 = Arrays.asList(1, 1);

        List<Integer> testCase2a = Arrays.asList(5, 6, 7);
        List<Integer> testCase2b = Arrays.asList(3, 6, 10);
        List<Integer> expected2 = Arrays.asList(1, 1);

        List<Integer> testCase3a = Arrays.asList(17, 18, 30);
        List<Integer> testCase3b = Arrays.asList(99, 16, 8);
        List<Integer> expected3 = Arrays.asList(2, 1);

        List<Integer> testCase4a = Arrays.asList(77, 89, 62);
        List<Integer> testCase4b = Arrays.asList(55, 72, 61);
        List<Integer> expected4 = Arrays.asList(3, 0);

        List<Integer> testCase5a = Arrays.asList(11, 92, 81);
        List<Integer> testCase5b = Arrays.asList(87, 96, 82);
        List<Integer> expected5 = Arrays.asList(0, 3);

        List<Integer> testCase6a = Arrays.asList(90, 90, 90);
        List<Integer> testCase6b = Arrays.asList(90, 90, 90);
        List<Integer> expected6 = Arrays.asList(0, 0);

        // Act
        List<Integer> actual1 = Result.compareTriplets(testCase1a, testCase1b);
        List<Integer> actual2 = Result.compareTriplets(testCase2a, testCase2b);
        List<Integer> actual3 = Result.compareTriplets(testCase3a, testCase3b);
        List<Integer> actual4 = Result.compareTriplets(testCase4a, testCase4b);
        List<Integer> actual5 = Result.compareTriplets(testCase5a, testCase5b);
        List<Integer> actual6 = Result.compareTriplets(testCase6a, testCase6b);

        // Assert
        assertNotNull(actual1);
        assertEquals(2, actual1.size());
        assertEquals(expected1, actual1);

        assertNotNull(actual2);
        assertEquals(expected2, actual2);

        assertNotNull(actual3);
        assertEquals(expected3, actual3);

        assertNotNull(actual4);
        assertEquals(expected4, actual4);

        assertNotNull(actual5);
        assertEquals(expected5, actual5);

        assertNotNull(actual6);
        assertEquals(expected6, actual6);
    }
}