package array;

public class ArrayDi0 {

    public static void main(String[] args) {
        // 2 * 3 2차원 배열 만들기
        int[][] arr = new int[2][3]; // 행 = 2, 열 = 3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // 0행 출력
        System.out.print(arr[0][0] + " ");
        System.out.print(arr[0][1] + " ");
        System.out.print(arr[0][2] + " ");
        System.out.println();

        // 1행 출력
        System.out.print(arr[1][0] + " ");
        System.out.print(arr[1][1] + " ");
        System.out.print(arr[1][2] + " ");
        System.out.println();
    }
}
