import java.util.Scanner;

// Check if the given LL is a palindrome
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();

        Node root = null;
        for(int i=0; i<length; i++) {
            if(root == null) {
                Node temp = new Node(scan.nextInt());
                root = temp;
            } else {
                Node temp = new Node(scan.nextInt());
                Node temp2 = root;
                while(temp2.next != null) {
                    temp2 = temp2.next;
                }
                temp2.next = temp;
            }
        }
        Node.displayLL(root);

        // Reverse and compare for palindrome
        Node root2 = reverse(root);
        System.out.println("\n"+compare(root, root2));
    }

    public static Node reverse(Node root) {
        Node root2 = null;
        Node temp = root;
        while(temp != null) {
            Node temp2 = new Node(temp.data);
            temp2.next = root2;
            root2 = temp2;
            temp = temp.next;
        }
        return root2;
    }

    public static boolean compare(Node root, Node root2) {
        Node temp1 = root;
        Node temp2 = root2;
        while(temp1!= null && temp2 != null) {
            if(temp1.data != temp2.data) {
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(temp1 == null && temp2 != null) {
            return false;
        } else if(temp1 != null && temp2 == null) {
            return false;
        }
        return true;
    }
}
