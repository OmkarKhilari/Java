import java.util.ArrayList;

public class Q_1926 {
    public static void main(String[] args) {
        int[] entrance = {2,0};
        char[][] maze = {
                {'+','+','+','+'},
                {'+','.','.','.'},
                {'.','.','.','.'},
                {'+','.','.','+'}
        };
        maze[entrance[0]][entrance[1]] = '+';
        shortestPath(maze,entrance[0],entrance[1],1,false,entrance);
    }

    static void shortestPath(char[][] maze, int r, int c,int count, boolean check,int[] entrance) {
        // Base Condition
        if (r != entrance[0] && c != entrance[1] && (r == 0 || c == 0 || r == maze.length - 1 || c == maze[0].length - 1)) {
            System.out.println(count);
            System.out.println();
            return;
        }

        if (maze[r][c] == '+' || (r == entrance[0] && c == entrance[1])) {
            return;
        }

        maze[r][c] = '+';
//        count = 0;
        // Up
        if (r > 0) {
            shortestPath(maze, r - 1, c,count+1,true,entrance);
//            count++;
        }

        // Down
        if (r < maze.length - 1) {
            shortestPath(maze, r + 1, c,count+1,true,entrance);
//            count++;
        }

        // Left
        if (c > 0) {
            shortestPath(maze, r, c - 1,count+1,true,entrance);
//            count++;
        }

        // Down
        if (c < maze[0].length - 1) {
            shortestPath(maze, r, c + 1,count+1,true,entrance);
//            count++;
        }

        maze[r][c] = '.';
//        ArrayList<Character> list = new ArrayList<>();
//        list.s

    }

}
