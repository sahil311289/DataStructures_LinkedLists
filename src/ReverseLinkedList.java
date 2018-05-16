// In-place reverse LL
public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = Node.constructLL();
        Node curr = head;
        Node next = null;
        Node prev = null;

        Node.displayLL(head);
        System.out.println();

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node.displayLL(prev);
    }
}
