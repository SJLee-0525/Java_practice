package method;

public class MethodValue2 {
    // 변수 이름이 같다면
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, main num = " + num); // 5
        changeNumber(num);
        System.out.println("4. changeNumber 호출 후, main num = " + num); // 5
    }

    public static void changeNumber(int num) {
        System.out.println("2. changeNumber 변경 전, changeNumber num = " + num); // 5
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, changeNumber num = " + num); // 10
    }
}

    /*
    1. changeNumber 호출 전, main num = 5
    2. changeNumber 변경 전, changeNumber num = 5
    3. changeNumber 변경 후, changeNumber num = 10
    4. changeNumber 호출 후, main num = 5
     */

    /*
    main()도 사실 매서드
    각각의 매서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수: 이름이 같아도 다름
     */