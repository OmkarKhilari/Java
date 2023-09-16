import java.util.ArrayList;
import java.util.Arrays;

public class MazeCount {
    public static void main(String[] args) {
//        path("", 3,3);
//        System.out.println(pathRetDiagon("", 3,3));
//        pathObstacle("",board, 0,0);
        boolean[][] board = {
                {false,false,false},
                {true,true,true},
                {false,false,false}
        };

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("",board,1,0,path,1);

    }

    static int noOfWays(int row, int col) {

        // Base Condition
        if(row == 1 || col == 1) return 1;

        // From the recursion tree
        int left = noOfWays(row-1,col);
        int right = noOfWays(row, col-1);

//        System.out.println(path);
        // Total ways
        return left + right;
    }

    static void path(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1) {
            path(p+"D",row-1,col);
        }

        if (col > 1) {
            path(p+"R",row,col-1);
        }
    }

    static ArrayList<String> pathRet(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(pathRet(p+"D",row-1,col));
        }

        if (col > 1) {
            list.addAll(pathRet(p+"R",row,col-1));
        }

        return list;
    }

    static ArrayList<String> pathRetDiagon(String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1) {
            list.addAll(pathRetDiagon(p+"D",row-1,col));
        }

        if (col > 1) {
            list.addAll(pathRetDiagon(p+"R",row,col-1));
        }

        if(row > 1 && col>1) {
            list.addAll(pathRetDiagon(p+"d", row-1,col-1));
        }

        return list;
    }

    static ArrayList<String> pathRetObstacle(String p,boolean[][] maze, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length -1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

//        if(!maze[row][col]) {
//
//        }

        if (row > 1) {
            list.addAll(pathRetDiagon(p+"D",row+1,col));
        }

        if (col > 1) {
            list.addAll(pathRetDiagon(p+"R",row,col+1));
        }

        if(row > 1 && col>1) {
            list.addAll(pathRetDiagon(p+"d", row+1,col+1));
        }

//        if(!maze[row][col]) {
//            list.remove();
//        }
        return list;
    }

    static void pathObstacle(String p,boolean[][] maze, int row, int col) {
        if (row == maze.length-1 && col == maze[0].length -1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) return;

        if (row < maze.length-1) {
            pathObstacle(p+"D",maze,row+1,col);
        }

        if (col < maze[0].length) {
            pathObstacle(p+"R",maze,row,col+1);
        }
    }

    static void allPathPrint(String p,boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length-1 && col == maze[0].length -1) {

            path[row][col] = step;
            for(int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[row][col]) return;

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length-1) {
            allPathPrint(p+"D",maze,row+1,col,path,step+1);
        }

        if (col < maze[0].length-1) {
            allPathPrint(p+"R",maze,row,col+1,path,step+1);
        }

        if (row > 0) {
            allPathPrint(p+"U",maze,row-1,col,path,step+1);
        }

        if (col > 0) {
            allPathPrint(p+"L",maze,row,col-1,path,step+1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
