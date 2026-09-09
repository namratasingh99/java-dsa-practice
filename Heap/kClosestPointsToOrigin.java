import java.util.*;

class Triplet implements Comparable<Triplet>{
    int x , y ,sqrt;
    Triplet(int x , int y , int sqrt){
        this.x = x;
        this.y=y;
        this.sqrt = sqrt;
    }

    public int compareTo(Triplet t){
        return Integer.compare(this.sqrt, t.sqrt);
    }
}


public class kClosestPointsToOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};

        System.out.println("enter the value of k");
        int k = sc.nextInt();
        System.out.println(kClosest(points, k));
    }
    public static ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        PriorityQueue<Triplet> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<points.length ; i++){
            int sqrt = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            heap.add(new Triplet(points[i][0], points[i][1], sqrt));
            if(heap.size()>k) heap.remove();
        }
        while(heap.size()>0){
            Triplet t = heap.remove();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(t.x);
            list.add(t.y);
            ans.add(list);
        }
        return ans;
    }
}
