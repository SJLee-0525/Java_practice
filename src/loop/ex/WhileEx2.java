package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 1;
        int cnt = 1;
        while (cnt <= 10) {
            if (num % 2 == 1) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
            cnt++;
        }

        int num2 = 2;
        for (int cnt2 = 1; cnt2 <= 10; cnt2++) {
            System.out.println(num2);
            num2 += 2;
        }
    }
}
