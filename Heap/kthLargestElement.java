import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kthLargestElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,43,1,45,65,3,76,4};
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int minElement = kSmallest(arr, k);
        System.out.println("kth largest element is = " +minElement);
    }
    public static int kSmallest(int[] arr , int k){
        PriorityQueue<Integer> heapAns = new PriorityQueue<>();
        int i=0 ;
        while(i<k){
            heapAns.add(arr[i]);
            i++;
        }
        while(i<arr.length){
            heapAns.add(arr[i]);
            heapAns.remove();
            i++;
        }
        int ele = heapAns.peek();
        return ele;
    }
}
