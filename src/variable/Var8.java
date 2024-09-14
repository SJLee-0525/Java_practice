package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127 (2^8)
        short s = 32767; // -32,768 ~ 32,767 (2^16)
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억) (2^32) << 기본
        long l = 9223372036854775807L; // (2^64), L을 붙여야 함. 소문자도 가능하되 권장하지 않음

        // 실수
        float f = 10.0f; // float은 뒤에 f를 적어줘야 함 (4byte, 2^32), 7자리 정밀도
        double d = 10.1; // double이 float보다 더 넓은 범위를 표현 가능함 (8byte, 2^64) 15자리 정밀도 << 기본

        // 기타
        boolean bl = false; // (1byte)
        char c = 'A'; // 문자열 하나 << String 쓰자
        String str = "Hello"; // 문자열 << String으로도 문자열 하나 표현 가능
        String stra = "A";

        System.out.println("정수형");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println("실수형");
        System.out.println(f);
        System.out.println(d);

        System.out.println("기타");
        System.out.println(bl);
        System.out.println(c);
        System.out.println(str);
        System.out.println(stra);
    }
}
