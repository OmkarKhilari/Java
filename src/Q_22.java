import java.util.ArrayList;
import java.util.List;

public class Q_22 {
    public static void main(String[] args) {
        int n = 8;
        String open = "";
        String closed = "";
        for (int i = 0; i < n; i++) {
            open += "(";
            closed += ")";
        }

        System.out.println(parenthesis("", open, closed, n));
    }

    static List<String> parenthesis(String p, String open, String closed, int n) {
//        int open = n;
//        int closed = n;
        if (open.isEmpty() && closed.isEmpty()) {
            List<String> list = new ArrayList<>();
            if(validParenthesis(p,n)) {
                list.add(p);
            }
            return list;
        }

        char ch1 = 'n';
        if (!(open.isEmpty())) {
            ch1 = open.charAt(0);
        }
        char ch2 = 'n';
        if (!(closed.isEmpty())) {
            ch2 = closed.charAt(0);
        }

        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();
        if (!closed.isEmpty()) {
            left = parenthesis(p + ch2, open, closed.substring(1), n);
        }
        if (!open.isEmpty()) {
            right = parenthesis(p + ch1, open.substring(1), closed, n);
        }
        right.addAll(left);

        return right;
    }

    static boolean validParenthesis(String check, int n) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < 2 * n; i++) {
            if (check.charAt(i) == '(') {
                list.add(check.charAt(i));
            } else if (check.charAt(i) == ')') {
                if (!list.isEmpty() && list.get(list.size() - 1) == '(') {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            }
        }
        if (list.isEmpty()) {
            return true;
        }

        return false;
    }
}
