package method;

import java.util.Scanner;

public class Method1 {
    // 아래의 코드는 같은 연산을 반복함. 코드도 거의 같음.
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " 연산 수행");
        System.out.println("연산 1: " + a + " + " + b + " = " + (a + b));

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x + " + " + y + " 연산 수행");
        System.out.println("연산 2: " + x + " + " + y + " = " + (x + y));
    }
}
