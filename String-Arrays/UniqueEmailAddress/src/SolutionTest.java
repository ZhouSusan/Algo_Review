import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void numUniqueEmailsTest() {
        // Arrange
        String[] testcase1 = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int expected1 = 2;

        String[] testcase2 = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int expected2 = 3;

        String[] testcase3 = {"a@leetcode.com","a+b@leetcode.com","a.+b.c@leetcode.com"};
        int expected3 = 1;

        // Act
        int actual1 = Solution.numUniqueEmails(testcase1);
        int actual2 = Solution.numUniqueEmails(testcase2);
        int actual3 = Solution.numUniqueEmails(testcase3);

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}