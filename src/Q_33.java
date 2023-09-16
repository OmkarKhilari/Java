public class Q_33 {
//    public static void main(String[] args) {
//        int[] nums = {1,3};
//        int target = 3;
//        int s = indexOfSmallestNumber(nums);
//
//        if(nums[s] == target) return s;
//
//        // if(s == 0 && nums[s] == target) return 0;
//
//        if(nums.length == 2){
//            if(s == 0 && nums[s] == target) return s;
//            else if(s == 0 && nums[s+1] == target) return s+1;
//
//            if(s == 1 && nums[s] == target) return s;
//            else if(s == 1 && nums[s-1] == target) return s-1;
//        } else {
//
//            int search1 = binarySearch(nums,target,0,s-1);
//            int search2 = binarySearch(nums,target,s,nums.length-1);
//
//            if(search1 >= 0) return search1;
//            if(search2 >= 0) return search2;
//
//        }
//        return -1;
//    }
//
//
//    static int indexOfSmallestNumber(int[] nums) {
//        int start = 0;
//        int end = nums.length-1;
//
//        while (start < end) {
//            if(nums[start] < nums[end]) return start;
//
//            int mid = start + (end - start)/2;
//            if(nums[mid] > nums[end]) {
//                start = mid + 1;
//            } else {
//                end = mid;
//            }
//        }
//        return start;
//    }
//
//    static int binarySearch(int[] nums, int target,int start,int end) {
//
//        while(start < end) {
//            int mid = start + (end - start)/2;
//
//            if(nums[mid] < target) {
//                start = mid + 1;
//
//            } else if (nums[mid] > target) {
//                end = mid;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }
}
