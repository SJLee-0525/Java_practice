package array;

public class Array2 {
    // 배열의 선언과 생성
    public static void main(String[] args) {
        int[] students;         // 배열 생성 (일반적인 타입 뒤에 [] 삽입) :
                                // 하지만 선언한다고 해서 아직 사용할 수 있는 배열이 만들어진 것은 아님
                                // int[] students와 같은 배열 변수에는 배열을 담을 수 있음 (10, 20과 같은 값이 아님)

        /*
        int[] students = new int[5]; //1. 배열 생성
        int[] students = x001; //2. new int[5]의 결과로 x001 참조 값 반환 <- 중요!
        students = x001 //3. 최종 결과
         */

        students = new int[5];  // int 그릇이 5개 있는 배열을 생성
                                // new는 새로 생성한다는 것, int[5]는 int형 변수 5개라는 뜻
                                // java는 배열을 생성할 때 내부 값을 자동으로 초기화함
                                // 숫자형은 0, boolean은 false, String은 null로 초기화

        /*
        배열을 생성하는 new int[5]에는 아무런 이름이 없고, 그저 int형 변수 5개를 연속으로 만드는 것
        int[] students 변수는 new int[5]로 생성한 배열의 참조 값을 가지고 있음
        이 참조 값을 통해서 배열에 접근할 수 있음
         */

        System.out.println(students); // [I@10f87f48 << 참조값

        // 변수 값 대입
        students[0] = 90; // index는 0부터 시작함
        students[1] = 80; // == x001의 [1]요소에 80을 대입
        students[2] = 70;
        students[3] = 60;
        students[4] = 50; // index의 마지막 요소는 입력한 n - 1

        // 변수 값 사용
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

        /*
        기본형 vs 참조형

        기본형: int, long, double, boolean처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입 (크기가 정해져있음)
        참조형: []과 같이 데이터에 접근하기 위해 참조(주소)를 저장하는 데이터 타입 (동적으로 크기 변경이 가능함)

        기본형은 사용할 값을 직접 저장하는 반면, 참조형은 메모리에 저장된 배열이나 참조를 저장.
        이로인해 참조형은 더 복잡한 데이터 구조를 만들고 관리할 수 있지만, 기본형에 비해 느리고 효율적인 메모리 사용이 어려움.
         */
    }
}
