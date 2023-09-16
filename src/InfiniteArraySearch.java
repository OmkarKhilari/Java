public class InfiniteArraySearch {
    public static void main(String[] args) {
//        Infinite Array ==> dont use .length
        int[] arr = {2,3,5,9,14,16,18};
        int target = 3;

        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {

            int temp = end + 1; //As start should be updated after the end is updated

            end = end + (end - start + 1) * 2; //Doubling the size of box everytime

            start = temp;
        }

        return binarySearch(arr,target,start,end); //Sending final range to search for element
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start)/2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target){
                return mid;
            }
        }
        return arr[mid];
    }
}
