package LeetCode_207;

public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] G = new int[numCourses][numCourses];
        for (int[] iter : prerequisites) {
            G[iter[1]][iter[0]] = 1;
        }

        int[] visited = new int[numCourses];
        for (int u = 0; u < numCourses; u++) {
            if (visited[u] == 0) {
                if (dfs(G, visited, u) == false)
                    return false;
            }
        }

        return true;
    }

    public boolean dfs(int[][] G, int[] visited, int u) {
        visited[u] = -1; //表示当前正在访问
        for (int v = 0; v < visited.length; v++) {
            if (G[u][v] == 1) {   //u->v存在边
                if (visited[v] < 0) {  //存在有向环，失败退出
                    return false;
                } else if (visited[v] == 0 && dfs(G, visited, v) == false) {
                    return false;
                }
            }
        }
        visited[u] = 1;
        return true;
    }
}