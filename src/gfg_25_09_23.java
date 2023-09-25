import java.util.*;

public class gfg_25_09_23 {
    public static void main(String[] args) {
       int N = 20;
        int K = 8;
        int[]  A = {1, 4, 2, 3,4,6,3,5,7,1,2,2,3,1,4,1,1,5,6,2};
        int[]  B = {2, 5, 1, 6,5,6,8,2,5,8,11,6,2,5,1,5,2,1,5,3};

        System.out.println(maxCombinations(N,K,A,B));
    }

    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> result = new ArrayList<>();

        Arrays.sort(A);
        Arrays.sort(B);

        PriorityQueue<PairSum> sums
                = new PriorityQueue<PairSum>();

        HashSet<Pair> pairs = new HashSet<Pair>();

        int l = N - 1;
        int m = N - 1;
        pairs.add(new Pair(l, m));
        sums.add(new PairSum(A[l] + B[m], l, m));

        for (int i = 0; i < K; i++)
        {
            PairSum max = sums.poll();
            result.add(max.sum);
            l = max.l - 1;
            m = max.m;

            if (l >= 0 && m >= 0
                    && !pairs.contains(new Pair(l, m)))
            {
                // insert (A[l]+B[m], (l, m))
                // in the heap
                sums.add(new PairSum(A[l]
                        + B[m], l, m));
                pairs.add(new Pair(l, m));
            }

            l = max.l;
            m = max.m - 1;


            if (l >= 0 && m >= 0
                    && !pairs.contains(new Pair(l, m)))
            {
                sums.add(new PairSum(A[l]
                        + B[m], l, m));
                pairs.add(new Pair(l, m));
            }
        }
        return result;
    }

    public static class Pair {

        public Pair(int l, int m)
        {
            this.l = l;
            this.m = m;
        }

        int l;
        int m;

        @Override public boolean equals(Object o)
        {
            if (o == null) {
                return false;
            }
            if (!(o instanceof Pair)) {
                return false;
            }
            Pair obj = (Pair)o;
            return (l == obj.l && m == obj.m);
        }

        @Override public int hashCode()
        {
            return Objects.hash(l, m);
        }
    }


    public static class PairSum
            implements Comparable<PairSum> {

        public PairSum(int sum, int l, int m)
        {
            this.sum = sum;
            this.l = l;
            this.m = m;
        }

        int sum;
        int l;
        int m;

        @Override public int compareTo(PairSum o)
        {
            return Integer.compare(o.sum, sum);
        }
    }
}
