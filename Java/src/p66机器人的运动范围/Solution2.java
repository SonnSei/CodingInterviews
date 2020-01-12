package p66机器人的运动范围;

/**
 * @Classname Solution2
 * @Description DFS
 * @Date 2019/12/29 23:10
 * @Author SonnSei
 */
public class Solution2 {


    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        Solution solution = new Solution();
        int t = 10,x =1,y =100;
        System.out.println(solution.movingCount(t,x,y));
        System.out.println(solution2.movingCount(t,x,y));
    }

    static int[][] moves = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };


    static int count = 0;
    public int movingCount(int threshold, int rows, int cols)
    {
        count = 0;
        int[][] map = new int[rows][cols];
        int[][] visited = new int[rows][cols];
        dfs(map, visited, 0, 0, threshold);
        return count;
    }

    private void dfs(int[][] map, int[][] visited, int x, int y, int threshold) {
        // 主要要先判断xy是否合法，否则下面的判断会越界
        if(!inArea(x,y,map))return;
        if(visited[x][y]==1)return;
        if(!check(x,y,threshold))return;

        visited[x][y] = 1;
        count++;
        for (int[] move : moves) {
            dfs(map,visited,x+move[0],y+move[1],threshold);
        }
    }


    boolean inArea(int x, int y, int[][] map) {
        if (x < 0 || x >= map.length) return false;
        if (y < 0 || y >= map[0].length) return false;
        return true;
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
}
