import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findNumbers() {
        // Arrange
        int[] testCase1 = {100197,555,901,4821,1771,17,8888,999,50005};
        int expected1 = 5;

        int[] testCase2 = {10,20,30,40,50,60,70,80,90,1001,1010,1020,1030,1040,1050,1060,1070,1080,1090,2000};
        int expected2 = 20;

        int[] testCase3 = {1,2,3,4,5,6,7,8,9};
        int expected3 = 0;

        int[] testCase4 = {12,345,2,6,7896};
        int expected4 = 2;

        int[] testCase5 = {500};
        int expected5 = 0;

        // Act
        int actual1 = Solution.findNumbers(testCase1);
        int actual2 = Solution.findNumbers(testCase2);
        int actual3 = Solution.findNumbers(testCase3);
        int actual4 = Solution.findNumbers(testCase4);
        int actual5 = Solution.findNumbers(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}