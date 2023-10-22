public class gfg_21_10_23 {
    public static void main(String[] args) {

    }

    static long sumOfDivisors(int N){
        // code here
        long finalSum = 0;

        for (int i = 1; i <= N; i++) {
            finalSum += i * (N/i);
        }

        return finalSum;
    }

}
