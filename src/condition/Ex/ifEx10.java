package condition.Ex;

public class ifEx10 {
    // 홀수 짝수 찾기 (삼항 연산자 찾기)
    public static void main(String[] args) {
        int x = 7;

        String rst = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + ", " + rst);
    }
}
