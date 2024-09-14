package scope;

public class Casting1 {
    // 형변환: 작은 범위에서 큰 범위로는 값을 넣을 수 있음
    public static void main(String[] args) {
        int intVal = 10;
        long longVal;
        double doubleVal;

        longVal = intVal;           // int -> long
        // longVal = (long) intVal;
        System.out.println("longVal = " + longVal);

        doubleVal = intVal;         // int -> double
        System.out.println("doubleVal = " + doubleVal);

        /*
        doubleValue = intValue
        doubleValue = (double) intValue // 형 맞추기
        doubleValue = (double) 10       // 변수 값 읽기
        doubleValue = 10.0              // 형변환

        앞에 (double) 과 같이 적어주면 int 형이 double 형으로 변함. <- 형변환
        위와 같이 작은 범위에서 큰 범위 숫자 타입으로의 대입은 직접 형변환 하지 않아도 됨 (자동 형변환, 묵시적 형변환)
         */
        
        double doubleVal2 = 20L;    // long => double
        System.out.println("doubleVal2 = " + doubleVal2);
    }
}
