import static org.junit.jupiter.api.Assertions.*;

class StringComparatorTest {

    @org.junit.jupiter.api.Test
    void caseInsensitiveStringCompareTest() {
        // Arrange
        String testCaseOneA = "ApPlEs";
        String testCaseOneB = "apples";
        String testCaseTwoA = "slices";
        String testCaseTwoB = "slic";
        String testCaseThreeA = "";
        String testCaseThreeB = "";
        String testCaseFourA= null;
        String testCaseFourB = null;

        boolean expectedOne = true;
        boolean expectedTwo = false;
        boolean expectedThree = true;
        boolean expectedFour = false;
        boolean expectedFive = false;
        boolean expectedSix = false;

        // Act
        boolean actualOne = StringComparator.caseInsensitiveStringCompare(testCaseOneA, testCaseOneB);
        boolean actualTwo = StringComparator.caseInsensitiveStringCompare(testCaseTwoA, testCaseTwoB);
        boolean actualThree = StringComparator.caseInsensitiveStringCompare(testCaseThreeA, testCaseThreeB);
        boolean actualFour = StringComparator.caseInsensitiveStringCompare(testCaseFourA, testCaseFourB);
        boolean actualFive = StringComparator.caseInsensitiveStringCompare(testCaseThreeA, testCaseTwoB);
        boolean actualSix = StringComparator.caseInsensitiveStringCompare(testCaseFourA, testCaseTwoB);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);
    }

    @org.junit.jupiter.api.Test
    void backspaceStringCompare() {
        // Arrange
        String testCaseS1 = "ab#c";
        String testCaseT1 = "ad#c";
        Boolean expectedOne = true;

        String testCaseS2 = "ab##";
        String testCaseT2 = "c#d#";
        Boolean expectedTwo = true;

        String testCaseS3 = "a##c";
        String testCaseT3 = "#a#c";
        Boolean expectedThree = true;

        String testCaseS4 = "a#c";
        String testCaseT4 = "b";
        Boolean expectedFour = false;

        String testCaseS5 = "";
        String testCaseT5 = "";
        Boolean expectedFive = true;

        String testCaseS6 = "a#c#e";
        String testCaseT6 = null;
        Boolean expectedSix = false;

        String testCaseS7 = null;
        String testCaseT7 = "bc";
        Boolean expectedSeven = false;

        String testCaseS8 = null;
        String testCaseT8 = null;
        Boolean expectedEight = true;

        // Act
        Boolean actualOne = StringComparator.backspaceStringCompare(testCaseS1, testCaseT1);
        Boolean actualTwo = StringComparator.backspaceStringCompare(testCaseS2, testCaseT2);
        Boolean actualThree = StringComparator.backspaceStringCompare(testCaseS3, testCaseT3);
        Boolean actualFour = StringComparator.backspaceStringCompare(testCaseS4, testCaseT4);
        Boolean actualFive = StringComparator.backspaceStringCompare(testCaseS5, testCaseT5);
        Boolean actualSix = StringComparator.backspaceStringCompare(testCaseS6, testCaseT6);
        Boolean actualSeven = StringComparator.backspaceStringCompare(testCaseS7, testCaseT7);
        Boolean actualEight = StringComparator.backspaceStringCompare(testCaseS8, testCaseT8);

        // Assert
        assertEquals(expectedOne, actualOne);
        assertEquals(expectedTwo, actualTwo);
        assertEquals(expectedThree, actualThree);
        assertEquals(expectedFour, actualFour);
        assertEquals(expectedFive, actualFive);
        assertEquals(expectedSix, actualSix);
        assertEquals(expectedSeven, actualSeven);
        assertEquals(expectedEight, actualEight);
    }
}