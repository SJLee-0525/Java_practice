package scope;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntVal = 2147483647;    // int의 최대 값
        long maxIntOver = 2147483648L;  // int의 최대 값 + 1

        int intVal;
        intVal = (int) maxIntVal;       // int의 최대 값을 초과하지 않기 때문에 문제 발생 X
        System.out.println("intVal = " + intVal);           // intVal = 2147483647

        int intValOver;
        intValOver = (int) maxIntOver;  // int의 최대 값을 초과했기 때문에 문제 발생 O
        System.out.println("intValOver = " + intValOver);   // intValOver = -2147483648 (Overflow 발생)
        // 오버플로우가 발생하면, 시계가 한 바퀴 돈 것처럼 다시 처음부터 시작한다.
        // 오버플로우 발생하는 것 자체가 문제, 해결하려고 하지 말고, 그냥 (long)으로 바꿔서 다시 담자
    }
}
