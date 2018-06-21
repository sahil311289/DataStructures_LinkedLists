import java.util.HashMap;
import java.util.Map;

class LRUNode {
    int key;
    int value;
    LRUNode prev, next;

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = this.next = null;
    }

    public LRUNode(int key, int value, LRUNode prev, LRUNode next) {
        this.key = key;
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}

public class LRUCache {
    int capacity;
    Map<Integer, LRUNode> map = new HashMap<>();
    LRUNode head = null;
    LRUNode tail = null;

    public int getCapacity(int capacity) {
        this.capacity = capacity;
        return this.capacity;
    }

    public static void main(String[] args) {

    }
}
