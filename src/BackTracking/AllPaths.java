package BackTracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        printPaths(maze, 0, 0, "", path, 1);
    }

    static void printPaths(boolean[][] maze, int r, int c, String p, int[][] path, int steps) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            for(int[] a: path) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = steps;

        if(r < maze.length - 1) {
            printPaths(maze,r + 1, c, p + "D", path, steps + 1);
        }

        if(c < maze[0].length - 1) {
            printPaths(maze, r, c + 1, p + "R", path, steps + 1);
        }

        if(r > 0) {
            printPaths(maze, r - 1, c, p + "U", path, steps + 1);
        }

        if(c > 0) {
            printPaths(maze, r, c - 1, p + "L", path, steps + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }

    static void allPaths(boolean[][] maze, int r, int c, String p) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if(r < maze.length - 1) {
            allPaths(maze, r + 1, c, p + "D");
        }

        if(c < maze[0].length - 1) {
            allPaths(maze, r, c + 1, p + "R");
        }

        if(r > 0) {
            allPaths(maze, r - 1, c, p + "U");
        }

        if(c > 0) {
            allPaths(maze, r, c - 1, p + "L");
        }

        maze[r][c] = true;
    }
}
