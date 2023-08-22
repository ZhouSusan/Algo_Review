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
}