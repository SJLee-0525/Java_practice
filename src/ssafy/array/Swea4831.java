package ssafy.array;

import java.util.Scanner;
import java.util.Arrays;

public class Swea4831 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int K = scanner.nextInt();    // 한 번 충전으로 갈 수 있는 정류장 수
            int N = scanner.nextInt();    // 종점
            int M = scanner.nextInt();    // 충전기가 설치된 정류장 수

            int[] roadMap = new int[N + K + 1];
            roadMap[N] = N;
            for (int t = 0; t < M; t++) {
                int chargeStation = scanner.nextInt();
                roadMap[chargeStation] = chargeStation;
            }
//            System.out.println(Arrays.toString(roadMap)); // [0, 1, 0, 3, 0, 5, 0, 7, 0, 9, 10, 0, 0, 0]

            int now = 0;
            int chargeCnt = 0;
            int result;
            while (true) {
                int judge = 0;
                for (int i = now; i <= now + K; i++) {
                    if (judge < roadMap[i]) {
                        judge = roadMap[i];
                    }
                }
                if (judge == now) {
                    chargeCnt = 0;
                    break;
                } else if (judge == N) {
                    break;
                } else {
                    now = judge;
                    chargeCnt += 1;
                }
            }
            System.out.println("#" + tc + " " + chargeCnt);
        }
    }
}
