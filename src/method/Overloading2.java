package method;

public class Overloading2 {
    // 매개변수의 타입이 다른 오버로딩
    public static void main(String[] args) {
        myMethod(1.2 , 1);  // 2번 함수 호출: 2.2
        myMethod(1, 1.5);   // 1번 함수 호출: 2.5
        myMethod(2, 2.5);   // 1번 함수 호출: 4.5
        myMethod(2.5, 0);   // 2번 함수 호출: 2.5
    }

    public static void myMethod(int a, double b) {
        System.out.println("1번 함수 호출: " + (a + b));
    }

    public static void myMethod(double a, int b) {
        System.out.println("2번 함수 호출: " + (a + b));
    }
}
