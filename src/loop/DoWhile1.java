package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        //do-while문은 while문과 유사하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다는 차이가 있다.
        int i = 10;
        while (i < 3) {
            System.out.println("while 현재 숫자는: " + i);
            i++;
        }

        int i2 = 10;
        do {
            System.out.println("do-while 현재 숫자는: " + i2);
            i2++;
        } while (i2 < 3);
        // do-while문의 경우는 우선 do문을 먼저 실행한 후 뒤에 있는 while 내의 조건문을 확인함
        // 만약 조건문이 참이면, do 블럭으로 되돌아가서 반복을 수행하고, 거짓이면 반복을 종료함
        // do-while문은 최초 한 번은 코드 블럭을 꼭 실행해야 하는 경우에 사용하면 된다
    }
}
