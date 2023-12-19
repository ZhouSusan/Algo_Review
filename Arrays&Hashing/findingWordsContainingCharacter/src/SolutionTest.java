import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void findWordsContaining() {
        // Arrange
        String[] testCase1words = {"abc","bcd","aaaa","cbc"};
        char testCase1Char = 'a';
        List<Integer> expected1 = Arrays.asList(0,2);

        String[] testCase2words = {"leet","code"};
        char testCase2Char = 'e';
        List<Integer> expected2 = Arrays.asList(0,1);

        String[] testCase3words = {"abc","bcd","aaaa","cbc"};
        char testCase3Char = 'a';
        List<Integer> expected3 = Arrays.asList(0, 2);

        String[] testCase4words = {"ice","cream","sandwich","chocolate"};
        char testCase4Char = 'c';
        List<Integer> expected4 = Arrays.asList(0,1,2, 3);

        String[] testCase5words = {"flying","monkeys","in","sky"};
        char testCase5Char = 'r';
        List<Integer> expected5 = Arrays.asList();

        String[] testCase6words = {"d"};
        char testCase6Char = 'k';
        List<Integer> expected6 = Arrays.asList();

        String[] testCase7words = {"z"};
        char testCase7Char = 'z';
        List<Integer> expected7 = Arrays.asList(0);


        // Act
        List<Integer> actual1 = Solution.findWordsContaining(testCase1words, testCase1Char);
        List<Integer> actual2 = Solution.findWordsContaining(testCase2words, testCase2Char);
        List<Integer> actual3 = Solution.findWordsContaining(testCase3words, testCase3Char);
        List<Integer> actual4 = Solution.findWordsContaining(testCase4words, testCase4Char);
        List<Integer> actual5 = Solution.findWordsContaining(testCase5words, testCase5Char);
        List<Integer> actual6 = Solution.findWordsContaining(testCase6words, testCase6Char);
        List<Integer> actual7 = Solution.findWordsContaining(testCase7words, testCase7Char);

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
        assertTrue(actual5.isEmpty());
        assertEquals(expected5, actual5);

        assertNotNull(actual6);
        assertTrue(actual6.size() == 0);
        assertEquals(expected6, actual6);

        assertNotNull(actual7);
        assertEquals(expected7, actual7);
    }
    
}