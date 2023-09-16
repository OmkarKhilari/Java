import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
//        subSeqAL("", "Omkar", new ArrayList<>());
        System.out.println(subSeqALInside("", "Omkar"));
    }

    static void subSeq(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }


        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }

    static ArrayList<String> subSeqAL(String p, String up, ArrayList<String> list) {
        if(up.isEmpty()) {
//            System.out.println(p);
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));

        return list;
    }

    // without using arraylist in arguments
    static ArrayList<String> subSeqALInside(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqALInside(p,up.substring(1));
        ArrayList<String> right = subSeqALInside(p + ch,up.substring(1));

//        left.addAll(right);
//        return left;
        right.addAll(left);
        return right;
    }

}
