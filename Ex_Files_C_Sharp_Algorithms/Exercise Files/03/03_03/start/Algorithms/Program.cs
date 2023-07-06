using System;

namespace Algorithms {
    class CustomLinkedList {

        Node head;

        public class Node {
            public int data;
            public Node next;

            public Node(int d) { data = d; }
        }

       public void deleteBackHalf()
        {
            // this keep the list empty, or deletes the single item in the list
            if (this.head == null || head.next == null)
            {
                head = null;
            }

            Node slow = head;
            Node fast = head;
            Node prev = null; 

            while(fast != null && fast.next != null)
            { 
                prev = slow;
                slow = fast.next;
                fast = fast.next.next;
            }

            prev.next = null;
        }

        public void displayContents()
        {
            if (this.head == null)
            {
                return;
            }

            Node current = head;
            while (current != null)
            {
                Console.Write(current.data + "->");
                current = current.next;
            }
        }

        static void Main(string[] args) {
            CustomLinkedList linkedList = new CustomLinkedList();
            Node firstNode = new Node(3);
            Node secondNode = new Node(4);
            Node thirdnode = new Node(5);
            Node fouthNode = new Node(6);

            linkedList.head = firstNode;
            firstNode.next = secondNode;
            secondNode.next = thirdnode;
            thirdnode.next = fouthNode;

            linkedList.displayContents();
            linkedList.deleteBackHalf();
            Console.WriteLine("\n--------");
            linkedList.displayContents();
        }
    }
}