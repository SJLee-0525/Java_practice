package array.ex;

import java.util.Scanner;

public class productAdminEx {
    // 상품 관리 프로그램 만들기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productCount = 0;
        int maxProduct = 10;
        int[] productPrices = new int[maxProduct];
        String[] productNames = new String[maxProduct];
        
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int prompt = scanner.nextInt();
            scanner.nextLine();

            if (prompt == 1) {
                if (productCount < maxProduct) {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();
                    scanner.nextLine();

                    productCount++;
                } else if (productCount == maxProduct) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
            } else if (prompt == 2) {
                if (productCount > 1) {
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                    }
                } else if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                }
            } else if (prompt == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
