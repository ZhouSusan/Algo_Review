using System;
using System.Reflection.Metadata.Ecma335;

namespace Algorithms {

    class Node
    {
        public Node Left { get; set; }
        public Node Right { get; set; }
        public int Data { get; set; }
    }

    class BinarySearchTree
    {
        public static Node Insert(Node root, int val)
        {
            if (root == null)
            {
                root = new Node();
                root.Data = val;
                return root;
            }
           
            if (val < root.Data)
            {
                // insert on left
                root.Left = Insert(root.Left, val);
            }
            else if (val > root.Data)
            {
                // insert on right
                root.Right = Insert(root.Right, val);
            }

            return root;
        }
    }

    class Program {
        static void Main(string[] args) {

            Node rootNode = new Node();
            rootNode.Data = 4;
            BinarySearchTree.Insert(rootNode, 2);
            BinarySearchTree.Insert(rootNode, 3);
            BinarySearchTree.Insert(rootNode, 5);
            BinarySearchTree.Insert(rootNode, 6);
            BinarySearchTree.Insert(rootNode, 4);

        }
    }
}