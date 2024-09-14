package scope;

public class Casting2 {
    // 명시적 형변환 : 큰 범위에서 작은 범위로의 대입은 명시적인 형변환이 필요함
    public static void main(String[] args) {
        double doubleVal = 1.5;
        int intVal;
        
        // intVal = doubleVal;      // 컴파일 오류 발생
        intVal = (int) doubleVal;   // 명시적 형변환 : 개발자가 직접 형변환 코드를 입력
        System.out.println("intVal = " + intVal); // 원본 값은 1.5였지만, 1로 변경되어 값이 대입됨 (실수 표현 불가)
        System.out.println("doubleVal = " + doubleVal); // 당연히 doubleVal의 형과 값은 유지됨

        System.out.println((int) 10.5);
    }
}
