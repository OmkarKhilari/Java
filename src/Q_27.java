import java.util.ArrayList;

public class Q_27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        int val = 2;

        System.out.println(removeElement(nums,val));
    }

    static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                list.add(num);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        return list.size();
    }

    static int removeElement2(int[] nums, int val) {

        int count = 0;

        for (int num : nums) {
            if (num == val) {
                num = Integer.MAX_VALUE;
                count++;
            }
        }

        return nums.length - count;
    }
}
