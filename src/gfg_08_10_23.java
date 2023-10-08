public class gfg_08_10_23 {
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


    Node sortedInsert(Node head1, int key) {
        if (head1 == null) {
            return new Node(key);
        }

        Node current = head1;
        Node toPut = new Node(key);

        if (current.data >= toPut.data) {
            toPut.next = current;
            return toPut;
        }

        while (current != null) {
            if (current.next == null) {
                current.next = toPut;
                return head1;
            }

            if (current.data <= toPut.data && current.next.data >= toPut.data) {
                toPut.next = current.next;
                current.next = toPut;
                return head1;
            } else {
                current = current.next;
            }
        }

        return head1;
    }
}
