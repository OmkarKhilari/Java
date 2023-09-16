public class ArraysTargetFinder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,6};
        int target = 4;
        System.out.println(check(arr,target,0));
    }

    static int check(int[] arr, int target, int index) {
        if (index == arr.length) return -1;

        if (arr[index] == target) {
            return index;
        } else {
            return check(arr, target, index + 1);
        }
    }

        static boolean justCheck(int[] arr, int target, int index) {
            if (index == arr.length) return false;

            return arr[index] == target || justCheck(arr, target, index + 1);
        }
}
