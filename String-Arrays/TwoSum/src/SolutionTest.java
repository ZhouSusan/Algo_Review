import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void twoSumTest() {
        // Arrange
        int[] numsOne = {2,7,14,25};
        int targetOne = 16;
        int[] expectedOne = {0,2};

        int[] numsTwo = {-3, -8 ,-4};
        int targetTwo = -12;
        int[] expectedTwo = {1,2};

        int[] numsThree = {2,2};
        int targetThree = 4;
        int[] expectedThree = {0,1};

        int[] numsFour = {2, 0, 7, -3 , 11, -6};
        int targetFour = 1;
        int[] expectedFour = {2, 5};

        // Act
        int[] actualOne = Solution.twoSum(numsOne, targetOne);
        int[] actualTwo = Solution.twoSum(numsTwo, targetTwo);
        int[] actualThree = Solution.twoSum(numsThree, targetThree);
        int[] actualFour = Solution.twoSum(numsFour, targetFour);

        // Assert
        assertNotNull(actualOne);
        assertArrayEquals(expectedOne, actualOne);
        assertTrue(actualOne.length == 2);

        assertNotNull(actualTwo);
        assertArrayEquals(expectedTwo, actualTwo);
        assertEquals(2, actualTwo.length);

        assertNotNull(actualThree);
        assertArrayEquals(expectedThree, actualThree);
        assertTrue(actualThree.length == 2);

        assertNotNull(actualFour);
        assertArrayEquals(expectedFour, actualFour);
        assertEquals(2, actualFour.length);
    }
}