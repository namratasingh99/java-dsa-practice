import java.util.*;
import java.lang.*;

class Pair implements Comparable<Pair>{
    int diff;
    int x;
    Pair(int x , int diff){
        this.x = x;
        this.diff=diff;
    }

    public int compareTo(Pair p){
        if(this.diff == p.diff) return Integer.compare(p.x , this.x);
        return Integer.compare(this.diff , p.diff);
    }


}
public class kClosestToXInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = {1, 3, 4, 10, 12};
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println(findKClosest(arr, k, x));

    }
    public static ArrayList<Integer> findKClosest(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<arr.length ; i++){
            int diff = arr[i]-x;
            if(diff==0) continue;
            heap.add(new Pair(arr[i], Math.abs(diff)));
            if(heap.size()>k) heap.remove();
        }
        while(heap.size()>0){
            Pair p = heap.remove();
            ans.add(p.x);
        }
        Collections.reverse(ans);
        return ans;
    }
}
