import java.util.*;
public class minCostConnectRopes {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 6, 9};
        System.out.println("Min cost to connect all ropes is  " + minCost(arr));
    }
    public static int minCost(int[] arr) {
        int totalCost=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int ele : arr){
            heap.add(ele);
        }
        while(heap.size()>=2){
            int x=heap.remove();
            int y = heap.remove();
            totalCost += x+y;
            heap.add(x+y);
        }
        return totalCost;
    }
}
