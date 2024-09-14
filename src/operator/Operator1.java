package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 덧셈
        int plus = a + b;
        System.out.println("a + b = " + plus);

        // 뺄셈
        int min = a - b;
        System.out.println("a - b = " + min);

        // 곱셈
        int mul = a * b;
        System.out.println("a * b = " + mul);

        // 나눗셈 (몫) : 자바에서 같은 int형끼리 계산하면 결과도 같은 int형으로 나옴.
        // int는 정수형이기 때문에 소수점 이하를 포함할 수 없음. 나중에 형변환에서 다룰 것
        // 주의) 0으로 나눌 수 없음
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나눗셈 (나머지)
        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}
