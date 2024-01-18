import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canWin() {
        // Arrange
        int[] testCase1 = {0,0,0};
        int testCase1Leap = 2;
        boolean expected1 = true;

        int[] testCase2 = {0,1,0};
        int testCase2Leap = 1;
        boolean expected2 = false;

        int[] testCase3 = {0,0,0,1,1,1};
        int testCase3Leap = 5;
        boolean expected3 = true;

        int[] testCase4 = {0,0,1,1,1,0};
        int testCase4Leap = 3;
        boolean expected4 = false;

        int[] testCase5 = {0};
        int testCase5Leap = 0;
        boolean expected5 = true;

        // Act
        boolean actual1 = Solution.canWin(testCase1Leap, testCase1);
        boolean actual2 = Solution.canWin(testCase2Leap, testCase2);
        boolean actual3 = Solution.canWin(testCase3Leap, testCase3);
        boolean actual4 = Solution.canWin(testCase4Leap, testCase4);
        boolean actual5 = Solution.canWin(testCase5Leap, testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}