import java.util.ArrayList;

public class Q_80 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,1,1,1,1,2,3,3,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5};
        int[] nums2 = {1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {

        int duplicate = 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for (int i = 1; i < nums.length;) {
            if (duplicate == 0 && nums[i] == nums[i-1]) {
                list.add(nums[i]);

                duplicate++;
                i++;
                continue;
            } else if (!list.contains(nums[i])) {
                list.add(nums[i]);
                duplicate = 0;
                i++;
            } else {
                i++;
            }
        }

        int i =0;
        for(Integer x : list) {
            nums[i++] = x;
        }

        return list.size();
    }


    static void quickSort(int[] arr, int low, int high) {
        if(low >= high) return;

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;

        int pivot = arr[mid];

        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            quickSort(arr,low,end);
            quickSort(arr,start,high);
        }
    }

}


//class Solution {

//}
