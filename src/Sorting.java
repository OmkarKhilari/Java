import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;

            int max = getMaxIndex(arr, 0, last);

            swap(arr,max,last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;

        for (int i = start; i <= last; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }

        return max;
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
