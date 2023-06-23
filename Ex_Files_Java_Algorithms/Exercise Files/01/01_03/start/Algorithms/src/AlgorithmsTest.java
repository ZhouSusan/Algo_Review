import static org.junit.jupiter.api.Assertions.*;
class AlgorithmsTest {
    @org.junit.jupiter.api.Test
    void normalizeString() {

        String testCase1 = "     Hello There, BUDDY  ";
        String testCase2 = "WEL,COM,E,,, NOW  ";

        String expectedOne = "hello there buddy";
        String expectedTwo = "welcome now";

        String actualOne = Algorithms.normalizeString(testCase1);
        String actualTwo = Algorithms.normalizeString(testCase2);

        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
    }
}