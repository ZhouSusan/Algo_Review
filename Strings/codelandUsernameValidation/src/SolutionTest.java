import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void codelandUsernameValidation() {
        // Arrange
        String testCase1 = "aa_";
        String expected1 = "false";

        String testCase2 = "u__hello_world123";
        String expected2 = "true";

        String testCase3 = "__cccctttttcccc";
        String expected3 = "false";

        String testCase4 = " b22334564ctw";
        String expected4 = "false";

        String testCase5 = "ab_________12485_____________________wukgl__________shyl____adgf";
        String expected5 = "false";

        String testCase6 = "coder_world123";
        String expected6 = "true";

        String testCase7 = "123Ping";
        String expected7 = "false";

        String testCase8 = "";
        String expected8 = "false";

        String testCase9 = "#####";
        String expected9 = "false";

        String testCase10 = "Jack1234_";
        String expected10 = "false";

        String testCase11 = null;
        String expected11 = "false";

        String testCase12 = "Jessie_T12";
        String expected12 = "true";

        // Act
        String actual1 = Solution.codelandUsernameValidation(testCase1);
        String actual2 = Solution.codelandUsernameValidation(testCase2);
        String actual3 = Solution.codelandUsernameValidation(testCase3);
        String actual4 = Solution.codelandUsernameValidation(testCase4);
        String actual5 = Solution.codelandUsernameValidation(testCase5);
        String actual6 = Solution.codelandUsernameValidation(testCase6);
        String actual7 = Solution.codelandUsernameValidation(testCase7);
        String actual8 = Solution.codelandUsernameValidation(testCase8);
        String actual9 = Solution.codelandUsernameValidation(testCase9);
        String actual10 = Solution.codelandUsernameValidation(testCase10);
        String actual11 = Solution.codelandUsernameValidation(testCase11);
        String actual12 = Solution.codelandUsernameValidation(testCase12);

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