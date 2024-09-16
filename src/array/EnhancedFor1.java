package array;

public class EnhancedFor1 {
    // 향상된 for문 : 각각의 요소를 탐색한다는 의미에서 'for-each'문이라고도 부름
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // 향상된 for문 [for-each문]
        // for (반복할 때마다 찾은 값을 저장할 변수 선언 : 탐색할 배열) {}
        // 단축키 : iter
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        /*
        향상된 for문은 배열의 index를 사용하지 않고, 종료 조건을 주지 않아도 해당 배열의 처음부터 끝까지 탐색함
        for (반복할 때마다 찾은 값을 저장할 변수 선언 : 탐색할 배열) {}
        향상된 for문은 배열의 index를 사용하지 않고도 배열의 요소를 순회할 수 있기에 코드가 간결하고 가독성이 좋음
        다만 index 값을직접 사용해야하는 경우에는 for-each문을 사용할 수 없음.
         */
    }
}
