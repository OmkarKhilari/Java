public class gfg_09_10_23 {
    public static void main(String[] args) {

    }

    class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    int height(Node root) {
        // If the tree is empty or the root is null, return 0.
        if (root == null) {
            return 0;
        }

        // Recursively calculate the height of the left and right subtrees.
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Return the maximum height among the left and right subtrees, plus 1 for the current node.
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
