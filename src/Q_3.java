import java.util.ArrayList;

public class Q_3 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!list.isEmpty() && list.contains(s.charAt(i))) {
                if (list.size() > max) {
                    max = list.size();
                }
                list.clear();
                start++;
                i = start - 1;
            } else {
                list.add(s.charAt(i));
            }
        }

        return Math.max(list.size(), max);
    }

    }
