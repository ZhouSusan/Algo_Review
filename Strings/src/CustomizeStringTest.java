import static org.junit.jupiter.api.Assertions.*;

class CustomizeStringTest {

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
        String actualOne = CustomizeString.acronymize(testCaseOne);
        String actualTwo = CustomizeString.acronymize(testCaseTwo);
        String actualThree = CustomizeString.acronymize(testCaseThree);
        String actualFour = CustomizeString.acronymize(testCaseFour);
        String actualFive = CustomizeString.acronymize(testCaseFive);
        String actualSix = CustomizeString.acronymize(testCaseSix);

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