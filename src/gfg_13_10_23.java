public class gfg_13_10_23 {
    public static void main(String[] args) {

    }

    public static int floor(gfg_11_10_23.Node root, int x) {
        int floorValue = -1;

        while (root != null) {
            if (root.data == x) {
                return x;
            } else if (root.data > x) {
                root = root.left;
            } else {
                floorValue = root.data;
                root = root.right;
            }
        }

        return floorValue;
    }
}
