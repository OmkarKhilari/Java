public class Reverse {
    public static void main(String[] args) {
        int a = -12321;
//        int b = reverse(a);
        System.out.println(palindrome(a));
    }

//    wrong :
//    static int reverseANumber(int x) {
//        if(x%10 == x) {
//            return x;
//        }
//
//        return (x%10)*10 + reverseANumber(x/10);
//    }

    static int reverse(int n) {
        int digits = (int)(Math.log10(n)) + 1;

        return helper(n,digits);
    }

    static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }

        int rem = n%10;

        return rem* (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }

    static boolean palindrome(int n) {
        if(n == reverse(n)) return true;
        else return false;
    }
}
