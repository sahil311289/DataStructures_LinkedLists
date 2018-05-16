import java.util.Scanner;

public class DeleteMiddleNode {
    public static void main(String[] args) {
        Node head = Node.constructLL();
        Node.displayLL(head);

        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();
        Node temp = head;

        while(temp != null && temp.data != data) {
            temp = temp.next;
        }

        temp.data = temp.next.data;
        temp.next = temp.next.next;

        Node.displayLL(head);
    }
}
