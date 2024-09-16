package method;

public class MethodValue3 {
    // 매서드를 사용해서 값 변경하기
    public static void main(String[] args) {
        int num = 5;
        System.out.println("1. changeNumber 호출 전, main num = " + num); // 5
        num = changeNumber(num);
        System.out.println("4. changeNumber 호출 후, main num = " + num); // 10
    }

    public static int changeNumber(int num) {
        System.out.println("2. changeNumber 변경 전, changeNumber num = " + num); // 5
        num = num * 2;
        System.out.println("3. changeNumber 변경 후, changeNumber num = " + num); // 10
        return num;
    }
}

    /*
    1. changeNumber 호출 전, main num = 5
    2. changeNumber 변경 전, changeNumber num = 5
    3. changeNumber 변경 후, changeNumber num = 10
    4. changeNumber 호출 후, main num = 10
     */