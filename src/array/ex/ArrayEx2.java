package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    // 사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력 순서대로 출력하자.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = 5;
        int[] arr = new int[N];

        System.out.println("5개의 정수를 입력하세요:");
        for (int now = 0; now < N; now++) {
            arr[now] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
