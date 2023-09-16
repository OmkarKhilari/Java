public class PalindromeStrings {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
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

        if (original.toString().equals(check.toString())) {
            return true;
        }

        return false;
    }
}
