import java.util.Arrays;

public class Q_12 {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }

    static String intToRoman(int num) {
//        StringBuilder str = new StringBuilder();
        int[] rem = new int[4];
        String str = "";
        int n = 10;
        int i = 0;
        while (num > 0) {
            rem[i] = num%n;
            num = num - rem[i];
            n = n*10;
            i++;
        }

        for (int j = 3; j >= 0 ; j--) {

            if(rem[j] == 0) continue;

            if(rem[j] == 1000) {
                str = str + "M";
            } else if (rem[j] == 2000) {
                str = str + "MM";
            } else if (rem[j] == 3000) {
                str = str + "MMM";
            } else if (rem[j] == 900) {
                str = str + "CM";
            } else if (rem[j] == 800) {
                str = str + "DCCC";
            } else if (rem[j] == 700) {
                str = str + "DCC";
            } else if (rem[j] == 600) {
                str = str + "DC";
            } else if (rem[j] == 500) {
                str = str + "D";
            } else if (rem[j] == 400) {
                str = str + "CD";
            } else if (rem[j] == 300) {
                str = str + "CCC";
            } else if (rem[j] == 200) {
                str = str + "CC";
            } else if (rem[j] == 100) {
                str = str + "C";
            } else if (rem[j] == 90) {
                str = str + "XC";
            } else if (rem[j] == 80) {
                str = str + "LXXX";
            } else if (rem[j] == 70) {
                str = str + "LXX";
            } else if (rem[j] == 60) {
                str = str + "LX";
            } else if (rem[j] == 50) {
                str = str + "L";
            } else if (rem[j] == 40) {
                str = str + "XL";
            } else if (rem[j] == 30) {
                str = str + "XXX";
            } else if (rem[j] == 20) {
                str = str + "XX";
            } else if (rem[j] == 10) {
                str = str + "X";
            } else if (rem[j] == 9) {
                str = str + "IX";
            } else if (rem[j] == 8) {
                str = str + "VIII";
            } else if (rem[j] == 7) {
                str = str + "VII";
            } else if (rem[j] == 6) {
                str = str + "VI";
            } else if (rem[j] == 5) {
                str = str + "V";
            } else if (rem[j] == 4) {
                str = str + "IV";
            } else if (rem[j] == 3) {
                str = str + "III";
            } else if (rem[j] == 2) {
                str = str + "II";
            } else if (rem[j] == 1) {
                str = str + "I";
            }

        }

        return str;
    }
}
