import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void removeElement() {
        // Arrange
        int[] testCase1 = {3, 2, 2, 3, 1};
        int val1 = 3;
        int expected1 = 3;

        int[] testCase2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int expected2 = 5;

        int[] testCase3 = {10,10,10,20,20,30,20,14,34,20,10,9,24,33,20};
        int val3 = 20;
        int expected3 = 10;

        int[] testCase4 = {0,0,1,0,0};
        int val4 = 1;
        int expected4 = 4;

        int[] testCase5 = {1,1,1};
        int val5 = 1;
        int expected5 = 0;

        int[] testCase6 = {14};
        int val6 = 14;
        int expected6 = 0;

        int[] testCase7 = {30,40,10,50,20};
        int val7 = 22;
        int expected7 = 5;

        int[] testCase8 = {8};
        int val8 = 50;
        int expected8 = 1;

        // Act
        int actual1 = Solution.removeElement(testCase1, val1);
        int actual2 = Solution.removeElement(testCase2, val2);
        int actual3 = Solution.removeElement(testCase3, val3);
        int actual4 = Solution.removeElement(testCase4, val4);
        int actual5 = Solution.removeElement(testCase5, val5);
        int actual6 = Solution.removeElement(testCase6, val6);
        int actual7 = Solution.removeElement(testCase7, val7);
        int actual8 = Solution.removeElement(testCase8, val8);

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