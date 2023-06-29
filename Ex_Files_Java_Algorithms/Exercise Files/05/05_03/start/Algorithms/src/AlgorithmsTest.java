import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {



    @org.junit.jupiter.api.Test
    void findMissingElements() {

        int[] firstInputTestCaseOne = new int[] {1, 2, 3, 4};
        int[] secondInputTestCaseOne = new int[] {1, 3};

        int[] firstInputTestCaseTwo = new int[] {8, 0, 1, 7, 3};
        int[] secondInputTestCaseTwo = new int[] {5, 7, 8, 0, 2};

        int[] firstInputTestCaseThree = new int[] {};
        int[] secondInputTestCaseThree = new int[] {};

        int[] firstInputTestCaseFour = new int[] {};
        int[] secondInputTestCaseFour = new int[] {1, 2, 3};

        List<Integer> expectedOne = Arrays.asList(2, 4);
        List<Integer> expectedTwo = Arrays.asList(1, 3);
        List<Integer> expectedThree = Arrays.asList();

        List<Integer> actualOne = Algorithms.findMissingElements(firstInputTestCaseOne, secondInputTestCaseOne);
        List<Integer> actualTwo = Algorithms.findMissingElements(firstInputTestCaseTwo, secondInputTestCaseTwo);
        List<Integer> actualThree = Algorithms.findMissingElements(firstInputTestCaseThree, secondInputTestCaseThree);
        List<Integer> actualFour = Algorithms.findMissingElements(firstInputTestCaseFour, secondInputTestCaseFour);

        assertThat(actualOne, is(expectedOne));
        assertThat(actualOne, hasItems(2));
        assertThat(actualOne, hasItems(4));
        assertThat(actualOne.size(), is(2));
        assertThat(actualOne, is(expectedOne));
        assertTrue(!actualOne.isEmpty());

        assertThat(actualTwo, is(expectedTwo));
        assertThat(actualTwo, hasItems(1));
        assertThat(actualTwo, hasItems(3));
        assertThat(actualTwo.size(), is(2));
        assertThat(actualTwo, is(expectedTwo));
        assertTrue(!actualTwo.isEmpty());

        assertTrue(actualThree.isEmpty());
        assertThat(actualThree, is(expectedThree));

        assertTrue(actualFour.isEmpty());
        assertThat(actualFour, is(expectedThree));
    }
}