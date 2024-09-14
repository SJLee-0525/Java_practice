package condition.Ex;

public class IfEx3 {

    public static void main(String[] args) {
        int itemPrice = 10000;
        int age = 9;
        int discount = 0;

        if (10000 <= itemPrice) {
            discount += 1000;
            System.out.println("10000원 이상 구매: 1000원 할인");
        }
        if (age <= 10) {
            discount += 1000;
            System.out.println("어린이: 1000원 할인");
        }

        System.out.println("할인 금액: " + discount + ", 지불 금액: " + (itemPrice - discount));
    }
}
