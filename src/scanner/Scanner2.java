package scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("첫번째 숫자를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("입력한 두 수의 합: " + (a + b));
    }
}
