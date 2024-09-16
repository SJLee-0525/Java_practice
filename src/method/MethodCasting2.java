package method;

public class MethodCasting2 {
    // 매서드에서도 자동 형변환은 정상 작동함 (더 작은 범위에서 큰 범위로의 이동에서)
    public static void main(String[] args) {
        int number = 100;
        printDouble(number);
    }

    public static void printDouble(double d) {
        System.out.println("실수: " + d);
    }
}
