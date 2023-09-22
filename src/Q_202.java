public class Q_202 {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    int findSquare(int num) {
        int ans = 0;
        int rem;
        while (num > 0) {
            rem = num%10;
            ans += rem*rem;
            num = num/10;
        }

        return ans;
    }

}
