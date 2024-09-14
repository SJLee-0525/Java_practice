package operator;

import java.sql.SQLOutput;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true);   // true
        System.out.println(true && false);  // false
        System.out.println(false && true);  // false
        System.out.println(false && false); // false

        System.out.println("||: OR 연산");
        System.out.println(true || true);   // true
        System.out.println(true || false);  // true
        System.out.println(false || true);  // true
        System.out.println(false || false); // false

        System.out.println("!: NOT 연산");
        System.out.println(!true);
        System.out.println(!false);

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);  //false
        System.out.println(a || b);  // true
        System.out.println(!a);      // false
        System.out.println(!b);      // true
        System.out.println(a && !b); // true
        System.out.println(!a || b); // false
    }
}
