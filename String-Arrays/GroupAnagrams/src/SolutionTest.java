import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void groupAnagramsTest() {
        // Arrange
        String[] testcase1 = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected1 = new ArrayList<>();
        ArrayList<String> singleListA = new ArrayList<>();
        singleListA.add("eat");
        singleListA.add("tea");
        singleListA.add("ate");
        ArrayList<String> singleListB = new ArrayList<>();
        singleListB.add("bat");
        ArrayList<String> singleListC = new ArrayList<>();
        singleListC.add("tan");
        singleListC.add("nat");
        expected1.add(singleListA);
        expected1.add(singleListB);
        expected1.add(singleListC);

        String[] testcase2= {""};
        List<List<String>> expected2 = new ArrayList<>();
        ArrayList<String> singleListD = new ArrayList<>();
        singleListD.add("");
        expected2.add(singleListD);

        String[] testcase3= {"a"};
        List<List<String>> expected3 = new ArrayList<>();
        ArrayList<String> singleListE = new ArrayList<>();
        singleListE.add("a");
        expected3.add(singleListE);

        // Act
        List<List<String>> actualOne = Solution.groupAnagrams(testcase1);
        List<List<String>> actualTwo = Solution.groupAnagrams(testcase2);
        List<List<String>> actualThree = Solution.groupAnagrams(testcase3);

        // Assert
        assertNotNull(actualOne);
        assertTrue(expected1.equals(actualOne));
        assertEquals(expected1.size(), actualOne.size());

        assertNotNull(actualTwo);
        assertTrue(expected2.equals(actualTwo));
        assertEquals(expected2.size(), actualTwo.size());

        assertNotNull(actualThree);
        assertTrue(expected3.equals(actualThree));
        assertEquals(expected3.size(), actualThree.size());
    }
}