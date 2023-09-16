import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class duplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
//        System.out.println(subsetDuplicates(arr));
//        List<List<Integer>> ans = subsetDuplicates(arr);
        for(List<Integer> list : subsetDuplicates(arr)) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subsetDuplicates(int[] arr) {
        Arrays.sort(arr);

        int start = 0;
        int end = 0;

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int i = 0; i < arr.length; i++) {

            start = 0;
            int n = outer.size();

            if(i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }

            end = outer.size() - 1;

            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
