public class Q_48 {
    public static void main(String[] args){
        int[][] matrix = {
                {1,2},
                {3,4}
        } ;

        transpose(matrix);
        finalSwap(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                swap(matrix,i,j);
            }
        }
    }

    static void finalSwap(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - 1 - j];
                matrix[i][matrix[i].length - 1 - j] = temp;
            }
        }
    }
    static void swap(int[][] matrix, int a, int b) {
        int temp = matrix[a][b];
        matrix[a][b] = matrix[b][a];
        matrix[b][a] = temp;
    }
}
