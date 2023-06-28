import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void hasMatchingParentheses() {
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

    }

    @org.junit.jupiter.api.Test
    void hasMatchingParentheses2() {
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
    }
}