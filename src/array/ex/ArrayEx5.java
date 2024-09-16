package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    // 사용자에게 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자
    // 입력받을 숫자의 개수를 입력받아야 한다
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int prompt = scanner.nextInt();
        int total = 0;

        System.out.println(prompt + "개의 정수를 입력하세요:");
        for (int i = 0; i < prompt; i++) {
            total += scanner.nextInt();
        }

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + ((double) total / prompt));
    }
}
