package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("두 숫자를 입력하세요. (0을 두 번 입력하면 종료됩니다.)");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            int rst = a + b;
            System.out.println("입력한 두 숫자의 합: " + rst);
        }

    }
}
