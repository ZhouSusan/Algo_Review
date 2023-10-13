import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void containsNearbyDuplicate() {
        // Arrange
        int[] testCase1 = {1,0,1,1};
        int k1 = 1;
        boolean expected1 = true;

        int[] testCase2 = {-5,-6,-7,-3,-5,1};
        int k2 = 4;
        boolean expected2 = true;

        int[] testCase3 = {-10,-8,-12,0,8,8,9,1,2};
        int k3 = 1;
        boolean expected3 = true;

        int[] testCase4 = {-20,-19,-18,17,-16,-15,-20,-19,-18,17,-16,-15};
        int k4 = 3;
        boolean expected4 =false;

        int[] testCase5 = {1,2,3,1};
        int k5 = 3;
        boolean expected5 = true;

        int[] testCase6 = {1,2,3,1,2,3};
        int k6 = 2;
        boolean expected6 = false;

        int[] testCase7 = {1,2};
        int k7 = 1;
        boolean expected7 = false;

        int[] testCase8 = {3};
        int k8 = 1;
        boolean expected8 = false;

        // Act
        boolean actual1 = Solution.containsNearbyDuplicate(testCase1, k1);
        boolean actual2 = Solution.containsNearbyDuplicate(testCase2, k2);
        boolean actual3 = Solution.containsNearbyDuplicate(testCase3, k3);
        boolean actual4 = Solution.containsNearbyDuplicate(testCase4, k4);
        boolean actual5 = Solution.containsNearbyDuplicate(testCase5, k5);
        boolean actual6 = Solution.containsNearbyDuplicate(testCase6, k6);
        boolean actual7 = Solution.containsNearbyDuplicate(testCase7, k7);
        boolean actual8 = Solution.containsNearbyDuplicate(testCase8, k8);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
    }
}