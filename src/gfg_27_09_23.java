import java.util.ArrayList;

public class gfg_27_09_23 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7};
        int[] brr = {10,20,30,40};

        System.out.println(printClosest(arr,brr,4,4,32));
    }

    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
//        int i = 0;
//        int j = m-1;
        int xx = 0;
        int y = m-1;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0, j = brr.length - 1; i < arr.length && j >= 0; ) {
            if (Math.abs((arr[i] + brr[j]) - x) < Math.abs((arr[xx] + brr[y]) - x))
            {
                xx = i;
                y = j;
            }

            if (arr[i] + brr[j] < x) {
                i++;
            }

            else if (arr[i] + brr[j] > x) {
                j--;
            }

            else {
                i++; j--;
            }
        }

        list.add(arr[xx]);
        list.add(brr[y]);

        return list;
    }
}
