import java.util.Scanner;

// Given 2 linked lists, determine if they intersect
public class Intersection {
    public static void main(String[] args) {
        Node list1 = Node.constructLL2();
        Node list2 = Node.constructLL3();

        // 1. Run through both the lists to get the length
        // 2. Compare the last element by reference. If different, return false
        // 3. Set pointers to the start of the lists
        // 4. Move the pointer on the larger list by the difference
        // 5. Traverse both the lists until pointers are the same
    }
}
