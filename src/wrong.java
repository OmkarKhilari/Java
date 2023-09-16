public class wrong {
    public static void main(String[] args) {

    }
    class Solution {
        public int search(int[] nums, int target) {
            quickSort(nums,0,nums.length - 1);

            return binarySearch(nums,target);
        }

        static void quickSort(int[] nums, int lo, int hi) {
            if(lo >= hi) return;

            int start = lo;
            int end = hi;
            int mid = start + (end - start)/2;

            int pivot = nums[mid];

            while(start <= end) {
                while(nums[start] < pivot) {
                    start++;
                }
                while(nums[end] > pivot) {
                    end--;
                }

                if(start <= end) {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }

                quickSort(nums,lo,end);
                quickSort(nums,start,hi);
            }
        }

        static int binarySearch(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start < end) {
                int mid = start + (end - start)/2;

                if(nums[mid] < target) {
                    start = mid + 1;

                } else if (nums[mid] > target) {
                    end = mid;
                } else {
                    return mid;
                }
            }
            return start;
        }
    }
}
