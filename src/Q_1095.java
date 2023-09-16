//class MountainArray {
////    public int get(int index) {
////        return this.get(index);
////    }
//    public int length() {
//        return this.length();
//    }
//}


public class Q_1095 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int peak = mountainPeak(arr);
        int firstSearch = OABS(arr,target,0,peak-1);
        int secondSearch = OABS(arr,target,peak, arr.length-1);

        if(firstSearch > secondSearch) System.out.println(secondSearch);
        else System.out.println(firstSearch);
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

    static int OABS(int[] arr, int target, int start, int end) {
//        int start = 0;
//        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;
            if(arr[start] > arr[end]){
                if(arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid]  < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

            if(arr[start] < arr[end]) {
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
