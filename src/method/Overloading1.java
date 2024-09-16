package method;

public class Overloading1 {
    // 매개변수 개수가 다른 오버로딩
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));          // 1번 함수 호출
        System.out.println("2: " + add(1, 2, 3));    // 2번 함수 호출
        System.out.println("3: " + add(5, 2, 1));    // 2번 함수 호출
        System.out.println("4: " + add(5, 10));         // 1번 함수 호출
    }

    public static int add(int a, int b) {
        System.out.println("1번 함수 호출");
        return (a + b);
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 함수 호출");
        return (a + b + c);
    }
}

    /*
    java에서는 매서드를 구분할 때, 매서드 이름 뿐만 아니라 매개변수 정보까지 함께 사용해서 구분함
    따라서 매서드 이름이 같더라도 매개변수 타입의 구성이 다르다면 (순서, 타입) 다른 함수로 취급 가능하고 이럴 경우 오버로딩에 성공했다고 함
    하지만 반환 타입이 다르더라도 매서드 이름과 매개 변수 타입 구성이 같다면 오버로딩을 할 수 없으니 주의하자.
     */

    /*
    1번 함수 호출
    1: 3
    2번 함수 호출
    2: 6
    2번 함수 호출
    3: 8
    1번 함수 호출
    4: 15
     */