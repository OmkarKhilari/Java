public class gfg_20_10_23 {
    public static void main(String[] args) {

    }

    static int isPossible(int N, int arr[]) {
        // code here
        long sum = 0;

        for (int x : arr) {
            sum += x;
        }

        if (sum % 3 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
