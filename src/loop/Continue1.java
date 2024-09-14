package loop;

public class Continue1 {
    // 1부터 5까지의 숫자를 출력하는데, 숫자가 3일 때는 출력을 건너뛰어라
    public static void main(String[] args) {
        int num = 0;

        while (num < 5) {
            num++;
            if (num == 3) {
                continue;
            }
            System.out.println(num);
        }
    }
}
