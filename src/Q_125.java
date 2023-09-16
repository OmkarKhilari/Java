public class Q_125 {
    public static void main(String[] args) {
        String s = "race a car";

        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        String newS = "";
        int start = 0;

        while (start < s.length()) {
            if ((s.charAt(start) <= 90 && s.charAt(start) >= 65) || (s.charAt(start) <= 57 && s.charAt(start) >= 48) || (s.charAt(start) <= 122 && s.charAt(start) >= 97)) {
                newS += s.charAt(start);
                start++;
            } else {
                start++;
            }
        }

        newS = newS.toLowerCase();

        if (isPalindrome2(newS)) return true;

        return false;
    }

    static boolean isPalindrome2(String check) {
        for (int i = 0; i < check.length()/2;) {
            if (check.charAt(i) == check.charAt(check.length() - 1 - i)) {
                i++;
            } else {
                return false;
            }
        }

        return true;
    }
}
