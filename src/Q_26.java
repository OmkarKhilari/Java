import java.util.ArrayList;

public class Q_26 {
    public static void main(String[] args) {

        int[] arr = {0,0,1,1,1,3,4,4,5,6,7,7,8,9};
        System.out.println(setArray(arr));
    }

    static int setArrayWithArraylist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

//        nums = new int[list.size()];
        int i =0;
        for(Integer x : list) {
            nums[i++] = x;
        }

        return nums.length;
    }
    static int setArray(int[] nums) {
        int count = 0;
        for(int i = 0; i< nums.length-1; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    nums[j] = Integer.MAX_VALUE;
                    count++;
                    continue;
                }
            }
        }

        quickSort(nums,0,nums.length-1);
        int k = nums.length - count;

        return k;
    }

    static void quickSort(int[] nums, int lo, int hi) {

        if(lo >= hi) return;

        int s = lo;
        int e = hi;
        int m = s + (e - s)/2;

        int pivot = nums[m];

        while(s <= e) {
            while(nums[s] < pivot) {
                s++;
            }

            while(nums[e] > pivot) {
                e--;
            }

            if(s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums,lo,e);
        quickSort(nums,s,hi);

    }
}
