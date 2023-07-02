import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void hasMatchingParentheses() {
        // Arrange
        String testCaseOne = "((algorithm()))";
        String testCaseTwo = "()(algorithm())";
        String testCaseThree ="((algorithm))";
        String testCaseFour ="(algorithm)";


        String testCaseFive = "(algorithm(";
        String testCaseSix =")algorithm)";
        String testCaseSeven = ")algorithm(";
        String testCaseEight = "algorithm((";
        String testCaseNine = "(algorithm";
        String testCaseTen = "((algorithm)";

        String testCaseEvelen = ")";
        String testCaseTwelve = "";
        String testCaseThirteen = null;

        // Act
        boolean actualOne = Algorithms.hasMatchingParentheses(testCaseOne);
        boolean actualTwo = Algorithms.hasMatchingParentheses(testCaseTwo);
        boolean actualThree = Algorithms.hasMatchingParentheses(testCaseThree);
        boolean actualFour = Algorithms.hasMatchingParentheses(testCaseFour);
        boolean actualFive = Algorithms.hasMatchingParentheses(testCaseFive);
        boolean actualSix = Algorithms.hasMatchingParentheses(testCaseSix);
        boolean actualSeven = Algorithms.hasMatchingParentheses(testCaseSeven);
        boolean actualEight = Algorithms.hasMatchingParentheses(testCaseEight);
        boolean actualNine = Algorithms.hasMatchingParentheses(testCaseNine);
        boolean actualTen = Algorithms.hasMatchingParentheses(testCaseTen);
        boolean actualEvelen = Algorithms.hasMatchingParentheses(testCaseEvelen);
        boolean actualTwelve = Algorithms.hasMatchingParentheses(testCaseTwelve);
        boolean actualThirteen = Algorithms.hasMatchingParentheses(testCaseThirteen);

        // Assert
        assertTrue(actualOne);
        assertTrue(actualTwo);
        assertTrue(actualThree);
        assertTrue(actualFour);

        assertFalse(actualFive);
        assertFalse(actualSix);
        assertFalse(actualSeven);
        assertFalse(actualEight);
        assertFalse(actualNine);
        assertFalse(actualTen);

        assertFalse(actualEvelen);
        assertFalse(actualTwelve);
        assertFalse(actualThirteen);
    }

    @org.junit.jupiter.api.Test
    void hasMatchingParentheses2() {
        String testCaseOne = "((algorithm()))";
        String testCaseTwo = "()(algorithm())";
        String testCaseThree ="((algorithm))";
        String testCaseFour ="(algorithm)";

        String testCaseFive = "())(algorithm(";
        String testCaseSix =")algorithm)()";
        String testCaseSeven = ")algorithm(";
        String testCaseEight = "algorithm((";
        String testCaseNine = "(alg";
        String testCaseTen = "((al)))";

        String testCaseEvelen = " ";
        String testCaseTwelve = "";
        String testCaseThirteen = null;

        boolean actualOne = Algorithms.hasMatchingParentheses2(testCaseOne);
        boolean actualTwo = Algorithms.hasMatchingParentheses2(testCaseTwo);
        boolean actualThree = Algorithms.hasMatchingParentheses2(testCaseThree);
        boolean actualFour = Algorithms.hasMatchingParentheses2(testCaseFour);
        boolean actualFive = Algorithms.hasMatchingParentheses2(testCaseFive);
        boolean actualSix = Algorithms.hasMatchingParentheses2(testCaseSix);
        boolean actualSeven = Algorithms.hasMatchingParentheses2(testCaseSeven);
        boolean actualEight = Algorithms.hasMatchingParentheses2(testCaseEight);
        boolean actualNine = Algorithms.hasMatchingParentheses2(testCaseNine);
        boolean actualTen = Algorithms.hasMatchingParentheses2(testCaseTen);
        boolean actualEvelen = Algorithms.hasMatchingParentheses(testCaseEvelen);
        boolean actualTwelve = Algorithms.hasMatchingParentheses(testCaseTwelve);
        boolean actualThirteen = Algorithms.hasMatchingParentheses(testCaseThirteen);

        assertTrue(actualOne);
        assertTrue(actualTwo);
        assertTrue(actualThree);
        assertTrue(actualFour);

        assertFalse(actualFive);
        assertFalse(actualSix);
        assertFalse(actualSeven);
        assertFalse(actualEight);
        assertFalse(actualNine);
        assertFalse(actualTen);
        assertFalse(actualEvelen);
        assertFalse(actualTwelve);
        assertFalse(actualThirteen);
    }
}