import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VersionNumberComparatorTest {

    @Test
    void compareVersionTest() {
        // Arrange
        String testCaseOneV1 = "0.1";
        String testCaseOneV2 = "1.1";
        int expectedOne = -1;

        String testCaseTwoV1 = "1.0.1";
        String testCaseTwoV2 = "1";
        int expectedTwo = 1;

        String testCaseThreeV1 = "1.01";
        String testCaseThreeV2 = "1.001";
        int expectedThree = 0;

        String testCaseFourV1 = "7.5.2.4";
        String testCaseFourV2 = "7.5.2";
        int expectedFour = 1;

        String testCaseFiveV1 = "7.5.2.4";
        String testCaseFiveV2 = "7.5.3";
        int expectedFive = -1;

        String testCaseSixV1 = null;
        String testCaseSixV2 = "1.001";
        int expectedSix = -1;

        String testCaseSevenV1 = "1.0.2";
        String testCaseSevenV2 = null;
        int expectedSeven = 1;

        String testCaseEightV1 = "";
        String testCaseEightV2 = "";
        int expectedEight = 0;

        String testCaseNineV1 = null;
        String testCaseNineV2 = null;
        int expectedNine = 0;

        String testCaseTenV1 = "3.2.4";
        String testCaseTenV2 = "";
        int expectedTen = 1;

        String testCaseElevenV1 = "";
        String testCaseElevenV2 = "1.3.1";
        int expectedEleven = -1;

        // Act
        int actualOne = VersionNumberComparator.compareVersion(testCaseOneV1, testCaseOneV2);
        int actualTwo = VersionNumberComparator.compareVersion(testCaseTwoV1, testCaseTwoV2);
        int actualThree = VersionNumberComparator.compareVersion(testCaseThreeV1, testCaseThreeV2);
        int actualFour = VersionNumberComparator.compareVersion(testCaseFourV1, testCaseFourV2);
        int actualFive = VersionNumberComparator.compareVersion(testCaseFiveV1, testCaseFiveV2);
        int actualSix = VersionNumberComparator.compareVersion(testCaseSixV1, testCaseSixV2);
        int actualSeven = VersionNumberComparator.compareVersion(testCaseSevenV1, testCaseSevenV2);
        int actualEight = VersionNumberComparator.compareVersion(testCaseEightV1, testCaseEightV2);
        int actualNine = VersionNumberComparator.compareVersion(testCaseNineV1, testCaseNineV2);
        int actualTen = VersionNumberComparator.compareVersion(testCaseTenV1, testCaseTenV2);
        int actualEleven = VersionNumberComparator.compareVersion(testCaseElevenV1, testCaseElevenV2);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);
        assertEquals(expectedSeven, actualSeven);
        assertEquals(expectedEight, actualEight);
        assertEquals(expectedNine, actualNine);
        assertEquals(expectedTen, actualTen);
        assertEquals(expectedEleven, actualEleven);

    }
}