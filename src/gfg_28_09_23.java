public class gfg_28_09_23 {
    public static void main(String[] args) {

    }

    public static void convertToWave(int n, int[] a) {
        // code here
        if (n == 1) return;

        if (n % 2 == 0) {
            for (int i = 0; i < n-1; i = i+2) {
                swap(i,i+1,a);
            }
        } else {
            for (int i = 0; i < n-2; i = i+2) {
                swap(i,i+1,a);
            }
        }
    }

    private static void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
