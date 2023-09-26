import java.util.ArrayList;
import java.util.Arrays;

public class gfg_26_09_23 {
    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == k) {
                        ArrayList<Integer> quad = new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[left]);
                        quad.add(arr[right]);
                        res.add(quad);

                        // Move the left pointer to the right to find the next unique element
                        while (left < right && arr[left] == arr[left + 1]) {
                            left++;
                        }

                        // Move the right pointer to the left to find the next unique element
                        while (left < right && arr[right] == arr[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < k) {
                        left++;
                    } else {
                        right--;
                    }
                }

                // Skip duplicate values of j
                while (j + 1 < n && arr[j] == arr[j + 1]) {
                    j++;
                }
            }

            // Skip duplicate values of i
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                i++;
            }
        }

        return res;
    }
}
