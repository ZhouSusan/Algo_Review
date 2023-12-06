public class Solution {

    /**
     * Reversing a linked list.
     * @param head - of a singly linked list
     * @return - the reversed list
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode temp1 = new ListNode(1);
        ListNode tempNext1 = new ListNode(2);
        temp1.next = tempNext1;
        ListNode tempNext2 = new ListNode(3);
        tempNext1.next = tempNext2;
        ListNode tempNext3 = new ListNode(4);
        tempNext2.next = tempNext3;
        ListNode tempNext4 = new ListNode(5);
        tempNext3.next = tempNext4;

        ListNode reversedLinkedList = reverseList(temp1);
        while(reversedLinkedList != null) {
            System.out.println(reversedLinkedList.val);
            reversedLinkedList = reversedLinkedList.next;
        }
    }
}