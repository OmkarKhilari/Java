public class gfg_05_10_23 {
    public static void main(String[] args) {

    }

    long substrCount (String s, int k) {
        // your code here
        return helper(s,k) - helper(s,k-1);
    }

    long helper(String s, int k){
        int arr[] = new int[26];

        int dist = 0, left = 0;
        long ans = 0;

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            if(arr[s.charAt(i) - 'a'] == 1) dist++;

            while(dist > k){
                arr[s.charAt(left)-'a']--;
                if(arr[s.charAt(left)-'a'] == 0) dist--;
                left++;
            }
            ans = ans + (i-left+1);
        }
        return ans;
    }
}
