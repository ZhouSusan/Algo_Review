public class BinarySearchTree {
    Node root;

    public void insert(int value) {
        insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            root = new Node();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public boolean contains(int val) {
        return contains(this.root, val);
    }

    private boolean contains(Node root, int val) {
        if (root == null)
        {
            return false;
        }

        if (root.data == val) {
            return true;
        }

        if (val < root.data) {
            return contains(root.left, val);
        }
        

        if (val > root.data) {
            return contains(root.right, val);

        }

        // value is fine
        return true;
    }
}
