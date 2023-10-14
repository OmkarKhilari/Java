import java.util.ArrayList;
import java.util.Stack;

public class gfg_14_10_23 {
    public static void main(String[] args) {

    }

    class Solution
    {
        // Function to find the nodes that are common in both BSTs.
        public static ArrayList<Integer> findCommon(gfg_11_10_23.Node root1, gfg_11_10_23.Node root2)
        {
            ArrayList<Integer> result = new ArrayList<>();
            Stack<gfg_11_10_23.Node> stack1 = new Stack<>();
            Stack<gfg_11_10_23.Node> stack2 = new Stack<>();

            while (true)
            {
                // Push the leftmost nodes into the stack1.
                while (root1 != null)
                {
                    stack1.push(root1);
                    root1 = root1.left;
                }

                // Push the leftmost nodes into the stack2.
                while (root2 != null)
                {
                    stack2.push(root2);
                    root2 = root2.left;
                }

                // If both stacks are empty, we are done.
                if (stack1.isEmpty() || stack2.isEmpty())
                    break;

                // Get the top nodes from both stacks.
                root1 = stack1.peek();
                root2 = stack2.peek();

                if (root1.data == root2.data)
                {
                    // Found a common node.
                    result.add(root1.data);
                    stack1.pop();
                    stack2.pop();
                    // Move to the right subtree.
                    root1 = root1.right;
                    root2 = root2.right;
                }
                else if (root1.data < root2.data)
                {
                    // Move to the right subtree in the first BST.
                    stack1.pop();
                    root1 = root1.right;
                    // Reset the second BST to its left subtree.
                    root2 = null;
                }
                else
                {
                    // Move to the right subtree in the second BST.
                    stack2.pop();
                    root2 = root2.right;
                    // Reset the first BST to its left subtree.
                    root1 = null;
                }
            }

            return result;
        }
    }

    // Function to find the nodes that are common in both BSTs.
        public static ArrayList<Integer> findCommon(gfg_11_10_23.Node root1, gfg_11_10_23.Node root2)
        {
            ArrayList<Integer> result = new ArrayList<>();
            Stack<gfg_11_10_23.Node> stack1 = new Stack<>();
            Stack<gfg_11_10_23.Node> stack2 = new Stack<>();

            while (true)
            {
                // Push the leftmost nodes into the stack1.
                while (root1 != null)
                {
                    stack1.push(root1);
                    root1 = root1.left;
                }

                // Push the leftmost nodes into the stack2.
                while (root2 != null)
                {
                    stack2.push(root2);
                    root2 = root2.left;
                }

                // If both stacks are empty, we are done.
                if (stack1.isEmpty() || stack2.isEmpty())
                    break;

                // Get the top nodes from both stacks.
                root1 = stack1.peek();
                root2 = stack2.peek();

                if (root1.data == root2.data)
                {
                    // Found a common node.
                    result.add(root1.data);
                    stack1.pop();
                    stack2.pop();
                    // Move to the right subtree.
                    root1 = root1.right;
                    root2 = root2.right;
                }
                else if (root1.data < root2.data)
                {
                    // Move to the right subtree in the first BST.
                    stack1.pop();
                    root1 = root1.right;
                    // Reset the second BST to its left subtree.
                    root2 = null;
                }
                else
                {
                    // Move to the right subtree in the second BST.
                    stack2.pop();
                    root2 = root2.right;
                    // Reset the first BST to its left subtree.
                    root1 = null;
                }
            }

            return result;
        }
    }


