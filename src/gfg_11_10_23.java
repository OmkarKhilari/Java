public class gfg_11_10_23 {
    public static void main(String[] args) {

    }

    class Node
    {
        int data;
        Node left,right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    boolean isBalanced(Node node)
    {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1 && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced
         */
        return false;
    }

    /* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
    /*  The function Compute the "height" of a tree. Height
       is the number of nodes along the longest path from
       the root node down to the farthest leaf node.*/
    int height(Node node)
    {
        /* base case tree is empty */
        if (node == null)
            return 0;

        /* If tree is not empty then height = 1 + max of
         left height and right heights */
        return 1
                + Math.max(height(node.left),
                height(node.right));
    }
}
