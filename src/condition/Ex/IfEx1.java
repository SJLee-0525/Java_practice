package condition.Ex;

public class IfEx1 {
    public static void main(String[] args) {
        int age = 20;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (8 <= age && age <= 13) {
            System.out.println("초등학생");
        }
        if (14 <= age && age <= 16) {
            System.out.println("중학생");
        }
        if (17 <= age && age <= 19) {
            System.out.println("고등학생");
        }
        if (20 <= age) {
            System.out.println("성인");
        }
        // 위 코드에서는 문제가 있음
        // 조건을 만족하더라도 뒤의 조건문을 전부 검사하고
        // 조건에 중복 조건들이 계속 존재함
    }
}
