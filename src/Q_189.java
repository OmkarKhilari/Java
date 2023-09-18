import java.util.ArrayList;

public class Q_189 {
    public static void main(String[] args) {

    }

    static void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        k %= nums.length;

        for (int i = nums.length - k; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < nums.length - k; i++) {
            list.add(nums[i]);
        }

        int i = 0;
        for (Integer x : list) {
            nums[i++] = x;

        }
    }
}
