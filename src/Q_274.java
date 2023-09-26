import java.util.Arrays;

public class Q_274 {
    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {

        // if (citations.length == 1 && citations[0] != 0) return 1;
        // if (citations.length == 1 && citations[0] == 0) return 0;

        Arrays.sort(citations);

        int count = 0;
        while (count < citations.length && citations.length - count > citations[count]) {
            count++;
        }
        return citations.length - count;
    }

    }
