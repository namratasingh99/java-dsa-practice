import java.util.*;

class Pair implements Comparable<Pair>{
    int x , freq;
    Pair(int x , int freq){
        this.x = x;
        this.freq=freq;
    }

    public int compareTo(Pair p){
        if(this.freq == p.freq){
            return Integer.compare(this.x , p.x);
        }
        return Integer.compare(this.freq , p.freq);
    }
}
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k ");
        int k = sc.nextInt();
        System.out.println(topKFreq(arr , k));
    }
    public static ArrayList<Integer> topKFreq(int[] arr, int k) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        PriorityQueue<Pair> heap = new PriorityQueue<>();
        HashMap<Integer , Integer> map = new HashMap<>();


        for(int i=0 ; i<arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
                continue;
            }
            map.put(arr[i] , 1);
        }

        for(Integer key :map.keySet()){
            heap.add(new Pair(key , map.get(key)));
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
