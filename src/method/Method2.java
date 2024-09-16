package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader(1);
        System.out.println("= 프로그램이 동작합니다. =");
        printFooter(1);
    }

    // 반환 타입이 없는 함수
    public static void printHeader(int a) {
        System.out.println("= " + a + "번 프로그램을 시작합니다 =");
        return;
    }

    // 반환 타입 void의 경우에는 return을 생략해도 됨. (알아서 마지막에 java가 삽입해 줌)
    // 반환 타입이 있다면 return은 필수
    public static void printFooter(int a) {
        System.out.println("= " + a + "번 프로그램을 종료합니다 =");
    }
}
