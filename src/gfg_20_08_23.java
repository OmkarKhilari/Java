public class gfg_20_08_23 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int N = 7;
        int X = 2;

        System.out.println(binarySearch(arr,N,X));
    }

    static int binarySearch(int[] arr, int n, int x) {
        int start = 0;
        int end = n-1;


        while (arr[start] != arr[end]) {
            int mid = start + (end-start)/2;
            if (arr[mid] == x) {
                if(arr[start] != x) {
                    start++;
                }

                if(arr[end] != x) {
                    end--;
                }
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else if (arr[mid] < x) {
                start = mid + 1;
            }
        }

        return end-start;
    }
}
