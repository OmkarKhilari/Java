import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }


    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return finalMerge(left,right);
    }

    private static int[] finalMerge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];

        int i = 0; //pointer for first;
        int j = 0; //pointer for second;
        int k = 0; //pointer for merged;

        while(i < first.length && j < second.length) {
            if(first[i] > second[j]) {
                merged[k] = second[j];
                j++;
            } else {
                merged[k] = first[i];
                i++;
            }
            k++;
        }

        while(j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }

        while(i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }

        return merged;
    }

    //In place Merge Sort
    static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end - start == 1) return ;

        int mid = start + (end - start)/2;

        mergeSortInPlace(arr,start,mid);
        mergeSortInPlace(arr,mid,end);

        finalMergeInPlace(arr,start,end,mid);
    }

    static void finalMergeInPlace(int[] arr, int start, int end, int mid) {
        int[] merged = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while(i < mid && j < end) {
            if(arr[i] > arr[j]) {
                merged[k] = arr[j];
                j++;
            } else {
                merged[k] = arr[i];
                i++;
            }
            k++;
        }

        while(j < end) {
            merged[k] = arr[j];
            j++;
            k++;
        }

        while(i < mid) {
            merged[k] = arr[i];
            i++;
            k++;
        }

        for (int l = 0; l < merged.length; l++) {
            arr[start+l] = merged[l];
        }

    }
}
