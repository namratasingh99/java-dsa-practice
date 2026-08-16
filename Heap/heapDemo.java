import java.util.*;
public class heapDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        System.out.println(minHeap.peek());
        minHeap.add(5);
        System.out.println(minHeap.peek());
        minHeap.add(15);
        System.out.println(minHeap.peek());
        System.out.println(minHeap.size());
        System.out.println(minHeap.remove());
        System.out.println(minHeap.peek());
    }
}
