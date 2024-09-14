package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1 = "Hello " + "World";
        System.out.println(result1);

        // 문자열과 문자열 더하기 2
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + str2);

        // 문자열과 숫자 더하기
        String result2 = "a + b = " + 3; // int형 3이 String으로 형변환돼서 더해지는 것
        System.out.println(result2);

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str3 = "a + b = ";
        String result4 = str3 + num;
        System.out.println(result4);
        // 쉽게 이야기해서 문자열에 더하는 것은 다 문자열이 됨
    }
}
