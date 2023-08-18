import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class HashtableTest {

    @org.junit.jupiter.api.Test
    void getCountInventoryTest() {

        // Arrange
        String[] testcaseOne = {"apple", "pear", "orange", "banana", "apple",
                "orange", "apple", "pear", "banana", "orange",
                "apple", "kiwi", "pear", "apple", "orange"};
        String[] testcaseTwo = {"Eddie", "Laura", "Judy", "Laura"};
        String[] testcaseThree = {"Spider-man"};
        String[] testcaseFour = {};
        String[] testcaseFive = null;

        String expectedAppleKeyOne = "apple";
        int expectedAppleValueOne = 5;
        String expectedBananaKeyOne = "banana";
        int expectedBananaValueOne = 2;
        String expectedKiwiKeyOne = "kiwi";
        int expectedKiwiValueOne = 1;
        String expectedOrangeKeyOne = "orange";
        int expectedOrangeValueOne = 4;
        String expectedPearKeyOne = "pear";
        int expectedPearValueOne = 3;

        String expectedEddieKeyTwo = "Eddie";
        int expectedEddieValueTwo = 1;
        String expectedJudyKeyTwo = "Judy";
        int expectedJudyValueTwo = 1;
        String expectedLauraKeyTwo = "Laura";
        int expectedLauraValueTwo = 2;
        String expectedKeyNotToExistTwo = "Steven";

        String expectedKeyThree = "Spider-man";
        int expectedValueThree = 1;

        // Act
        Hashtable<String, Integer> actualOne= Main.getCountInventory(testcaseOne);
        Hashtable<String, Integer> actualTwo = Main.getCountInventory(testcaseTwo);
        Hashtable<String, Integer> actualThree = Main.getCountInventory(testcaseThree);
        Hashtable<String, Integer> actualFour = Main.getCountInventory(testcaseFour);
        Hashtable<String, Integer> actualFive = Main.getCountInventory(testcaseFive);

        // Assert
        assertNotNull(actualOne);
        assertTrue(actualOne.containsKey(expectedAppleKeyOne));
        assertEquals(expectedAppleValueOne, actualOne.get(expectedAppleKeyOne));
        assertTrue(actualOne.containsKey(expectedBananaKeyOne));
        assertEquals(expectedBananaValueOne, actualOne.get(expectedBananaKeyOne));
        assertTrue(actualOne.containsKey(expectedKiwiKeyOne));
        assertEquals(expectedKiwiValueOne, actualOne.get(expectedKiwiKeyOne));
        assertTrue(actualOne.containsKey(expectedOrangeKeyOne));
        assertEquals(expectedOrangeValueOne, actualOne.get(expectedOrangeKeyOne));
        assertTrue(actualOne.containsKey(expectedPearKeyOne));
        assertEquals(expectedPearValueOne, actualOne.get(expectedPearKeyOne));
        assertTrue(actualOne.size() == 5);

        assertNotNull(actualTwo);
        assertTrue(actualTwo.containsKey(expectedEddieKeyTwo));
        assertEquals(expectedEddieValueTwo, actualTwo.get(expectedEddieKeyTwo));
        assertTrue(actualTwo.containsKey(expectedJudyKeyTwo));
        assertEquals(expectedJudyValueTwo, actualTwo.get(expectedJudyKeyTwo));
        assertFalse(actualTwo.containsKey(expectedKeyNotToExistTwo));
        assertEquals(expectedLauraValueTwo, actualTwo.get(expectedLauraKeyTwo));
        assertTrue(actualTwo.size() == 3);

        assertNotNull(actualThree);
        assertTrue(actualThree.containsKey(expectedKeyThree));
        assertEquals(expectedValueThree, actualThree.get(expectedKeyThree));
        assertTrue(actualThree.size() == 1);

        assertNotNull(actualFour);
        assertTrue(actualFour.isEmpty());

        assertNotNull(actualFive);
        assertTrue(actualFive.size() == 0);
    }
}