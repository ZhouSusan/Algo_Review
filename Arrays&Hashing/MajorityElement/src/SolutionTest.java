import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void majorityElement() {
        // Arrange
        int[] testcase1 = {3,2,3};
        int expected1 = 3;

        int[] testcase2 = {2,2,1,1,1,2,2};
        int expected2 = 2;

        int[] testcase3 = {-7, -8, -9, -8, -7, -8, -7, -8, -9, -8, -7};
        int expected3 = -8;

        int[] testcase4 = {-5, -5, -3};
        int expected4 = -5;

        int[] testcase5 = {-20,-20,10,10,10,-20,-20};
        int expected5 = -20;

        int[] testcase6 = {1};
        int expected6 = 1;

        int[] testcase7 = {2,1};
        int expected7 = 2;

        // Act
        int actual1 = Solution.majorityElement(testcase1);
        int actual2 = Solution.majorityElement(testcase2);
        int actual3 = Solution.majorityElement(testcase3);
        int actual4 = Solution.majorityElement(testcase4);
        int actual5 = Solution.majorityElement(testcase5);
        int actual6 = Solution.majorityElement(testcase6);
        int actual7 = Solution.majorityElement(testcase7);

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
    }
}