import java.util.*;

public class gfg_19_10_23 {
    public static void main(String[] args) {

    }
    class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,0));
        boolean[] vis = new boolean[V];
        Arrays.fill(vis,false);

        vis[0] = true;

        while(!q.isEmpty()){
            int n = q.peek().first;
            int k = q.peek().second;
            q.poll();

            if(n==X)return k;

            for(int i : adj.get(n)){
                if(!vis[i]){
                    q.add(new Pair(i,k+1));
                    vis[i] = true;
                }
            }
        }
        return -1;
    }
}
