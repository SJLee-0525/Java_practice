package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    // 사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int prompt = scanner.nextInt();
        int[] numbers = new int[prompt];

        System.out.println(prompt + "개의 정수를 입력하세요:");
        for (int i = 0; i < prompt; i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxVal, minVal;
        maxVal = minVal = numbers[0];

        for (int number : numbers) {
            if (maxVal < number) {
                maxVal = number;
            }
            if (minVal > number) {
                minVal = number;
            }
        }
        System.out.println("가장 작은 정수: " + minVal);
        System.out.println("가장 큰 정수: " + maxVal);
    }
}
