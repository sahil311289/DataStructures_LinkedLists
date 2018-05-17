public class DeleteAlternatingNode {
    public static void main(String[] args) {
        Node head = Node.constructLL5();
        Node.displayLL(head);

        deleteAlternatingNode(head);
        System.out.println();
        Node.displayLL(head);
    }

    private static void deleteAlternatingNode(Node head) {
        Node temp = head;
        int count = 0;

        while(temp != null) {
            count++;
            if(count % 2 != 0) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }
}
