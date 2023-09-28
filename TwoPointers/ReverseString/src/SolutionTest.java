import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void reverseString() {
        // Arrange
        char[] testcase1 = {'h','e','l','l','o'};
        char[] expected1 = {'o','l','l','e','h'};

        char[] testcase2 = {'H','a','n','n','a','h'};
        char[] expected2 = {'h','a','n','n','a','H'};

        char[] testcase3 = {'H','A','P','P','Y','!'};
        char[] expected3 = {'!','Y','P','P','A','H'};

        char[] testcase4 = {'1','2','3','4','5'};
        char[] expected4 = {'5','4','3','2','1'};

        char[] testcase5 = {'&'};
        char[] expected5 = {'&'};

        // Act
        Solution.reverseString(testcase1);
        Solution.reverseString(testcase2);
        Solution.reverseString(testcase3);
        Solution.reverseString(testcase4);
        Solution.reverseString(testcase5);

        // Assert
        assertArrayEquals(expected1, testcase1);
        assertEquals(expected1.length, testcase1.length);
        assertArrayEquals(expected2, testcase2);
        assertEquals(expected2.length, testcase2.length);
        assertArrayEquals(expected3, testcase3);
        assertEquals(expected3.length, testcase3.length);
        assertArrayEquals(expected4, testcase4);
        assertEquals(expected4.length, testcase4.length);
        assertArrayEquals(expected5, testcase5);
        assertEquals(expected5.length, testcase5.length);
    }
}