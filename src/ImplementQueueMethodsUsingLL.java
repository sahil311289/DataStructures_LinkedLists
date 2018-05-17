import java.util.LinkedList;
import java.util.Scanner;

public class ImplementQueueMethodsUsingLL {
    static LinkedList<Integer> head = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        insert(input);

        while(input != 0) {
            input = scan.nextInt();
            if(input == -1) {
                remove();
            } else {
                insert(input);
            }
        }
    }

    public static void insert(int num) {
        head.add(num);
        display();
    }

    public static void remove() {
        if(head.size() != 0) {
            head.remove();
        }
        display();
    }

    public static void display() {
        if(head.size() != 0) {
            head.forEach(v -> {
                System.out.print(v + " -> ");
            });
        }
    }
}
