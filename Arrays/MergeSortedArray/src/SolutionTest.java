import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void merge2Test() {
        // Arrange

        // testcase 1
        int[] nums1 = {1,2,3,0,0,0};
        int m1 = 3;
        int[] nums2 = {2,5,6};
        int n1 = 3;
        int[] expected1 = {1, 2, 2, 3, 5, 6};

        // testcase 2
        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = {};
        int n2 = 0;
        int[] expected2 = {1};

        // testcase 3
        int[] nums5 = {0};
        int m3 = 0;
        int[] nums6 = {1};
        int n3 = 1;
        int[] expected3 = {1};

        // testcase 4
        int[] nums7 = {80, 100, 120, 130, 140, 150, 160, 180};
        int m4 = 3;
        int[] nums8 = {-2, 0, 7, 9 , 15};
        int n4 = 5;
        int[] expected4 = {-2, 0, 7, 9, 15, 80, 100, 120};

        // testcase 5
        int[] nums9 = {2,2,3,0,0,0};
        int m5 = 3;
        int[] nums10 = {1,5,6};
        int n5 = 3;
        int[] expected5 = {1, 2, 2, 3, 5, 6};

        assertEquals(6, nums1.length);
        assertEquals(1, nums3.length);
        assertEquals(1, nums3.length);
        assertEquals(8, nums7.length);
        assertEquals(6, nums9.length);

        // Act
        Solution.merge2(nums1, m1, nums2, n1);
        Solution.merge2(nums3, m2, nums4, n2);
        Solution.merge2(nums5, m3, nums6, n3);
        Solution.merge2(nums7, m4, nums8, n4);
        Solution.merge(nums9, m5, nums10, n5);

        // Assert
        assertArrayEquals(expected1, nums1);
        assertEquals(6, nums1.length);
        assertArrayEquals(expected2, nums3);
        assertEquals(1, nums3.length);
        assertArrayEquals(expected3, nums5);
        assertEquals(1, nums3.length);
        assertArrayEquals(expected4, nums7);
        assertEquals(8, nums7.length);
        assertArrayEquals(expected5, nums9);
        assertEquals(6, nums9.length);
    }
}