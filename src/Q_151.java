public class Q_151 {
    public static void main(String[] args) {
        System.out.print(reverseWords("  hello world  "));
        System.out.println(".");
    }

    static String reverseWords(String s) {
        s = s + " ";
        String s_ = "";
        String sRev = "";
        String sRevRev = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }

            s_ += s.charAt(i);

            if (s.charAt(i+1) == ' ') {
                sRev += reverse(s_);
                sRev += " ";
                s_ = "";
            }
        }
        sRevRev = sRev.substring(0,sRev.length()-1);

        return reverse(sRevRev);
    }

    static String reverse(String str) {

        StringBuilder strRev = new StringBuilder(str);

        for (int i = 0; i < strRev.length()/2; i++) {
            int start = i;
            int end = strRev.length() - 1 - i;

            char front = strRev.charAt(start);
            char back = strRev.charAt(end);

            strRev.setCharAt(start,back);
            strRev.setCharAt(end,front);
        }

        return strRev.toString();
    }
}
