public class Q_142 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        int length = 0;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s) {
                // first find the length of cycle
                do {
                    length++;
                    s = s.next;
                } while (s != f);

                break;
            }
        }
        if (length == 0) {
            return null;
        }

        ListNode nf = head;
        ListNode ns = head;

        // move s ahead by length of the cycle times
        while (length != 0) {
            ns = ns.next;
            length--;
        }

        // move f and s till they meet
        while (nf != ns) {
            nf = nf.next;
            ns = ns.next;
        }

        return ns;

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
