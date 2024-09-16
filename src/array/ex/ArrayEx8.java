package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    // 이전 문제 (ArrayEx7) 에서 학생 수를 입력받도록 개선하자
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요:");
        int studentNum = scanner.nextInt();
        int[][] scoreBoard = new int [studentNum][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int stNum = 0; stNum < studentNum; stNum++) {
            System.out.println((stNum + 1) + "번 학생의 성적을 입력하세요:");
            for (int sbNum = 0; sbNum < 3; sbNum++) {
                System.out.print(subjects[sbNum] + " 점수:");
                scoreBoard[stNum][sbNum] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentNum; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scoreBoard[i][j];
            }
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + (total / 3.0));
        }
    }
}
