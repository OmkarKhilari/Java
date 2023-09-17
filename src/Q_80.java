public class Q_80 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,0,0,0,0,1,1,1,1,2,3,3,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,6,6};
        int[] nums2 = {1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] nums) {
        int now = nums[0];
        int count = 0;
        int duplicate = 0;

        for (int i = 1; i < nums.length;) {
            if (nums[i] == now && duplicate == 0) {
                duplicate++;
                if (i == nums.length-1) {
                    break;
                } else {
                    i++;
                }
                continue;
            }

            if (nums[i] == now) {
                nums[i] = Integer.MAX_VALUE;
                i++;
                count++;
            } else if (nums[i] != Integer.MAX_VALUE){
                now = nums[i];
                duplicate = 0;
                i++;
            }
            else {
                i++;
            }
        }

        quickSort(nums,0,nums.length-1);

        return nums.length - count;
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
