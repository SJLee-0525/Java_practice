package method;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(12);
    }

    // ruturn을 만나면 그 즉시 매서드를 탈출함
    public static void checkAge (int age) {
        if (age < 18) {
            System.out.println(age + "세 미성년자는 출입이 불가능합니다");
            return;
        }
        System.out.println(age + "세, 입장하세요.");
    }
}
