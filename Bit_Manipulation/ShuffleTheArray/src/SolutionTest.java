import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void shuffle() {
        // Arrange
        int[] nums1 = {2,5,1,3,4,7};
        int n1 = 3;
        int[] expected1 = {2,3,5,4,1,7};

        int[] nums2 = {1,2,3,4,4,3,2,1};
        int n2 = 4;
        int[] expected2 = {1,4,2,3,3,2,4,1};

        int[] nums3 = {1,1,2,2};
        int n3 = 2;
        int[] expected3 = {1,2,1,2};

        int[] nums4 = {1,3};
        int n4 = 1;
        int[] expected4 = {1,3};

        int[] nums5 = {1,1,1,1,1,1};
        int n5 = 3;
        int[] expected5 = {1,1,1,1,1,1};

        // Act
        int[] actual1 = Solution.shuffle(nums1, n1);
        int[] actual2 = Solution.shuffle(nums2, n2);
        int[] actual3 = Solution.shuffle(nums3, n3);
        int[] actual4 = Solution.shuffle(nums4, n4);
        int[] actual5 = Solution.shuffle(nums5, n5);

        // Assert
        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2, actual2);
        assertArrayEquals(expected3, actual3);
        assertArrayEquals(expected4, actual4);
        assertArrayEquals(expected5, actual5);
    }
}