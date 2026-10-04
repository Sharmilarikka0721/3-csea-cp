import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();

                if (a[i][j] == 2)
                    q.add(new int[]{i, j});

                if (a[i][j] == 1)
                    fresh++;
            }
        }

        int time = 0;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();

            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();

                for (int d = 0; d < 4; d++) {
                    int r = cur[0] + dr[d];
                    int c = cur[1] + dc[d];

                    if (r >= 0 && r < n && c >= 0 && c < m
                            && a[r][c] == 1) {

                        a[r][c] = 2;
                        fresh--;
                        q.add(new int[]{r, c});
                    }
                }
            }

            time++;
        }

        if (fresh == 0)
            System.out.println(time);
        else
            System.out.println(-1);
    }
}
