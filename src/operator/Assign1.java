package operator;

public class Assign1 {
    // 대입 연산자
    public static void main(String[] args) {
        int a = 5;
        a += 3;                         // a = 5 + 3
        System.out.println("a += 3 = " + a); // a += 3 = 8
        
        a -= 2;                         // a = 8 - 2
        System.out.println("a -= 2 = " + a); // a -= 2 = 6

        a *= 4;                         // a = 6 * 4
        System.out.println("a *= 4 = " + a); // a *= 4 = 24

        a /= 3;                         // a = 24 / 3
        System.out.println("a /= 3 = " + a); // a /= 3 = 8

        a %= 5;                         // a = 8 % 5
        System.out.println("a %= 5 = " + a); // a %= 5 = 3
    }
}
