package method;

import java.util.Scanner;

public class MethodReturn1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        boolean rst = odd(i);
        System.out.println("숫자 " + i + "는 홀수인가? " + rst);
    }

    public static boolean odd(int i) {
        return (i % 2 == 0) ? false : true;
    }
}
