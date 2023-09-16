public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int target = 1;
        System.out.println(OABS(arr,target));
    }

    static int OABS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;



        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[0] > arr[arr.length-1]){
                if(arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid]  < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

            if(arr[0] < arr[arr.length-1]) {
                if(arr[mid]  < target) {
                    start = mid + 1;
                } else if (arr[mid]  > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
