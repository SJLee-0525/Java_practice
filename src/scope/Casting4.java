package scope;

public class Casting4 {
    
    public static void main(String[] args) {
        /*
        Java에서의 계산은 다음 2가지만 기억하자.
        1. 같은 타입끼리의 계산은 같은 결과를 냄:
            - int + int = int를, double + double = double의 결과가 나옴

        2. 서로 다른 타입의 계산은 큰 범위로의 자동 형변환이 발생함:
            int + long = long + long으로 자동 형변환이 발생
            int + double = double + double로 자동 형변환이 발생
         */

        int div1 = 3 / 2;       // 답은 1.5이지만 (int)형끼리의 계산이기 때문에 (int)형인 1이 나옴
        System.out.println("div1 = " + div1); // div1 = 1
        
        double div2 = 3 / 2;    // (int)형끼리의 연산을 마친 후: 1을 (double)에 대입하기에 1.0이 나옴
        System.out.println("div2 = " + div2); // div2 = 1.0
        
        double div3 = 3.0 / 2;  // 3.0은 (double)형임. (double) / (double)의 연산으로 자동 형변환 됨
        System.out.println("div3 = " + div3); // div3 = 1.5
        
        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4); // div4 = 1.5

        int a = 3;
        int b = 2;
        double rst = (double) a / b; // == ((double) a) / b
        System.out.println("rst = " + rst);   // rst = 1.5
    }
}
