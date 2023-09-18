package LinkedList;

public class CustomDoublyLL {

    private Node head;
    private Node tail;

    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        Node last = head;
        Node node = new Node(val);

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node temp = head;
        Node last = null;

        while(temp != null) {
            last = temp;
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

        while(last != null) {
//            last = temp;
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val,Node next, Node prev) {
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
