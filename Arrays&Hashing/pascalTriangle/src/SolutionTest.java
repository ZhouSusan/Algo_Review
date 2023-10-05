import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void generate() {
        // Arrange
        int testCase1 = 5;
        List<List<Integer>> expected1 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(List.of(1)),
                new ArrayList<>(Arrays.asList(1, 1)),
                new ArrayList<>(Arrays.asList(1, 2, 1)),
                new ArrayList<>(Arrays.asList(1, 3, 3, 1)),
                new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1))
        ));

        int testCase2 = 10;
        List<List<Integer>> expected2 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(List.of(1)),
                new ArrayList<>(Arrays.asList(1, 1)),
                new ArrayList<>(Arrays.asList(1, 2, 1)),
                new ArrayList<>(Arrays.asList(1, 3, 3, 1)),
                new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1)),
                new ArrayList<>(List.of(1, 5, 10, 10, 5, 1)),
                new ArrayList<>(Arrays.asList(1, 6, 15, 20, 15, 6, 1)),
                new ArrayList<>(Arrays.asList(1, 7, 21, 35, 35, 21, 7, 1)),
                new ArrayList<>(Arrays.asList(1, 8, 28, 56, 70, 56, 28, 8, 1)),
                new ArrayList<>(Arrays.asList(1, 9, 36, 84, 126, 126, 84, 36, 9, 1))
        ));

        int testCase3 = 1;
        List<List<Integer>> expected3 = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1))
        ));

        // Act
        List<List<Integer>> actual1 = Solution.generate(testCase1);
        List<List<Integer>> actual2 = Solution.generate(testCase2);
        List<List<Integer>> actual3 = Solution.generate(testCase3);

        // Assert
        assertNotNull(actual1);
        assertEquals(expected1, actual1);
        assertEquals(expected1.size(), actual1.size());

        assertNotNull(actual2);
        assertEquals(expected2, actual2);
        assertEquals(expected2.size(), actual2.size());

        assertNotNull(actual3);
        assertEquals(expected3, actual3);
        assertEquals(1, actual3.size());
    }
}