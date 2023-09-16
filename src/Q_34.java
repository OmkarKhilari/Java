import java.util.ArrayList;

public class Q_34 {
    public static void main(String[] args) {

    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        int s = search(nums,target,true);
        int e = search(nums,target,false);

        ans[0] = s;
        ans[1] = e;
        return ans;
    }

     static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(nums[mid] >= target) {
                end = mid - 1;
            } else if(nums[mid] <= target) {
                start = mid + 1;
            } else {
                ans = mid;

                if(findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
