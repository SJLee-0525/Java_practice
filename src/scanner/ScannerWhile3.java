package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("숫자를 입력하세요. 0을 입력하면 종료됩니다.");
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num;
            System.out.println("현재까지 입력한 수의 총합: " + sum);
        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
