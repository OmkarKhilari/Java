public class rotatedBinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {15,14,13,12,1,2,3,4};
        int target = 14;

        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e) return -1;  //clear condition for rotated arrays

        int m = s + (e-s)/2;
        if(arr[m] == target) return m;

        if(arr[m] >= arr[s]) {   // if this is true, it means that target can be searched in this range
            if (target >= arr[s] && target <= arr[m]) {    // if this is true, it means that s to m is sorted and target can be searched in this range
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]) {  // if this is true, it means the target lies int the second half of the array
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
}
