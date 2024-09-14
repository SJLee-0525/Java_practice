package condition.Ex;

public class ifEx4 {
    // 학점 계산하기
    public static void main(String[] args) {
        int score = 95;

        char rst;
        if (score >= 90) {
            rst = 'A';
        } else if (score >= 80) {
            rst = 'B';
        } else if (score >= 70) {
            rst = 'C';
        } else if (score >= 60) {
            rst = 'D';
        } else {
            rst = 'F';
        }
        System.out.println("학점은 " + rst + "입니다.");
    }
}
