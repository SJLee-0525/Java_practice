package operator;

public class Comp1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true

        int c = 3;
        int d = 3;
        System.out.println(c == d); // true

        // 결과를 boolean 변수에 담을 수 있음
        boolean rst = c != d;
        System.out.println(rst);    // false

    }
}
