package method;

public class MethodValue0 {
    // 대원칙: java에서는 변수의 값을 항상 복사해서 대입함.
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        System.out.println("num1 = " + num1 + ", num2 = " + num2); // num1 = 5, num2 = 5

        num2 = 10;
        System.out.println("num1 = " + num1 + ", num2 = " + num2); // num1 = 5, num2 = 10

        /*
        num1 변수가 num2에 들어가는 것이 아님.
        num1에 들어있는 값을 읽고 복사해서 num2에 대입하는 것
         */
    }
}
