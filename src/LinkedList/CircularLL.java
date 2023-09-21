package LinkedList;

public class CircularLL {

    private Node head;
    private Node tail;

    private int size;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;

        if (head != null) {
            do {
                System.out.println(node.value);
                node = node.next;
            } while (node != head);
        }
    }
    private class Node {
        int value;
        Node next;

        Node (int value) {
            this.value = value;
        }

        Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
