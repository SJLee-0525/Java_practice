package loop;

public class While2_1 {
    // 1부터 하나씩 증가하는 수를 3번 더하라
    public static void main(String[] args) {
        int sum = 0;
        int target = 0;
        int cnt = 0;
        int targetCnt = 100;

        while (cnt < targetCnt) {
            cnt++;
            target++;
            sum += target;
            System.out.println("target = " + target + " sum = " + sum);
        }
    }
}
