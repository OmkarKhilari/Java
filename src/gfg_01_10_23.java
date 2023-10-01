import java.util.ArrayList;

public class gfg_01_10_23 {
    public static void main(String[] args) {

    }

    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;


        if (n == 1 && m == 1) {
            list.add(matrix[i][j]);
            return list;
        } else if (n == 1) {
            while (j < m) {
                list.add(matrix[i][j]);
                j++;
            }

            return list;
        } else if (m == 1) {
            while (i < n) {
                list.add(matrix[i][j]);
                i++;
            }

            return list;
        }

        while (i == 0 && j < m) {
            list.add(matrix[i][j]);
            j++;
        }

        j--;
        i++;

        while (j == m-1 && i < n) {
            list.add(matrix[i][j]);
            i++;
        }

        i--;
        j--;

        while (i == n-1 && j > 0) {
            list.add(matrix[i][j]);
            j--;
        }

        while (j == 0 && i > 0) {
            list.add(matrix[i][j]);
            i--;
        }

        return list;
    }
}
