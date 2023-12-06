import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void reverseList() {
        // Arrange
        ListNode testCase1 = new ListNode(1);
        ListNode tempNext1a = new ListNode(2);
        testCase1.next = tempNext1a;
        ListNode tempNext1b = new ListNode(3);
        tempNext1a.next = tempNext1b;
        ListNode tempNext1c = new ListNode(4);
        tempNext1b.next = tempNext1c;
        ListNode tempNext1d = new ListNode(5);
        tempNext1c.next = tempNext1d;
        ListNode expected1 = new ListNode(5);

        ListNode testCase2 = new ListNode(1);
        ListNode tempNext2a = new ListNode(2);
        testCase2.next = tempNext2a;
        ListNode expected2 = new ListNode(2);

        ListNode testCase3 = new ListNode();
        ListNode expected3 = new ListNode();

        // Act
        ListNode actual1 = Solution.reverseList(testCase1);
        ListNode actual2 = Solution.reverseList(testCase2);
        ListNode actual3 = Solution.reverseList(testCase3);

        // Assert
        assertEquals(expected1.val, actual1.val);
        assertEquals(4, actual1.next.val);
        assertEquals(3, actual1.next.next.val);
        assertEquals(2, actual1.next.next.next.val);
        assertEquals(1, actual1.next.next.next.next.val);

        assertEquals(expected2.val, actual2.val);
        assertEquals(1, actual2.next.val);

        assertEquals(expected3.val, actual3.val);
    }
}