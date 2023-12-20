import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void targetIndices() {
        // Arrange

        int[] testCase1Nums = {1,2,5,2,3};
        int testCase1Target = 5;
        List<Integer> expected1 = Arrays.asList(4);

        int[] testCase2Nums = {1,2,5,2,3,1,4};
        int testCase2Target = 1;
        List<Integer> expected2 = Arrays.asList(0,1);

        int[] testCase3Nums = {1,2,15,2,13,1};
        int testCase3Target = 6;
        List<Integer> expected3 = Arrays.asList();

        int[] testCase4Nums = {7,7,7,7,7,7,7,7,7,7};
        int testCase4Target = 7;
        List<Integer> expected4 = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        int[] testCase5Nums = {1};
        int testCase5Target = 1;
        List<Integer> expected5 = Arrays.asList(0);

        // Act
        List<Integer> actual1 = Solution.targetIndices(testCase1Nums, testCase1Target);
        List<Integer> actual2 = Solution.targetIndices(testCase2Nums, testCase2Target);
        List<Integer> actual3 = Solution.targetIndices(testCase3Nums, testCase3Target);
        List<Integer> actual4 = Solution.targetIndices(testCase4Nums, testCase4Target);
        List<Integer> actual5 = Solution.targetIndices(testCase5Nums, testCase5Target);

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
    }

}