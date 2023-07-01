import static org.junit.jupiter.api.Assertions.*;
class AlgorithmsTest {
    @org.junit.jupiter.api.Test
    void normalizeString() {

        String testCase1 = "     Hello There, BUDDY  ";
        String testCase2 = "WEL,COM,E,,, NOW  ";
        String testCase3 = "";
        String testCase4 = " ,,,, ,,,, ";
        String testCase5 = "     H20,,, Lit    ";

        String expectedOne = "hello there buddy";
        String expectedTwo = "welcome now";
        String expectedThree = "";
        String expectedFour = " ";
        String expectedFive = "h20 lit";

        String actualOne = Algorithms.normalizeString(testCase1);
        String actualTwo = Algorithms.normalizeString(testCase2);
        String actualThree = Algorithms.normalizeString(testCase3);
        String actualFour = Algorithms.normalizeString(testCase4);
        String actualFive = Algorithms.normalizeString(testCase5);

        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
    }
}