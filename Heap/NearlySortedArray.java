import java.util.*;
public class NearlySortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 1, 4};
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        nearlySorted(arr, k);
        System.out.println(Arrays.toString(arr));

    }
    public static void nearlySorted(int[] arr, int k) {
        int idx=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i=0 ; i<arr.length ; i++){
            heap.add(arr[i]);
            if(heap.size()>k) {
                arr[idx] = heap.remove();
                idx++;
            }
        }
        while(heap.size()>0) {
            arr[idx]= heap.remove();
            idx++;
        }
    }
}
