import java.util.ArrayList;

public class Q_6 {
    public static void main(String[] args) {

    }
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        StringBuilder[] sb = new StringBuilder[numRows];
        int row = 0, dir = 0;

        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row += dir;
            sb[row].append(c);

            if (row == 0 || row == numRows - 1) {
                dir = (dir == 0) ? 1 : -dir;
            }
        }

        return convert(sb);
    }

    private String convert(StringBuilder[] sb) {
        StringBuilder result = new StringBuilder();

        for (StringBuilder sb_ : sb) {
            result.append(sb_.toString());
        }

        return result.toString();
    }

}
