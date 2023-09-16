import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,34,32,23,76,56,72};
        int target = 72;

        int[][] arr2d = {
                {111,222,333},
                {43,32,21},
                {12,23,34}
        };

        int target2 = 399;
//        System.out.println(Arrays.toString(ArraySearch2D(arr2d,target2)));
        System.out.println(Minimum2D(arr2d));
    }


    //Search for target in 1D Array and return
    static boolean ArraySearch(int[] arr, int target) {
        for(int num : arr) {
            if(num == target) {
                return true;
            }
        }
        return false;
    }

    //Search for target in 2D Array and return
    static int[] ArraySearch2D(int[][] arr, int target) {
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols] == target) {
                    return new int[]{rows+1,cols+1};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int Minimum(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    static int Minimum2D(int[][] arr) {
        int min = Integer.MAX_VALUE;

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(arr[rows][cols] < min) {
                    min = arr[rows][cols];
                }
            }
        }
        return min;
    }
}
