package loop;

public class Nested1 {
    // 중첩 반복문
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            System.out.println("외부 for 시작: i=" + i);
            for (int j = 0; j <= 2; j++) {
                System.out.println("-> i=" + i + ", j=" + j);
            }
            System.out.println(("외부 for 종료: i=" + i));
            System.out.println();
        }
    }
}
