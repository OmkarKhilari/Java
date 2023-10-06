public class gfg_06_10_23 {
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

    public void rearrange(Node head) {
        if (head == null || head.next == null) {
            return; // Nothing to rearrange if the list has 0 or 1 nodes.
        }

        // Initialize two pointers for the original list and extracted list.
        Node originalCurrent = head;
        Node extractedHead = head.next;
        Node extractedCurrent = extractedHead;

        // Traverse the original list and extract alternative nodes.
        while (originalCurrent != null && extractedCurrent != null) {
            originalCurrent.next = extractedCurrent.next;
            originalCurrent = originalCurrent.next;

            if (originalCurrent != null) {
                extractedCurrent.next = originalCurrent.next;
                extractedCurrent = extractedCurrent.next;
            }
        }

        // Reverse the extracted list.
        extractedHead = reverseLinkedList(extractedHead);

        // Append the reversed extracted list at the end of the original list.
        originalCurrent = head;
        while (originalCurrent.next != null) {
            originalCurrent = originalCurrent.next;
        }
        originalCurrent.next = extractedHead;
    }

    // Helper function to reverse a linked list.
    private Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }}
