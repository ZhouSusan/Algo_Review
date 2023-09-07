import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
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
        String[] actualOne = Solution.addHonorific(testcaseOneHonorific, testcaseOneNames);
        String[] actualTwo = Solution.addHonorific(testcaseTwoHonorific, testcaseTwoNames);
        String[] actualThree = Solution.addHonorific(testcaseThreeHonorific, testcaseThreeNames);
        String[] actualFour = Solution.addHonorific(testcaseFourHonorific, testcaseFourNames);
        String[] actualFive = Solution.addHonorific(testcaseFiveHonorific, testcaseFiveNames);
        String[] actualSix = Solution.addHonorific(testcaseSixHonorific, testcaseSixNames);

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