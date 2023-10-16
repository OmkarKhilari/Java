import java.util.HashMap;
import java.util.HashSet;

public class gfg_16_10_23 {
    public static void main(String[] args) {

    }

        public int largestIsland(int N, int[][] grid) {
            int maxSize = 0;
            int currentIsland = 2;

            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            HashMap<Integer, Integer> islandSizes = new HashMap<>();

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (grid[i][j] == 1) {
                        int size = markIsland(grid, i, j, currentIsland);
                        islandSizes.put(currentIsland, size);
                        maxSize = Math.max(maxSize, size);
                        currentIsland++;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (grid[i][j] == 0) {
                        HashSet<Integer> adjacentIslands = new HashSet<>();
                        int size = 1;

                        for (int k = 0; k < 4; k++) {
                            int x = i + dx[k];
                            int y = j + dy[k];

                            if (x >= 0 && x < N && y >= 0 && y < N) {
                                int adjacentIsland = grid[x][y];
                                if (adjacentIsland > 1) {
                                    adjacentIslands.add(adjacentIsland);
                                }
                            }
                        }

                        for (int island : adjacentIslands) {
                            size += islandSizes.get(island);
                        }

                        maxSize = Math.max(maxSize, size);
                    }
                }
            }

            return maxSize;
        }

        private int markIsland(int[][] grid, int i, int j, int island) {
            int N = grid.length;

            if (i < 0 || i >= N || j < 0 || j >= N || grid[i][j] != 1) {
                return 0;
            }

            grid[i][j] = island;
            int size = 1;

            size += markIsland(grid, i - 1, j, island);
            size += markIsland(grid, i + 1, j, island);
            size += markIsland(grid, i, j - 1, island);
            size += markIsland(grid, i, j + 1, island);

            return size;
        }

}
