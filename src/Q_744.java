public class Q_744 {
    public static void main(String[] args) {
        char[] arr = {'e','e','j','j'};
        char target = 'j';

        System.out.println(nextGreatestLetter(arr,target));
    }

    static char helper(char[] arr, int i,char x){

        if(i>=arr.length) return arr[0];

        if(arr[i]!=x) return arr[i];
        return helper(arr,++i,x);
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            if(letters[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return letters[s % letters.length];
    }
}
