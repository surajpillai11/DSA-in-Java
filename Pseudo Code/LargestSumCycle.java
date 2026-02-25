import java.util.*;

public class LargestSumCycle {

    static int[] edges;
    static boolean[] visited, path;
    static long maxSum = -1;

    static void dfs(int node) {
        visited[node] = true;
        path[node] = true;

        int next = edges[node];

        // if there is an outgoing edge
        if (next != -1) {

            // go to next node if not visited
            if (!visited[next]) {
                dfs(next);
            }

            // cycle found
            else if (path[next]) {
                long sum = 0;
                int cur = next;

                while (true) {
                    sum += cur;
                    cur = edges[cur];
                    if (cur == next) break;
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        // remove from current path
        path[node] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        edges = new int[N];

        for (int i = 0; i < N; i++) {
            edges[i] = sc.nextInt();
        }

        visited = new boolean[N];
        path = new boolean[N];

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }

        System.out.println(maxSum);
    }
}
