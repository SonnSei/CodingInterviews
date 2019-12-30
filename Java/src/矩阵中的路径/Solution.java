package 矩阵中的路径;

import java.util.Arrays;

/**
 * @Classname Solution
 * @Description TODO
 * @Date 2019/12/29 12:14
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        char[] matrix = "AAAAAAAAAAAA".toCharArray();
        char[] str = "AAAAAAAAAAAA".toCharArray();
        boolean ans = hasPath(matrix, 3, 4, str);
        System.out.println(ans);

    }

    static int[][] moves = {
            {0,-1},
            {0,1},
            {1,0},
            {-1,0}
    };
    static boolean ret;
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        ret = false;
        char[][] map = new char[rows][cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                map[index / cols][j] = matrix[index++];
            }
        }
        for(char[] row:map)
            System.out.println(Arrays.toString(row));
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(map, visited, i, j, str, 0);
            }
        }
        return ret;
    }

    private static void dfs(char[][] map, boolean[][] visited, int x, int y, char[] str, int index) {
        if(ret||visited[x][y])return;
        if (index == str.length-1 && map[x][y]==str[index]) {
            ret = true;
            return;
        }
        if (map[x][y] == str[index]) {
            visited[x][y] = true;
            for (int[] move : moves) {
                if (inArea(x + move[0], y + move[1], map) ) {
                    dfs(map, visited, x + move[0], y + move[1], str, index + 1);
                }
            }
            visited[x][y] = false;
        }
    }

    private static boolean inArea(int x, int y, char[][] map) {
        if(x<0||x>=map.length)return false;
        if(y<0|| y>=map[0].length) return false;
        return true;
    }
}
