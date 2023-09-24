public class Q_2864 {
    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("0110001110"));
    }

    static String maximumOddBinaryNumber(String s) {
        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '1') count++;
        }

        s = "";

        for (int i = 0; i < count-1; i++) {
            s += "1";
        }

        for (int i = count-1; i < length-1; i++) {
            s += "0";
        }

        s = s+"1";
        return s;
    }

}
