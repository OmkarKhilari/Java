import java.util.HashMap;

public class gfg_02_10_23 {
    public static void main(String[] args) {

    }

    int distinctSubsequences(String S) {

        int MOD = 1000000007;
        int n = S.length();

        // Initialize a DP array to store the number of distinct subsequences
        int[] dp = new int[n + 1];

        // Initialize dp[0] as 1 because an empty string is a valid subsequence.
        dp[0] = 1;

        // Create a HashMap to store the last index of each character
        HashMap<Character, Integer> lastSeen = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % MOD;

            char currentChar = S.charAt(i - 1);

            if (lastSeen.containsKey(currentChar)) {
                int lastIndex = lastSeen.get(currentChar);

                // Subtract the number of subsequences ending at the previous occurrence of the same character
                dp[i] = (dp[i] - dp[lastIndex - 1] + MOD) % MOD;
            }

            // Update the last seen index of the current character
            lastSeen.put(currentChar, i);
        }

        // Subtract 1 to exclude the empty string as a subsequence
        return (dp[n] + MOD) % MOD;
    }

}
