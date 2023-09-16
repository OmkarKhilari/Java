import java.util.Arrays;

public class Array2DBS {
    public static void main(String[] args) {
        int[][] arr = {
                {21,3,16,45},
                {22,43,34,56},
                {23,78,67,76}
        };

        int target = 34;
        System.out.println(Arrays.toString(SpaceReductionA2D(arr,target)));
    }

    static int[] SpaceReductionA2D(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == target) {
                return new int[]{row,col};
            }
            if(matrix[row][col] > target){
                col--;
            } else {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
