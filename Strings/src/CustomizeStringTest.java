import org.junit.jupiter.api.Test;

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

    @Test
    void addHonorificTest() {
        // Arrange
        String testcaseOneHonorific = "Sir";
        String[] testcaseOneNames =  {"Sanchez, Rick", "Smith, Jerry"};
        String[] expectedOne = {"Sir Rick Sanchez", "Sir Jerry Smith"};

        String testcaseTwoHonorific = "Miss";
        String[] testcaseTwoNames =  {};
        String[] expectedTwo = {};

        String testcaseThreeHonorific = "Mr.";
        String[] testcaseThreeNames =  {"Randall, Randy"};
        String[] expectedThree = {"Mr. Randy Randall"};

        String testcaseFourHonorific = "Mrs.";
        String[] testcaseFourNames = null;
        String[] expectedFour = {};

        String testcaseFiveHonorific = null;
        String[] testcaseFiveNames = {"Sanchez, Rick", "Smith, Jerry"};
        String[] expectedFive = {"Rick Sanchez", "Jerry Smith"};

        String testcaseSixHonorific = null;
        String[] testcaseSixNames = null;
        String[] expectedSix = {};

        // Act
        String[] actualOne = CustomizeString.addHonorific(testcaseOneHonorific, testcaseOneNames);
        String[] actualTwo = CustomizeString.addHonorific(testcaseTwoHonorific, testcaseTwoNames);
        String[] actualThree = CustomizeString.addHonorific(testcaseThreeHonorific, testcaseThreeNames);
        String[] actualFour = CustomizeString.addHonorific(testcaseFourHonorific, testcaseFourNames);
        String[] actualFive = CustomizeString.addHonorific(testcaseFiveHonorific, testcaseFiveNames);
        String[] actualSix = CustomizeString.addHonorific(testcaseSixHonorific, testcaseSixNames);

        // Assert
        assertNotNull(actualOne);
        assertArrayEquals(expectedOne, actualOne);
        assertEquals(expectedOne.length, actualOne.length);

        assertNotNull(actualTwo);
        assertArrayEquals(expectedTwo, actualTwo);
        assertEquals(expectedTwo.length, actualTwo.length);

        assertNotNull(actualThree);
        assertArrayEquals(expectedThree, actualThree);
        assertEquals(expectedThree.length, actualThree.length);

        assertNotNull(actualFour);
        assertArrayEquals(expectedFour, actualFour);
        assertEquals(expectedFour.length, actualFour.length);

        assertNotNull(actualFive);
        assertArrayEquals(expectedFive, actualFive);
        assertEquals(expectedFive.length, actualFive.length);

        assertNotNull(actualSix);
        assertArrayEquals(expectedSix, actualSix);
        assertEquals(expectedSix.length, actualSix.length);
    }
}