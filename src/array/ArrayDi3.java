package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        int tarRow = 5;
        int tarCol = 3;

        int[][] arr = new int[tarRow][tarCol];

        int cnt = 1;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = cnt++;
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
