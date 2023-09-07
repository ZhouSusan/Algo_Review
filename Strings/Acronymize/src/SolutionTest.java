import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void acronymizeTest() {
        // Arrange
        String testCaseOne = "object oriented programming";
        String testCaseTwo = "  global   information tracker    ";
        String testCaseThree = "abstraction polymorphism inheritance encapsulation";
        String testCaseFour = "software development life cycle";
        String testCaseFive = "";
        String testCaseSix = null;

        String expectedOne = "OOP";
        String expectedTwo = "GIT";
        String expectedThree = "APIE";
        String expectedFour = "SDLC";
        String expectedFive = "";
        String expectedSix = "";

        // Act
        String actualOne = Solution.acronymize(testCaseOne);
        String actualTwo = Solution.acronymize(testCaseTwo);
        String actualThree = Solution.acronymize(testCaseThree);
        String actualFour = Solution.acronymize(testCaseFour);
        String actualFive = Solution.acronymize(testCaseFive);
        String actualSix = Solution.acronymize(testCaseSix);

        // Assert
        assertNotNull(actualOne);
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertNotNull(actualSix);
        assertEquals(expectedSix, actualSix);
    }
}