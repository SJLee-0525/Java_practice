package loop;

public class For3 {
    // for문에서 초기식, 조건식, 증감식은 선택이다. 다음과 같이 모두 생략해도 된다.
    // 단 생략해도 각 영역을 구분하는 세미 콜론(;)은 유지해야 함
    // for (; ; ) == while (true)
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
        }
    }
}
