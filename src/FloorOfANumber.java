public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;

        System.out.println(arr[Ceiling(arr,target)]);
    }

    // Floor = greatest element in array <= target
    static int Ceiling(int[] arr, int target) {


        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start]){
            return -1;
        }
        while(start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target){
                return mid;
            }
        }


        return end;
    }
}
