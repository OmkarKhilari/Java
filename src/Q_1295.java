public class Q_1295 {
    public static void main(String[] args) {
        int[] arr = {12,34,2,6,7896};

        System.out.println(digits(arr));
    }

    static int digits(int[] arr) {

        int count2 = 0;
        for(int i = 0; i < arr.length ; i++) {
            int n = arr[i];
            int count1 = 0;
            while(n>0) {
                n/=10;
                count1++;
            }

            if(count1 % 2 == 0) {
                count2++;
            }
        }

        return count2;
    }
}
