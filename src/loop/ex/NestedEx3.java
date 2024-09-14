package loop.ex;

public class NestedEx3 {

    public static void main(String[] args) {
        int rows = 15;
        for (int row = 1; row <= rows; row++) {
            for (int blank = rows - row; blank >= 0; blank -= 1) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row - 1) * 2 + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
