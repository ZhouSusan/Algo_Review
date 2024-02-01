import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isAnagram() {

        // Arrange
        String testCase1a = "anagram";
        String testCase1b = "margana";
        Boolean expected1 = true;

        String testCase2a = "HELLO";
        String testCase2b = "hello";
        Boolean expected2 = true;

        String testCase3a = "anagramm";
        String testCase3b = "marganaa";
        Boolean expected3 = false;

        String testCase4a = "asherton";
        String testCase4b = "tat";
        Boolean expected4 = false;

        String testCase5a = "mama";
        String testCase5b = "mamamam";
        Boolean expected5 = false;

        String testCase6a = "Z";
        String testCase6b = "z";
        Boolean expected6 = true;

        String testCase7a = "Y";
        String testCase7b = "C";
        Boolean expected7 = false;


        // Act
        Boolean actual1 = Solution.isAnagram(testCase1a, testCase1b);
        Boolean actual2 = Solution.isAnagram(testCase2a, testCase2b);
        Boolean actual3 = Solution.isAnagram(testCase3a, testCase3b);
        Boolean actual4 = Solution.isAnagram(testCase4a, testCase4b);
        Boolean actual5 = Solution.isAnagram(testCase5a, testCase5b);
        Boolean actual6 = Solution.isAnagram(testCase6a, testCase6b);
        Boolean actual7 = Solution.isAnagram(testCase7a, testCase7b);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
    }
}