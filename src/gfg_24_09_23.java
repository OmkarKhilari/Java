import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class gfg_24_09_23 {
    public static void main(String[] args) {
        System.out.println(duplicates(new int[]{1,5,5,3,3,3,8,1} , 4));
    }

    static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x: arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x)+1);
            } else {
                map.put(x,1);
            }
        }

        TreeSet<Integer> set = new TreeSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.get(entry.getKey())>1){
                set.add(entry.getKey());
            }
        }
        //        for (Integer x:set){
//            list.add(x);
//        }
        if (set.size()>0) return new ArrayList<>(set);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        return list;

    }
}
