import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @org.junit.jupiter.api.Test
    void findMaximum() {
        // Act
        int num1 = 4;
        int num2 = 39;
        int num3 = 72;
        int num4 = -1;
        int num5 = -45;
        int num6 = 0;
        int num7 = -76;

        int expected1 = 72;
        int expected2 = -1;
        int expected3 = 4;

        // Arrange
        int actual1 = Algorithms.findMaximum(num1, num2, num3);
        int actual2 = Algorithms.findMaximum(num4, num5, num7);
        int actual3 = Algorithms.findMaximum(num7, num1, num6);

        // Assert
       assertEquals(expected1, actual1);
       assertEquals(expected2, actual2);
       assertEquals(expected3, actual3);
    }
}