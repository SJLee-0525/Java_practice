package method;

import java.util.Scanner;

public class Method1Ref {
    // 간결하지 못한 [Method1]의 코드를 함수를 사용해서 수정하자
    // java에서는 함수를 매서드라고 부름. 매서드도 함수의 한 종류라고 보면 됨
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int cnt = 1; cnt <= 2; cnt++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int rst = add(x, y);
            System.out.println("연산 " + cnt + ": " + x + " + " + y + " = " + (x + y));
        }
    }

    // add 매서드 만들기
    // 매서드 이름, 반환 타입, 매개변수 목록을 포함
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        return (a + b);
    }

    /*
    제어자: public, static과 같은 부분
    public: 다른 클래스에서 호출할 수 있는 매서드라는 뜻
    static: 객체를 생성하지 않고 호출할 수 있는 정적 매서드라는 뜻

    반환 타입: 만약 반환하는 값이 없는 메서드의 경우 void를 사용
    int: 반환 타입을 정의 -> 실행 결과를 사용할 반환 타입 지정
    add: 매서드 이름 -> 이 이름으로 호출할 수 있음
    (int a, int b): 입력한 인자(인수)를 전달받아 입력 값 정의, 해당 매서드 안에서만 사용되는 변수이며, 파라미터, 매개변수라 함
     */
}
