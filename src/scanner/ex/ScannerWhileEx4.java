package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = 0;
        int option;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt(); // nextInt()는 앞의 숫자만 뽑아가고 뒤에 붙은 엔터는 그대로 둠..
            scanner.nextLine(); // 앞에서 입력된 \n이 살아서 다음 입력에 영향을 주기 때문에, 입력을 버리는 용도의 입력을 추가해야함;

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String product = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = scanner.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = scanner.nextInt();

                totalPrice += price * quantity;

                System.out.println("상품명: " + product + ", 가격: " + price + ", 합계: " + (price * quantity));
            } else if (option == 2) {
                System.out.println("총 비용: " + totalPrice);
                totalPrice = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}
