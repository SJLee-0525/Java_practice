package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int cnt = 1;

        while (true) {
            sum += cnt;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: sum = " + sum + " cnt = " + cnt);
                break;
            }
            cnt += 1;
        }
    }
}
