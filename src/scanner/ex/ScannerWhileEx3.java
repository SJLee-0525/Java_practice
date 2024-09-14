package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;
        int input;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            cnt++;
        }
        double average = (double) sum / cnt;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
