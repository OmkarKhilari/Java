public class Q_264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(11));
    }

    static int nthUglyNumber(int n) {
        int[] UglyNum = new int[n];
//        UglyNum[0]=1;UglyNum[1]=2;UglyNum[2]=3;UglyNum[3]=4;UglyNum[4]=5;UglyNum[5]=6;

        int i = 0;
        int x = i;
        while(i < n) {
            x++;
            int numToAdd = x;
            while (x >= 1) {
                if(x%2 == 0) {
                    x = x/2;
                } else if (x%3 == 0) {
                    x = x/3;
                } else if (x%5 == 0) {
                    x = x/5;
                } else if (x == 1) {
                    UglyNum[i] = numToAdd;
                    x = UglyNum[i];
                    i++;
                    break;
                } else {
                    x = numToAdd;
                  break;
                }


            }
        }
        return UglyNum[n-1];
    }
}
