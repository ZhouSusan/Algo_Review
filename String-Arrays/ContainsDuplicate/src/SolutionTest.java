import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void containsDuplicateTest() {
        // Arrange
        int[] testcase1 = {1,2,3,1};
        boolean expected1 =  true;

        int[] testcase2 = {1,2,3,4};
        boolean expected2 = false;

        int[] testcase3 = {1,1,1,3,3,4,3,2,4,2};
        boolean expected3 = true;

        int[] testcase4 = {-12,-2, -7,- 12};
        boolean expected4 =  true;

        int[] testcase5 = {-2};
        boolean expected5 = false;

        int[] testcase6 = {-9, -20, 10, 24, -23, 0, 15};
        boolean expected6 = false;

        // Act
        boolean actual1 = Solution.containsDuplicate(testcase1);
        boolean actual2 = Solution.containsDuplicate(testcase2);
        boolean actual3 = Solution.containsDuplicate(testcase3);
        boolean actual4 = Solution.containsDuplicate(testcase4);
        boolean actual5 = Solution.containsDuplicate(testcase5);
        boolean actual6 = Solution.containsDuplicate(testcase6);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}