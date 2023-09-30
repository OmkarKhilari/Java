import java.util.Arrays;

public class gfg_30_09_23 {
    public static void main(String[] args) {

    }

    void booleanMatrix(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create two arrays to keep track of rows and columns to be modified
        int[] rowMarker = new int[rows];
        int[] colMarker = new int[cols];

        // Initialize the marker arrays
        Arrays.fill(rowMarker, 0);
        Arrays.fill(colMarker, 0);

        // Mark rows and columns to be modified based on the values in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    rowMarker[i] = 1;
                    colMarker[j] = 1;
                }
            }
        }

        // Modify the matrix based on the marked rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowMarker[i] == 1 || colMarker[j] == 1) {
                    matrix[i][j] = 1;
                }
            }
        }
    }

}
