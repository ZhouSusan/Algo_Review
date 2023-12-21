import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void uncommonFromSentences() {
        // Arrange
        String testCase1S1 = "apple", testCase1S2 = "banana";
        String[] expected1 = {"apple", "banana"};

        String testCase2S1 = "apple", testCase2S2 = "banana banana";
        String[] expected2 = {"apple"};

        String testCase3S1 = "this apple is sweet", testCase3S2 = "this apple is sour";
        String[] expected3 = {"sweet", "sour"};

        String testCase4S1 = "A dog eat dog world", testCase4S2 = "A sunny weather all day all the time";
        String[] expected4 = {"world", "eat", "the", "weather", "time", "sunny", "day"};

        String testCase5S1 = "big big big big big big bird bird", testCase5S2 = "big big big big big bird bird";
        String[] expected5 = {};


        // Act
        String[] actual1 = Solution.uncommonFromSentences(testCase1S1, testCase1S2);
        String[] actual2 = Solution.uncommonFromSentences(testCase2S1, testCase2S2);
        String[] actual3 = Solution.uncommonFromSentences(testCase3S1, testCase3S2);
        String[] actual4 = Solution.uncommonFromSentences(testCase4S1, testCase4S2);
        String[] actual5 = Solution.uncommonFromSentences(testCase5S1, testCase5S2);

        // Assert
        assertNotNull(actual1);
        assertArrayEquals(expected1, actual1);

        assertNotNull(actual2);
        assertArrayEquals(expected2, actual2);

        assertNotNull(actual3);
        assertArrayEquals(expected3, actual3);

        assertNotNull(actual4);
        assertArrayEquals(expected4, actual4);

        assertNotNull(actual5);
        assertArrayEquals(expected5, actual5);
    }
}