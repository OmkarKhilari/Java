import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Omkar");
        String sb = "Omkar";
//        reverse(sb);

        System.out.println(sb);
    }

    int isPalindrome(String S) {
        // code here
        StringBuilder strOri = new StringBuilder(S);

        if(strOri.equals (reverse(strOri))) {
            return 1;
        } else {
            return 0;
        }
    }

    static StringBuilder reverse(StringBuilder strRev) {

        // StringBuilder strRev = new StringBuilder(s);
//
        for (int i = 0; i < strRev.length()/2; i++) {
            int start = i;
            int end = strRev.length() - 1 - i;

            char front = strRev.charAt(start);
            char back = strRev.charAt(end);

            strRev.setCharAt(start,back);
            strRev.setCharAt(end,front);
        }

        return strRev;
    }
}
