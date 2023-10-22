import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void arraySign() {
        // Arrange
        int[] testCase1 = {-1,4,-2,1,-1,-2,-3};
        int expected1 = -1;

        int[] testCase2 = {-1,2,3,-4,-3,2,-1};
        int expected2 = 1;

        int[] testCase3 = {10,10,10,10,0,10,10};
        int expected3 = 0;

        int[] testCase4 = {-1,1,-1,1,-1};
        int expected4 = -1;

        int[] testCase5 = {1,5,0,2,-3};
        int expected5 = 0;

        int[] testCase6 = {9,72,-2,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int expected6 = 1;

        int[] testCase7 = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int expected7 = -1;

        int[] testCase8 = {3};
        int expected8 = 1;

        int[] testCase9 = {0,1,2,3};
        int expected9 = 0;

        // Act
        int actual1 = Solution.arraySign(testCase1);
        int actual2 = Solution.arraySign(testCase2);
        int actual3 = Solution.arraySign(testCase3);
        int actual4 = Solution.arraySign(testCase4);
        int actual5 = Solution.arraySign(testCase5);
        int actual6 = Solution.arraySign(testCase6);
        int actual7 = Solution.arraySign(testCase7);
        int actual8 = Solution.arraySign(testCase8);
        int actual9 = Solution.arraySign(testCase9);

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
        assertEquals(expected9, actual9);
    }
}