import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

    @org.junit.jupiter.api.Test
    void addCar() {
        // Arrange
        ParkingSystem testCase1 = new ParkingSystem(1, 1, 0);
        boolean expected1 = true; // return true because there is 1 available slot for a big car
        boolean expected2 = true; // return true because there is 1 available slot for a medium car
        boolean expected3 = false; // return false because there is no available slot for a small car
        boolean expected4 = false; // return false because there is no more available slot for a big car
        boolean expected5 = false; // return false because there is no available slot for a medium car

        ParkingSystem testCase2 = new ParkingSystem(2, 3, 3);
        boolean expected6 = true; // return true because there is 2 available slots for a big car
        boolean expected7 = true; // return true because there is 3 available slots for a medium car
        boolean expected8 = true; // return true because there is 1 available slot for a big car
        boolean expected9 = true; // return true because there is 3 available slots for a small car
        boolean expected10 = true; // return true because there is 2 available slots for a medium car
        boolean expected11 = true; // return true because there is 1 available slot for a medium car
        boolean expected12 = false; // return false because all slots for a medium car are already occupied.
        boolean expected13 = true; // return true because there is 2 available slots for a small car

        // Act
        boolean actual1 = testCase1.addCar(1);
        boolean actual2 = testCase1.addCar(2);
        boolean actual3 = testCase1.addCar(3);
        boolean actual4 = testCase1.addCar(1);
        boolean actual5 = testCase1.addCar(2);

        boolean actual6 = testCase2.addCar(1);
        boolean actual7 = testCase2.addCar(2);
        boolean actual8 = testCase2.addCar(1);
        boolean actual9 = testCase2.addCar(3);
        boolean actual10 = testCase2.addCar(2);
        boolean actual11= testCase2.addCar(2);
        boolean actual12 = testCase2.addCar(2);
        boolean actual13 = testCase2.addCar(3);

        // Assert
        assertNotNull(testCase1);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
        assertEquals(expected4, actual4);
        assertEquals(expected5, actual5);

        assertNotNull(testCase2);
        assertEquals(expected6, actual6);
        assertEquals(expected7, actual7);
        assertEquals(expected8, actual8);
        assertEquals(expected9, actual9);
        assertEquals(expected10, actual10);
        assertEquals(expected11, actual11);
        assertEquals(expected12, actual12);
        assertEquals(expected13, actual13);
    }
}