import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void canPlaceFlowers() {
        // Arrange
        int[] flowerbed1 = {1,0,0,0,1};
        int n1 = 1;
        boolean expected1 = true;

        int[] flowerbed2 = {1,0,0,0,1};
        int n2 = 2;
        boolean expected2 = false;

        int[] flowerbed3 = {1,0,0,1,0,0,0,1,0,0};
        int n3 = 3;
        boolean expected3 = false;

        int[] flowerbed4 = {1,0,0,1,0,0,0,1,0,0};
        int n4 = 2;
        boolean expected4 = true;

        int[] flowerbed5 = {1,0,0,1,0};
        int n5 = 0;
        boolean expected5 = true;

        int[] flowerbed6 = {1,1,1,1,1};
        int n6 = 0;
        boolean expected6 = true;

        int[] flowerbed7 = {0,0,0,0,0};
        int n7 = 3;
        boolean expected7 = true;

        int[] flowerbed8 = {0,0,0};
        int n8 = 2;
        boolean expected8 = true;

        int[] flowerbed9 = {0};
        int n9 = 1;
        boolean expected9 = true;

        int[] flowerbed10 = {1};
        int n10 = 1;
        boolean expected10 = false;

        // Act
        boolean actual1 = Solution.canPlaceFlowers(flowerbed1, n1);
        boolean actual2 = Solution.canPlaceFlowers(flowerbed2, n2);
        boolean actual3 = Solution.canPlaceFlowers(flowerbed3, n3);
        boolean actual4 = Solution.canPlaceFlowers(flowerbed4, n4);
        boolean actual5 = Solution.canPlaceFlowers(flowerbed5, n5);
        boolean actual6 = Solution.canPlaceFlowers(flowerbed6, n6);
        boolean actual7 = Solution.canPlaceFlowers(flowerbed7, n7);
        boolean actual8 = Solution.canPlaceFlowers(flowerbed8, n8);
        boolean actual9 = Solution.canPlaceFlowers(flowerbed9, n9);
        boolean actual10 = Solution.canPlaceFlowers(flowerbed10, n10);

        // Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
        assertEquals(expected9, actual9);
        assertEquals(expected10, actual10);
    }
}