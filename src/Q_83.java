public class Q_83 {
    public static void main(String[] args) {

    }

    static ListNode deleteDuplicates(ListNode head) {

        if (head == null) return head;
        ListNode node = head;

        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;

            } else {
                node = node.next;
            }
        }

        return head;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
