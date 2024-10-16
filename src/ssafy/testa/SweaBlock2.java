// package ssafy.testa;

// 메모리 줄이는 거 포기..

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SweaBlock2 {

    private static int N, W, H, result;  // 쏘는 횟수

    private static int[] di = {1, 0, -1, 0};
    private static int[] dj = {0, 1, 0, -1};

    private static int[][] block;

    private static Deque<int[]> stack = new LinkedList<>();

    private static void mainDef(int lv) {
        if (lv == N) {
            countBlock();
            return;
        }

        int[][] copyBlock = new int[H][W];
        for (int ci = 0; ci < H; ci++) {
            for (int cj = 0; cj < W; cj++) {
                copyBlock[ci][cj] = block[ci][cj];
            }
        }

        int c = 0;

        for (int j = 0; j < W; j++) {
            row: for (int i = 0; i < H; i++) {
                if (block[i][j] > 0) {
                    c++;

                    bomb(i, j);
                    mainDef(lv + 1);

                    for (int ci = 0; ci < H; ci++) {
                        for (int cj = 0; cj < W; cj++) {
                            block[ci][cj] = copyBlock[ci][cj];
                        }
                    }

                    break row;
                }
            }
        }
        if (c == 0) mainDef(N);
    }

    private static void bomb(int si, int sj) {
        // 어차피 스택이 다 비어야 탈출하니까, 함수마다 스택을 만들지 말고 재사용해보자
        stack.push(new int[]{si, sj});

        while (!stack.isEmpty()) {
            int[] now = stack.pop();
            int i = now[0];
            int j = now[1];
            int val = block[i][j];

            if (val > 1) {
                for (int k = 0; k < 4; k++) {
                    for (int v = 1; v < val; v++) {
                        int mi = i + (di[k] * v);
                        int mj = j + (dj[k] * v);
                        if (0 <= mi && mi < H && 0 <= mj && mj < W) {
                            stack.push(new int[]{mi, mj});
                        }
                    }
                }
            }
            block[i][j] = 0;
        }
        getDownBlock();
    }

    private static void getDownBlock() {
        // 굳이 벽돌 내릴 때 새 배열 만들어서 값을 채울 필요 없음
        // 기존 벽돌 지도를 아래에서부터 타고 올라가면서 채워나가면 됨.
        for (int j = 0; j < W; j++) {
            int emptyRow = H - 1; // 아래에서부터 채울 위치 변수 할당
            for (int i = emptyRow; i >= 0; i--) {
                if (block[i][j] > 0) block[emptyRow--][j] = block[i][j];
            }
            // 값이 있는 것들을 아래에서부터 다 채웠다면 나머지는 빈 공간으로 변환
            while (emptyRow >= 0) {
                block[emptyRow--][j] = 0;
            }
        }
    }

    private static void countBlock() {
        int cnt = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (block[i][j] > 0) cnt++;
            }
        }

        if (result > cnt) result = cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());

            block = new int[H][W];

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    block[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            result = 1001;
            mainDef(0);

            sb.append('#').append(tc).append(' ').append(result).append('\n');
            bw.write(sb.toString());
            bw.flush();
            sb.setLength(0);
        }

        br.close();
        bw.close();
    }
}