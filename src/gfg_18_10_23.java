import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gfg_18_10_23 {
    public static void main(String[] args) {

    }
    public List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        List<Integer> safeNodes = new ArrayList<>();
        int[] state = new int[V]; // 0: unvisited, 1: visiting, 2: visited

        for (int i = 0; i < V; i++) {
            if (isSafe(i, adj, state)) {
                safeNodes.add(i);
            }
        }

        Collections.sort(safeNodes);
        return safeNodes;
    }

    private boolean isSafe(int node, List<List<Integer>> adj, int[] state) {
        if (state[node] == 2) {
            return true; // Node is already visited and confirmed safe.
        }
        if (state[node] == 1) {
            return false; // Node is currently being visited, indicating a cycle.
        }

        state[node] = 1; // Mark the node as visiting.

        for (int neighbor : adj.get(node)) {
            if (!isSafe(neighbor, adj, state)) {
                return false; // If any neighbor is not safe, this node is not safe.
            }
        }

        state[node] = 2; // Mark the node as visited and safe.
        return true;
    }
}
