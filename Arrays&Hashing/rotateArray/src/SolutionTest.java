import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void rotate() {
        // Arrange
        int[] testCase1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        int[] expected1 = {5,6,7,1,2,3,4};

        int[] testCase2 = {1,-100,3,99};
        int k2 = 2;
        int[] expected2 = {3,99,1,-100};

        int[] testCase3 = {-20,-18,-16,-14,0,1,4,6,8,10};
        int k3 = 4;
        int[] expected3 = {4,6,8,10,-20,-18,-16,-14,0,1};

        int[] testCase4 = {-10,-9,-8,-7,-6};
        int k4 = 1;
        int[] expected4 = {-6,-10,-9,-8,-7};

        int[] testCase5 = {-10,-9,-8,-7,-6};
        int k5 = 0;
        int[] expected5 = {-10,-9,-8,-7,-6};

        int[] testCase6 = {0};
        int k6 = 0;
        int[] expected6 = {0};

        int[] testCase7 = {0};
        int k7 = 1;
        int[] expected7 = {0};

        int[] testCase8 = {1,2,3,4,5,6,7,8};
        int k8 = 10;
        int[] expected8 = {7,8,1,2,3,4,5,6};

        int[] testCase9 = {1,2,3,4,5,6,7,8};
        int k9 = 8;
        int[] expected9 = {1,2,3,4,5,6,7,8};

        // Act
        Solution.rotate(testCase1, k1);
        Solution.rotate(testCase2, k2);
        Solution.rotate(testCase3, k3);
        Solution.rotate(testCase4, k4);
        Solution.rotate(testCase5, k5);
        Solution.rotate(testCase6, k6);
        Solution.rotate(testCase7, k7);
        Solution.rotate(testCase8, k8);
        Solution.rotate(testCase9, k9);

        // Assert
        assertArrayEquals(expected1, testCase1);
        assertArrayEquals(expected2, testCase2);
        assertArrayEquals(expected3, testCase3);
        assertArrayEquals(expected4, testCase4);
        assertArrayEquals(expected5, testCase5);
        assertArrayEquals(expected6, testCase6);
        assertArrayEquals(expected7, testCase7);
        assertArrayEquals(expected8, testCase8);
        assertArrayEquals(expected9, testCase9);
    }

    @org.junit.jupiter.api.Test
    void reverse() {
        // Arrange
        int[] testCase1 = {1,-100,3,99,1000};
        int[] expected1 = {1000,99, 3, -100, 1};

        int[] testCase2 = {1,-100,3,99};
        int[] expected2 = {-100, 1, 3, 99}; // reversing first half of the array

        int[] testCase3 = {-100, 1, 3, 99};
        int[] expected3 = {-100, 1, 99, 3}; // reversing second half of the array

        int[] testCase4 = {-100, 1, 99, 3};
        int[] expected4 = {3, 99, 1, -100}; // reversing the whole array

        int[] testCase5 = {-1};
        int[] expected5 = {-1};

        // Act
        Solution.reverse(testCase1, 0, testCase1.length-1);
        Solution.reverse(testCase2,0, 1);
        Solution.reverse(testCase3, 2, testCase3.length-1);
        Solution.reverse(testCase4, 0, testCase4.length-1);
        Solution.reverse(testCase5, 0, testCase5.length-1);

        // Assert
        assertArrayEquals(expected1, testCase1);
        assertArrayEquals(expected2, testCase2);
        assertArrayEquals(expected3, testCase3);
        assertArrayEquals(expected4, testCase4);
        assertArrayEquals(expected5, testCase5);
    }
}