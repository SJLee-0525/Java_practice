package ssafy.testa;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SweaChef {

    private static int N;
    private static int result;

    private static int[] used;
    private static int[][] scoreBoard;

    private static ArrayList<Integer> groupA;
    private static ArrayList<Integer> groupB;

    private static void combi(int lv, int cnt) {
        if (lv == N) {
            if (cnt == N / 2) {
                groupA = new ArrayList<>();
                groupB = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    if (used[i] == 1) {
                        groupA.add(i);
                    } else {
                        groupB.add(i);
                    }
                }
                int resA = calScore(groupA);
                int resB = calScore(groupB);
                int temp = Math.abs(resA - resB);
                if (result > temp) {
                    result = temp;
                }
            }
            return;
        }
        if (cnt > N / 2) {
            return;
        }
        used[lv] = 1;
        combi(lv + 1, cnt + 1);
        used[lv] = 0;
        combi(lv + 1, cnt);
    }

    private static int calScore(ArrayList<Integer> inputGroup) {
        int temp = 0;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N / 2; j++) {
                temp += scoreBoard[inputGroup.get(i)][inputGroup.get(j)];
//                temp += scoreBoard[inputGroup.get(j)][inputGroup.get(i)];
            }
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            N = Integer.parseInt(br.readLine());

            scoreBoard = new int[N][N];
            used = new int[N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    scoreBoard[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            result = 10000001;
            combi(0, 0);

            StringBuilder sb = new StringBuilder();
            sb.append('#').append(tc).append(' ').append(result).append('\n');
            bw.write(sb.toString());
            bw.flush();
            sb.setLength(0);
        }
        br.close();
        bw.close();
    }
}
