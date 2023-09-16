public class Q_50 {
    public static void main(String[] args) {

        String str = "";
//        binaryConvert(25);
        System.out.println(binaryConvert(25,str));
    }

//    static double myPow(double x, int n) {
//        if(n==0) {i
//            return 1;
//        }
//
////         double y = x*myPow(x,n-1);
//
//
//        if(n > 0) {
//            return x*myPow(x,n-1);
//        } else {
//            n = -1*n;
//            double y = x*myPow(x,n-1);
//            return 1/y;
//        }



//    }

    static String binaryConvert(int x,String str) {

//        String str="";

        if (x > 0) {
            return binaryConvert(x/2,str+(x%2));
        }

        return str;

    }
}
