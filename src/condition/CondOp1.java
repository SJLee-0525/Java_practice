package condition;

public class CondOp1 {
    // 삼항 연산자
    public static void main(String[] args) {
        // 아래 예제는 참과 거짓에 따라 status 변수 값이 달라짐
        // 이처럼 단순히 참과 거짓에 따라 특정 값이 정해지는 경우: 삼항 연산자 or 조건 연산자를 사용 가능함
        // ?:
        /*
        int age = 18;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + ", status = " + status);
        */

        // 삼항 연산자 사용
        // (조건), ?_참 표현식, :_거짓 표현식 <- 항이 3개
        // ? <- 조건이 참이면 | : <- 조건이 거짓이면
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + ", status = " + status);
    }
}
