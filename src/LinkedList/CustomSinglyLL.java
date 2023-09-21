package LinkedList;

public class CustomSinglyLL {

    private Node head;
    private Node tail;

    private int size;

    public CustomSinglyLL() {
        this.size = 0;
    }

    // insertion using recursion

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
        }

        if (index == size) {
            insertLast(val);
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertLast(int val) {

        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size++;

    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node getIndex(int index) {
        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void deleteFirst() {
//        int val = head.value;
        System.out.println(head.value);
        head = head.next;

        if (head == null) {
            head = tail;
        }

        size--;
//        return val;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }

        if (index == size - 1) {
            deleteLast();
        }

        Node prev = getIndex(index);
        System.out.println(prev.next.value);
        prev.next = prev.next.next;
    }

    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        System.out.println(tail.value);

        Node secondLast = getIndex(size - 1);
        tail = secondLast;
        tail.next = null;
    }
    private class Node {
        private int value;
        private Node next;

        public Node (int value) {
            this.value = value;
        }

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
