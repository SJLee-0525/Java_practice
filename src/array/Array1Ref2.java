package array;

public class Array1Ref2 {
    // 리팩토링 (Refactoring) : 코드의 기능은 유지하면서 내부 구조를 개선해 가독성을 높이고 유지보수를 용이하게 하는 과정
    public static void main(String[] args) {
        int student_cnt = 5;
        int[] students;
        students = new int[student_cnt];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        for (int i = 0; i < student_cnt; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
