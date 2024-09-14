package condition;

public class Switch1 {

    public static void main(String[] args) {
        // if문 사용
        // if문은 [참 / 거짓]의 결과가 나오는 조건식을 자유롭게 적을 수 있음
        /*
        int grade = 2;
        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("발급받은 쿠폰: " + coupon + "원");
        */

        // switch문 사용
        // 단순한 if문과 같음: 하지만 값이 같은 경우에만 사용 가능함 (특정 case와 같은지만 체크할 수 있음)
        // case -> if / else if | default -> else
        // break가 없으면 다음 case를 그대로 수행하게 되니까 까먹지 말 것
        int grade = 3;
        int coupon;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰: " + coupon + "원");
    }
}
