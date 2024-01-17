import static org.junit.jupiter.api.Assertions.*;

class UsernameValidatorTest {

    @org.junit.jupiter.api.Test
    void isValidUsername() {
        // Arrange
        String testCase1 = "Julia";
        boolean expected1 = false;

        String testCase2 = "Lorelia&64";
        boolean expected2 = false;

        String testCase3 = "Harry_Potter1";
        boolean expected3 = true;

        String testCase4 = "StevenPupper_son";
        boolean expected4 = true;

        String testCase5 = "JuliRobin";
        boolean expected5 = true;

        String testCase6 = "Luke@1!";
        boolean expected6 = false;

        String testCase7 = "!JulianSteve";
        boolean expected7 = false;

        String testCase8 = "@Charmander";
        boolean expected8 = false;

        String testCase9 = "_Julia_Jones";
        boolean expected9 = false;

        String testCase10 = "";
        boolean expected10 = false;

        String testCase11 = "A01_023";
        boolean expected11 = true;

        String testCase12 = "01023";
        boolean expected12 = false;

        // Act
        boolean actual1 = UsernameValidator.isValidUsername(testCase1);
        boolean actual2 = UsernameValidator.isValidUsername(testCase2);
        boolean actual3 = UsernameValidator.isValidUsername(testCase3);
        boolean actual4 = UsernameValidator.isValidUsername(testCase4);
        boolean actual5 = UsernameValidator.isValidUsername(testCase5);
        boolean actual6 = UsernameValidator.isValidUsername(testCase6);
        boolean actual7 = UsernameValidator.isValidUsername(testCase7);
        boolean actual8 = UsernameValidator.isValidUsername(testCase8);
        boolean actual9 = UsernameValidator.isValidUsername(testCase9);
        boolean actual10 = UsernameValidator.isValidUsername(testCase10);
        boolean actual11 = UsernameValidator.isValidUsername(testCase11);
        boolean actual12 = UsernameValidator.isValidUsername(testCase12);

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
        assertEquals(expected11, actual11);
        assertEquals(expected12, actual12);
    }
}