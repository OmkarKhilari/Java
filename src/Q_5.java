public class Q_5 {

    // Idea:
    // one ptr at start and one at end
    // store 0 to start in subStart and end to length - 1 in subEnd
    // check subStart and subEnd for palindrome, if palindrome store in possibleString
    // to store any String in possibleString compare lengths
    // return possibleString

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

    static String longestPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        String left = "";
        String right = "";
        String possible = "";

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                left = s.substring(0,start+1);
                right = s.substring(end,s.length());
                start++;
                end--;
            } else {
                if (isPalindrome(s.substring(start,end+1)) && s.substring(start,end+1).length() >= possible.length()) {
                    possible = s.substring(start,end+1);
                }
                left = s.substring(0,start+1);
                right = s.substring(end,s.length());
                start++;
                end--;
            }

            if (isPalindrome(right) && right.length() >= possible.length()) {
                possible = right;
            }

            if (isPalindrome(left) && left.length() >= possible.length()) {
                possible = left;
            }
        }

        return possible;
    }

    static boolean isPalindrome(String s) {
        StringBuilder check = new StringBuilder(s);
        StringBuilder original = new StringBuilder(s);

        for (int i = 0; i < check.length()/2; i++) {
            int start = i;
            int end = check.length() - i - 1;

            char front = check.charAt(start);
            char back = check.charAt(end);

            check.setCharAt(start,back);
            check.setCharAt(end,front);
        }

        if (check.toString().equals(original.toString())) {
            return true;
        }

        return false;
    }
}
