import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Node head = Node.constructLL();
        Node.displayLL(head);

        System.out.println("\nRemoving duplicates");
        Set<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev = null;

        while(temp != null) {
            int data = temp.data;
            if(!set.contains(data)) {
                set.add(data);
                prev = temp;
            } else {
                prev.next = temp.next;
            }
            temp = temp.next;
        }

        Node temp2 = head;
        Node.displayLL(temp2);
    }
}
