import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getMaxTest() {

        // Arrange
        int[] testcaseOne = {6, 20, 8, 19, 56, 23, 87, 41, 49, 53};
        int[] testcaseTwo = {-12, -9, -32, -1, -8, -21};
        int[] testcaseThree = {-24, 12, -9, 8, 0, -34, 2};
        int[] testcaseFour = {1};
        int[] testcaseFive = {};
        int[] testcaseSix = null;

        int expectedOne = 87;
        int expectedTwo = -1;
        int expectedThree = 12;
        int expectedFour = 1;
        int expectedFive = -1;
        int expectedSix = -1;

        // Act
        int actualOne = Main.getMax(testcaseOne, testcaseOne.length-1);
        int actualTwo = Main.getMax(testcaseTwo, testcaseTwo.length-1);
        int actualThree = Main.getMax(testcaseThree, testcaseThree.length-1);
        int actualFour = Main.getMax(testcaseFour, testcaseFour.length-1);
        int actualFive = Main.getMax(testcaseFive, testcaseFive.length-1);
        int actualSix = Main.getMax(testcaseSix, null);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);
    }
}