import java.util.*;

public class Main {

    static int V;
    static int[][] capacity;

    static int dfs(int u, int sink, int[] visited, int flow) {
        if (u == sink)
            return flow;

        visited[u] = 1;

        for (int v = 0; v < V; v++) {
            if (visited[v] == 0 && capacity[u][v] > 0) {

                int newFlow = Math.min(flow, capacity[u][v]);

                int result = dfs(v, sink, visited, newFlow);

                if (result > 0) {
                    capacity[u][v] -= result;
                    capacity[v][u] += result;
                    return result;
                }
            }
        }

        return 0;
    }

    static int fordFulkerson(int source, int sink) {
        int maxFlow = 0;
        int flow;

        while (true) {
            int[] visited = new int[V];

            flow = dfs(source, sink, visited, Integer.MAX_VALUE);

            if (flow == 0)
                break;

            maxFlow += flow;
        }

        return maxFlow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();
        int E = sc.nextInt();

        capacity = new int[V][V];

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();

            capacity[u][v] += c;
        }

        System.out.println(fordFulkerson(0, V - 1));

        sc.close();
    }
}
