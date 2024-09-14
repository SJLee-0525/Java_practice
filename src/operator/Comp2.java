package operator;

public class Comp2 {

    public static void main(String[] args) {
        // 문자열 비교는 == 사용하는 게 아니라, .equals() 매서드를 사용해야 함
        // == 를 사용하면 성공할 때도 있지만, 실패할 때도 있음
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean rst1 = "hello".equals("hello");   // literal 비교
        System.out.println(rst1);                 // true

        boolean rst2 = str1.equals("문자열1");     // 문자열 변수와 literal 비교
        System.out.println(rst2);                 // true

        boolean rst3 = str1.equals(str2);         // 문자열 변수 비교
        System.out.println(rst3);                 // false

        // 아래와 같이 ==로 비교해도 결과는 나옴. 하지만 안 되는 조건이 있기에 문자열 비교에 사용하지 말자
        System.out.println("Hello" == "Hello");   // true
    }
}
