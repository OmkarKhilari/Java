public class gfg_03_10_23 {
    public static void main(String[] args) {

    }

    public String colName(long n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            // Subtract 1 from n to handle the 1-based index
            n--;

            // Calculate the remainder when divided by 26
            long remainder = n % 26;

            // Convert the remainder to a character and prepend it to the result
            result.insert(0, (char) ('A' + remainder));

            // Update n by dividing it by 26
            n /= 26;
        }

        return result.toString();
    }

}
