package baekjoon;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.ArrayList;

public class baekjoon16236 {

    private static int N, babyShark;

    private static int[] di = {-1, 0, 1, 0};
    private static int[] dj = {0, -1, 0, 1};

    private static int[][] space, visited;

    private static ArrayList<int[]> possible = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        space = new int[N][N];
        int[] babySharkLocation = new int[2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                space[i][j] = Integer.parseInt(st.nextToken());
                if (space[i][j] == 9) {
                    babySharkLocation[0] = i;
                    babySharkLocation[1] = j;
                }
            }
        }

        babyShark = 2;
        visited = new int[N][N];
        int time = 0;
        int i = babySharkLocation[0];
        int j = babySharkLocation[1];
        while (true) {
            bfs(i, j);
            if (possible.isEmpty()) {
                break;
            }

        }

    }

    private static void bfs(int si, int sj) {
        possible.clear();

        Deque<Integer> queue = new LinkedList<>();
        queue.offerLast(si);
        queue.offerLast(sj);

        visited[si][sj] = 1;

        int i, j, mi, mj;
        int minDistance = 0;
        while (!queue.isEmpty()) {
            i = queue.pollFirst();
            j = queue.pollFirst();

            for (int k = 0; k < 4; k++) {
                mi = i + di[k];
                mj = j + dj[k];
                if (0 <= mi && mi < N && 0 <= mj && mj < N &&
                0 <= space[mi][mj] && space[mi][mj] <= babyShark && visited[mi][mj] == 0) {
                    if (0 < space[mi][mj] && space[mi][mj] < babyShark) {
                        if (minDistance == 0) {
                            minDistance = visited[i][j];
                        }
                        possible.add(new int[] {visited[i][j], mi, mj});
                    }
                }
                visited[mi][mj] = visited[i][j] + 1;
                queue.offerLast(mi);
                queue.offerLast(mj);
            }


        }
    }

    private static void clearVisited() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                visited[i][j] = 0;
            }
        }
    }
}
