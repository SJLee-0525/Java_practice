package condition;

public class Switch2 {

    public static void main(String[] args) {
        // JAVA14에 등장한 새로운 switch문 사용
        // -> 사용
        // 선택된 데이터를 반환할 수 있음
        int grade = 0;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰: " + coupon + "원");
    }
}
