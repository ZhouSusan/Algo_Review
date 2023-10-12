import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findDifference() {
        // Arrange
        int[] testCase1a = {1,2,3}, testCase1b = {2,4,6};
        List<List<Integer>> expected1 = new ArrayList<>();
        List<Integer> innerList1a = Arrays.asList(1, 3);
        expected1.add(innerList1a);
        List<Integer> innerList1b = Arrays.asList(4, 6);
        expected1.add(innerList1b);

        int[] testCase2a = {1,2,3,3}, testCase2b = {1,1,2,2};
        List<List<Integer>> expected2 = new ArrayList<>();
        List<Integer> innerList2a = List.of(3);
        expected2.add(innerList2a);
        List<Integer> innerList2b = List.of();
        expected2.add(innerList2b);

        int[] testCase3a = {-12, -20, -9}, testCase3b = {-89, -101, -12, -9};
        List<List<Integer>> expected3 = new ArrayList<>();
        List<Integer> innerList3a = List.of(-20);
        expected3.add(innerList3a);
        List<Integer> innerList3b = Arrays.asList(-101,-89);
        expected3.add(innerList3b);

        int[] testCase4a = {20, 12, -89, -89}, testCase4b = {-89};
        List<List<Integer>> expected4 = new ArrayList<>();
        List<Integer> innerList4a = Arrays.asList(20, 12);
        expected4.add(innerList4a);
        List<Integer> innerList4b = List.of();
        expected4.add(innerList4b);

        // Act
        List<List<Integer>> actual1 = Solution.findDifference(testCase1a, testCase1b);
        List<List<Integer>> actual2 = Solution.findDifference(testCase2a, testCase2b);
        List<List<Integer>> actual3 = Solution.findDifference(testCase3a, testCase3b);
        List<List<Integer>> actual4 = Solution.findDifference(testCase4a, testCase4b);

        // Asset
        assertNotNull(actual1);
        assertEquals(2, actual1.size());
        assertEquals(expected1,actual1);

        assertNotNull(actual2);
        assertEquals(2, actual2.size());
        assertEquals(expected2,actual2);

        assertNotNull(actual3);
        assertEquals(2, actual3.size());
        assertEquals(expected3,actual3);

        assertNotNull(actual4);
        assertEquals(2, actual4.size());
        assertTrue(expected4.equals(actual4));
    }
}