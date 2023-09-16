public class Q_8 {
    public static void main(String[] args) {
        String s = "  -43992 we are together";
        System.out.println(myAtoi(s));
    }

    static int myAtoi(String s) {
        int num = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' || s.charAt(i) == '+') {
                continue;
            } else if(s.charAt(i) == '0') {
                num = num*10;
            } else if(s.charAt(i) > '0' && s.charAt(i) <= '9') {
                if(num >= 0) {
                    num = num*10 + Integer.parseInt(String.valueOf(s.charAt(i)));
                } else {
                    num = num* -1;
                    num = (num*10 + Integer.parseInt(String.valueOf(s.charAt(i)))) * -1;
                }

                if(i > 0 && s.charAt(i-1) == '-') {
                    num = num* -1;
                }
            } else {
                continue;
            }
        }
        return num;
    }
}
