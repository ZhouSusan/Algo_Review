import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void calPoints() {
        // Arrange
        String[] testCase1 = {"3", "2", "C", "D", "1", "+"};
        int expected1 = 17;

        String[] testCase2 = {"2", "C", "-2", "D", "6", "+"};
        int expected2 = 2;

        String[] testCase3 = {"5","-2","4","C","D","9","+","+"};
        int expected3 = 27;

        String[] testCase4 = {"5","10","+","D"};
        int expected4 = 60;

        String[] testCase5 = {"5","C","-2","C"};
        int expected5 = 0;

        // Act
        int actual1 = Solution.calPoints(testCase1);
        int actual2 = Solution.calPoints(testCase2);
        int actual3 = Solution.calPoints(testCase3);
        int actual4 = Solution.calPoints(testCase4);
        int actual5 = Solution.calPoints(testCase5);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
    }
}