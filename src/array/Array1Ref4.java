package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // new int[] 까지도 생략 가능함 (java가 추론함)
        // int[] students = new int[]{90, 80, 70, 60, 50}; // 실제로는 아래와 같이 동작함

        /*
        단 아래와 같이 라인을 나누면 new int[] 생략 못 함 (java가 int형 배열인 것을 인지하지 못 하기 때문)

        int[] students;
        students = {90, 80, 70, 60, 50};
         */

        // 배열.length : 배열의 길이를 제공, 참조만 가능, 대입은 불가
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
