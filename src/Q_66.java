import java.util.Arrays;

public class Q_66 {
    public static void main(String[] args) {
        int[] digits = {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    static int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        } else {
            int i = digits.length - 1;

            if (i == 0) {
                return new int[]{1, 0};
            }

            while (i != -1 && digits[i] == 9) {
                digits[i] = 0;
                i--;
            }

            if (digits[0] == 0) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                return newArr;
            } else {
                digits[i]++;
            }
        }

        return digits;
    }

    }

