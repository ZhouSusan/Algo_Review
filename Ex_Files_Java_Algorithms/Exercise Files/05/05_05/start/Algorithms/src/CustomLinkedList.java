import java.util.HashSet;

public class CustomLinkedList {

    Node head;

    public boolean hasCycle() {
        if (head == null || head.next == null) {
            return false;
        }

        HashSet nodesSet = new HashSet();
        Node curr = head;
        while (curr != null) {
            if (!nodesSet.contains(curr.data)) {
                nodesSet.add(curr.data);
                curr = curr.next;
            } else {
                return true;
            }
        }

        return false;
    }
}
