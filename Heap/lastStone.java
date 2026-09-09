import java.util.*;
public class lastStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stones={2,7,4,1,8,1};
        System.out.println("Last stone weight is = "+lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int ele : stones){
            heap.add(ele);
        }
        while(heap.size()>1){
            int y = heap.remove(); 
            int x= heap.remove();
            if(x==y) continue;
            else heap.add(y-x);
        }
        if(heap.size()==0) return 0;
        else return heap.remove();
    }
}
