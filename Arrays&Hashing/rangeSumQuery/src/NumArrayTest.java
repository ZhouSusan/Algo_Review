import static org.junit.jupiter.api.Assertions.*;

class NumArrayTest {

    @org.junit.jupiter.api.Test
    void sumRange() {
        // Arrange
        NumArray testCase1 = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int expected1 = 1;
        int expected2 = -1;
        int expected3 = -3;

        NumArray testCase2 = new NumArray(new int[]{10,-9,4,5,-2,8,1});
        int expected4 = 10;
        int expected5 = 15;
        int expected6 = 17;

        NumArray testCase3 = new NumArray(new int[]{1});
        int expected7 = 1;


        // Act
        int actual1 = testCase1.sumRange(0,2);
        int actual2 = testCase1.sumRange(2,5);
        int actual3 = testCase1.sumRange(0,5);
        int actual4 = testCase2.sumRange(0,3);
        int actual5 = testCase2.sumRange(2,5);
        int actual6 = testCase2.sumRange(0,6);
        int actual7 = testCase3.sumRange(0,0);

        //Assert
        assertNotNull(testCase1);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);

        assertNotNull(testCase2);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);
        assertEquals(expected6, actual6);

        assertNotNull(testCase3);
        assertEquals(expected7, actual7);
    }
}