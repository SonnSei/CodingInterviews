package 机器人的运动范围;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Classname Solution
 * @Description BFS
 * @Date 2019/12/29 22:39
 * @Author SonnSei
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.movingCount(10, 1, 100));
    }


    static int[][] moves = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };

    public int movingCount(int threshold, int rows, int cols) {
        int count = 0;
        int[][] map = new int[rows][cols];
        int[][] visited = new int[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            if (!inArea(x, y, map)||visited[x][y] == 1) continue;
            visited[x][y] = 1;
            if (!check(x, y, threshold)) continue;
            count++;
            for (int[] move : moves) {
                queue.add(new int[]{cur[0] + move[0], cur[1] + move[1]});
            }
        }
        return count ;
    }

    private boolean check(int x, int y, int threshold) {
        int ret = 0;
        while (x != 0 || y != 0) {
            ret += x % 10;
            ret += y % 10;
            y = y / 10;
            x = x / 10;
        }
        return ret <= threshold;
    }

    boolean inArea(int x, int y, int[][] map) {
        if (x < 0 || x >= map.length) return false;
        if (y < 0 || y >= map[0].length) return false;
        return true;
    }
}
