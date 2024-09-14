package condition.Ex;

public class ifEx2 {

    public static void main(String[] args) {
        int age = 20;

        // 서로 연관된 조건이면 / else if와 else를 사용해 하나로 묶을 수 있음
        if (age <= 7) {
            System.out.println("미취학");
        } else if (age <= 13) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
