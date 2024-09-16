package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    // 사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};

        int[][] scoreBoard = new int[4][3];

        for (int studentNum = 0; studentNum < 4; studentNum++) {
            System.out.println((studentNum + 1) + "번 학생의 성적을 입력하세요:");
            for (int sub = 0; sub < 3; sub++) {
                System.out.print(subjects[sub] + " 점수:");
                scoreBoard[studentNum][sub] = scanner.nextInt();
            }
        }

        for (int rstNum = 0; rstNum < 4; rstNum++) {
            int total = 0;
            for (int subject = 0; subject < 3; subject++) {
                total += scoreBoard[rstNum][subject];
            }
            System.out.println((rstNum + 1) + "번 학생의 총점: " + total + ", 평균: " + ((double) total / 3));
        }
    }
}
