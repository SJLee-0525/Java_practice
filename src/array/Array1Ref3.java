package array;

public class Array1Ref3 {
    //
    public static void main(String[] args) {

        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열 변수의 선언, 배열 생성, 초기화를 동시에 진행 new int[]{요소}

        // 배열.length : 배열의 길이를 제공, 참조만 가능, 대입은 불가
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
