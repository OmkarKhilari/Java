public class gfg_17_10_23 {
    public static void main(String[] args) {

    }


//    Solution in C++

//    class Solution{
//        public:
//        vector<vector<int>> transitiveClosure(int N, vector<vector<int>> graph) {
//            vector<vector<int>> reach(N, vector<int>(N));
//
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    if (i == j) {
//                        reach[i][j] = 1;
//                    } else if (graph[i][j] == 1) {
//                        reach[i][j] = 1;
//                    }
//                }
//            }
//
//            for (int k = 0; k < N; k++) {
//                for (int i = 0; i < N; i++) {
//                    for (int j = 0; j < N; j++) {
//                        reach[i][j] = reach[i][j] || (reach[i][k] && reach[k][j]);
//                    }
//                }
//            }
//
//            return reach;
//        }
//    };
}
