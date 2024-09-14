package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    // 입력 받기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine();
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요:");
        int intVal = scanner.nextInt();
        System.out.println("입력한 정수: " + intVal);

        System.out.print("실수를 입력하세요:");
        double doubleVal = scanner.nextDouble();
        System.out.println("입력한 실수: " + doubleVal);
    }
}
