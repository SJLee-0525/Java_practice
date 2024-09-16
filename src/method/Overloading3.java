package method;

public class Overloading3 {
    // 본인의 타입에 최대한 맞는 매서드를 찾아서 실행한 후
    // 없다면, 형 변환 가능한 타입의 매서드를 찾아서 실행함
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));      // 1번 호출 / 1: 3
                                                          // 만약 첫번째 add 매서드가 없다면: 자동 형변환 발생 후 2번 매서드 호출
                                                          // 2번 호출 / 1: 3.0

        System.out.println("2: " + add(1.2, 1.5));  // 2번 호출 / 2: 2.7
    }
    // 첫 번째 add 메서드: 두 정수를 받아서 합을 반환한다.
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }
    // 두 번째 add 메서드: 두 실수를 받아서 합을 반환한다.
    // 첫 번째 메서드와 이름은 같지만, 매개변수의 유형이 다르다.
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
