public class BinaryTree {
    Node root;

    public void preOrderTraversal() {
        preOrderTraversal(this.root);
    }

    private void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.println(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);

        }
    }
}
