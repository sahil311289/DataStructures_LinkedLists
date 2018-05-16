import java.util.Scanner;

// Return kth element from the end
public class ReturnKthToLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();

        Node head = Node.constructLL();
        Node temp1 = head;
        for(int i=0; i<position; i++) {
            temp1 = temp1.next;
        }

        Node temp2 = head;
        while(temp1 != null) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        System.out.println(position +"th element form the end is: " + temp2.data);
    }
}
