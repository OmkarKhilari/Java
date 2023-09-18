package LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(2);
        list.insertLast(69);
        list.insert(28,3);

        list.display();
//        list.deleteFirst();
//        list.deleteLast();
        list.delete(3);
//        System.out.println(list.deleteFirst());
        list.display();
    }
}
