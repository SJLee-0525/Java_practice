package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";
        int[] iterCounts = {3, 5, 7};

        for (int counts : iterCounts) {
            iterString(counts, message);
        }
    }

    public static void iterString(int N, String inputMessage) {
        for (int i = 0; i < N; i++) {
            System.out.println(inputMessage);
        }
    }
}
