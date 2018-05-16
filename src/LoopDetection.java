// Loop detection in LL

// 1. Create 2 pointers: fast and slow
// 2. Move fast -> 2x, slow -> 1x speed until they collide
// 3. When they collide, move slow pointer to the head
// 4. Move both the pointers slowly. The point of intersection would be the collision point

public class LoopDetection {
    public static void main(String[] args) {
        Node head = Node.constructLL4();

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                break;
            }
        }

        slow = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        System.out.println("Met at "+slow.data);
    }
}
