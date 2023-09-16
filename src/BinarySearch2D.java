import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {21,3,16,45},
                {22,43,34,56},
                {23,78,67,76}
        };

        int target = 34;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;

            if(matrix[row][mid] == target) {
                return new int[]{row,mid};
            }

            if(matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious, matrix can be empty

        if(rows == 1) {
            return binarySearch(matrix,target,0,0,cols - 1);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart < (rEnd -1)) {
            int mid = rStart + (rEnd -rStart)/2;

            if(matrix[mid][cMid] == target) {
                return new int[]{mid,cMid};
            }

            if(matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        //now we have two rows
        //check whether the target is in the col of the two rows

        if(matrix[rStart][cMid] == target) {
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target) {
            return new int[]{rStart+1,cMid};
        }

        //search in 1st half
        if(target <= matrix[rStart][cMid-1]) {
            return binarySearch(matrix,target,rStart,0,cMid-1);
        }
        //search in 2nd half
        if(target <= matrix[rStart+1][cMid-1]) {
            return binarySearch(matrix,target,rStart+1,0,cMid-1);
        }
        //search in 3rd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]) {
            return binarySearch(matrix,target,rStart,cMid+1,cols-1);
        }
        //search in 4th half
        else{
            return binarySearch(matrix,target,rStart+1,cMid+1,cols-1);
        }
    }
}
