public class gfg_07_10_23 {
    public static void main(String[] args) {

    }

    class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }

    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node front = current.next;
        Node prev = null;

        while (current != null && front != null) {
            current.next = front.next;
            front.next = current;

            if (prev == null) {
                head = front;
            } else {
                prev.next = front;
            }

            prev = current;
            current = current.next;

            if (current != null) {
                front = current.next;
            }
        }

        return head;
    }
}
