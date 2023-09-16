public class Q_852 {
    public static void main(String[] args) {

    }

    static int mountainPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
