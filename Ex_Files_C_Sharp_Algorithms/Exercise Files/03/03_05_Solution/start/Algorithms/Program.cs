using System;

namespace Algorithms {
    class CustomLinkedList {
        Node head;
        public class Node {
            public int data;
            public Node next;
            public Node(int d) { data = d; }
        }

        public void displayContents() {
            Node current = head;
            while(current != null) {
                Console.Write(current.data + "->");
                current = current.next;
            }
        }

        public bool isEmpty()
        {
            return head == null;
        }

        public void deleteKthNodeFromEnd(int k)
        {
            if (isEmpty() || k == 0)
            {
                return;
            }

            Node slow = head;
            Node fast = head;

            for (int i = 0; i < k; i++)
            {
                fast = fast.next; 
                if (fast.next == null)
                {
                    if (i == k- 1)
                    {
                        head = head.next;
                    }
                    return;
                }
            }

            while (fast.next != null)
            {
                // WHne fast pointer reach end of the list, then slow pointer will be at the kth node
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
        }

        static void Main(string[] args) {
            CustomLinkedList linkedList = new CustomLinkedList();
            Node firstNode = new Node(3);
            Node secondNode = new Node(4);
            Node thirdNode = new Node(5);
            Node fourthNode = new Node(6);

            linkedList.head = firstNode;
            firstNode.next = secondNode;
            secondNode.next = thirdNode;
            thirdNode.next = fourthNode;

            linkedList.deleteKthNodeFromEnd(2);
            linkedList.displayContents();
        }
    }
}