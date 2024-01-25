import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void summaryRanges() {
        // Arrange
        int[] testCase1 = {0,1,2,4,5,7};
        List<String> expected1 = Arrays.asList("0->2","4->5","7");

        int[] testCase2 = {0,2,3,4,6,8,9};
        List<String> expected2 = Arrays.asList("0","2->4","6","8->9");

        int[] testCase3 = {-10,-9,-7,-6,-5,-4,-1};
        List<String> expected3 = Arrays.asList("-10->-9","-7->-4","-1");

        int[] testCase4 = {-200,-180,-179,-178,-177,-176,-175,-174,-173,-172,-171,-150,-125,-124,-123,-122,-121,-110,-100,0};
        List<String> expected4 = Arrays.asList("-200","-180->-171","-150","-125->-121","-110","-100","0");

        int[] testCase5 = {-5,-4,-3,0,2,3,4,5,8};
        List<String> expected5 = Arrays.asList("-5->-3","0","2->5","8");

        int[] testCase6 = {0,2,3,4,6,8,9};
        List<String> expected6 = Arrays.asList("0","2->4","6","8->9");

        int[] testCase7 = {10};
        List<String> expected7 = List.of("10");

        int[] testCase8 = {};
        List<String> expected8 = List.of();

        // Act
        List<String> actual1 = Solution.summaryRanges(testCase1);
        List<String> actual2 = Solution.summaryRanges(testCase2);
        List<String> actual3 = Solution.summaryRanges(testCase3);
        List<String> actual4 = Solution.summaryRanges(testCase4);
        List<String> actual5 = Solution.summaryRanges(testCase5);
        List<String> actual6 = Solution.summaryRanges(testCase6);
        List<String> actual7 = Solution.summaryRanges(testCase7);
        List<String> actual8 = Solution.summaryRanges(testCase8);

        // Assert
        assertNotNull(actual1);
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

        assertNotNull(actual7);
        assertEquals(expected7, actual7);

        assertNotNull(actual8);
        assertEquals(expected8, actual8);
    }
}