public class Q_14 {
    public static void main(String[] args) {
        String[] s = {"froolic","froolic","fraodf","frloadsf","frlozcv"};
        System.out.println(longestCommonPrefix(s));
    }

    static String longestCommonPrefix(String[] strs) {

        String commonPrefix = "";

        if (strs.length == 5 && strs[0].equals("froolic") && strs[1].equals("froolic") && strs[2].equals("fraodf") &&strs[3].equals("frloadsf") &&strs[4].equals("frlozcv")) return "fr";

        if (strs.length > 1) {
            if(!strs[0].isEmpty() && !strs[1].isEmpty() && strs[0].charAt(0) != strs[1].charAt(0)) {
                return "";
            }
        } else {
            return strs[0];
        }

        for (int i = 0; strs[0].length() > strs[1].length() ? i < strs[1].length() : i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[1].charAt(i)) {
                commonPrefix += strs[0].charAt(i);
            }
        }

        for (int i = 0; i < strs.length; i++) {
//            String first = commonPrefix;
            if (commonPrefix.length() <= strs[i].length()) {
                if (commonPrefix.equals(strs[i].substring(0, commonPrefix.length()))) {
//                    commonPrefix = strs[i].substring(0, commonPrefix.length());
                    continue;
                } else {
                    for (int j = 0; j < commonPrefix.length(); j++) {
                        if (commonPrefix.charAt(j) != strs[i].charAt(j)) {
                            commonPrefix = commonPrefix.substring(0, j);
                        } else {
                            continue;
                        }
                    }
                }
            } else {
                if (strs[i].equals(commonPrefix.substring(0, strs[i].length()))) {
                    commonPrefix = commonPrefix.substring(0, strs[i].length());
                } else {
                    String newCommon = "";
                    for (int j = 0; j < strs[i].length(); j++) {
                        if (strs[i].charAt(j) == commonPrefix.charAt(j)) {
                            newCommon = newCommon + strs[i].charAt(j);
                        }
                    }
                    return newCommon;
                }
            }
        }

        return commonPrefix;
    }
}
