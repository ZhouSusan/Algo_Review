import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @org.junit.jupiter.api.Test
    void countWords() {
        // Arrange
        String[] testCase1Words1 = {"a","ab", "b"}, testCase1Words2 = {"a","a","a","ab", "b"};
        int expected1 = 2;

        String[] testCase2Words1 = {"leetcode","is","amazing","as","is", "right"}, testCase2Words2 = {"amazing", "right","leetcode","is"};
        int expected2 = 3;

        String[] testCase3Words1 = {"burgers", "fries", "soda", "frosty"}, testCase3Words2 = {"sandwiches","fries","soda","fruit cup", "cake"};
        int expected3 = 2;

        String[] testCase4Words1 = {"b","bb","bbb"}, testCase4Words2 = {"a","aa","aaa"};
        int expected4 = 0;

        String[] testCase5Words1 = {"sweet"}, testCase5Words2 = {"sweet" , "potatoes"};
        int expected5 = 1;

        String[] testCase6Words1 = {"sweet", "corn"}, testCase6Words2 = {"sugar"};
        int expected6 = 0;

        // Act
        int actual1 = Solution.countWords(testCase1Words1, testCase1Words2);
        int actual2 = Solution.countWords(testCase2Words1, testCase2Words2);
        int actual3 = Solution.countWords(testCase3Words1, testCase3Words2);
        int actual4 = Solution.countWords(testCase4Words1, testCase4Words2);
        int actual5 = Solution.countWords(testCase5Words1, testCase5Words2);
        int actual6 = Solution.countWords(testCase6Words1, testCase6Words2);

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
    }
}