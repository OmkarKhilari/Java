public class gfg_23_09_23 {
    public static void main(String[] args) {

    }

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int sum = 0;
        int sumL = 0;
        int sumR = 0;

        if (n == 1) return (int)arr[0];

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        for (int i = 1; i < n-1; i++) {
            sumL += arr[i-1];
            sumR = sum - (int)arr[i] - sumL;

            if (sumL == sumR) {
                return i+1;
            }
        }

        return -1;

    }
}
