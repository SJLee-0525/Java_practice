package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("처음 입력한 " + a +"이(가) 더 큽니다.");
        } else if (a < b) {
            System.out.println("두번째에 입력한 " + b + "이(가) 더 큽니다.");
        } else {
            System.out.println("두 숫자 " + a + "와 " + b +"는 같습니다.");
        }
    }
}
