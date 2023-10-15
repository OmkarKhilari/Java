import java.util.ArrayList;
import java.util.List;

public class gfg_15_10_23 {
    public static void main(String[] args) {

    }


    class Node
    {
        int data;
        Node right, left;
        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    class GfG {
        Node buildBalancedTree(Node root) {
            List<Integer> nodeList = new ArrayList<>();
            inOrderTraversal(root, nodeList);

            return buildBalancedBST(nodeList, 0, nodeList.size() - 1);
        }

        void inOrderTraversal(Node root, List<Integer> nodeList) {
            if (root == null)
                return;
            inOrderTraversal(root.left, nodeList);
            nodeList.add(root.data);
            inOrderTraversal(root.right, nodeList);
        }

        Node buildBalancedBST(List<Integer> nodeList, int start, int end) {
            if (start > end)
                return null;

            int mid = (start + end) / 2;
            Node newNode = new Node(nodeList.get(mid));
            newNode.left = buildBalancedBST(nodeList, start, mid - 1);
            newNode.right = buildBalancedBST(nodeList, mid + 1, end);
            return newNode;
        }
    }


}
