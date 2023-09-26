import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findDisappearedNumbers() {
        // Arrange
        int[] testcase1 = {4,3,2,7,8,2,3,1};
        List<Integer> expected1 = Arrays.asList(5, 6);

        int[] testcase2 = {2, 3, 7, 8};
        List<Integer> expected2 = Arrays.asList(1, 4);

        int[] testcase3 = {33, 34, 35, 36, 38, 12, 4};
        List<Integer> expected3 = Arrays.asList(1, 2, 3, 5, 6, 7);

        int[] testcase4 = {1, 1};
        List<Integer> expected4 = Arrays.asList(2);;

        int[] testcase5 = {1};
        List<Integer> expected5 = Arrays.asList();

        // Act
        List<Integer> actual1 = Solution.findDisappearedNumbers(testcase1);
        List<Integer> actual2 = Solution.findDisappearedNumbers(testcase2);
        List<Integer> actual3 = Solution.findDisappearedNumbers(testcase3);
        List<Integer> actual4 = Solution.findDisappearedNumbers(testcase4);
        List<Integer> actual5 = Solution.findDisappearedNumbers(testcase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected1.size(), actual1.size());
        assertEquals(expected2, actual2);
        assertEquals(expected2.size(), actual2.size());
        assertTrue(expected3.size() == actual3.size());
        assertEquals(expected3.size(), actual3.size());
        assertEquals(expected4, actual4);
        assertFalse(actual4.isEmpty());
        assertEquals(expected5, actual5);
        assertTrue(expected1.size() == actual1.size());
    }
}