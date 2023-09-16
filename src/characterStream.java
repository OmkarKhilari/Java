public class characterStream {
    public static void main(String[] args) {
        String s = "OkOkOkokokkokok";
        char target = 'k';

//        skipApple("omkarAteapple");
//        System.out.println(skipApple("omkarAteapple"));
//        System.out.println(s);
//        System.out.println(skipAppNotApple("omkarmadeanappandateapple"));
    }

    static void skip(String p, String up, char target) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == target) skip(p,up.substring(1),target);
        else skip(p + ch, up.substring(1),target);
    }

    static String skip2(String up, char target) {
        if(up.isEmpty()) {
//            System.out.println(p);
            return "";
        }

        char ch = up.charAt(0);

        if(ch == target) {return skip2(up.substring(1),target);}
        else { return ch+skip2(up.substring(1),target);}
    }

    static String skipApple(String up) {
        if(up.isEmpty()) {
//            System.out.println(p);
            return "";
        }

        if(up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up) {
        if(up.isEmpty()) {
//            System.out.println(p);
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
