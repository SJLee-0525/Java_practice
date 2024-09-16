package method.ex;

import java.util.Scanner;

public class MethodEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;

        while (true) {
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.print("선택: ");
            int prompt = scanner.nextInt();

            if (prompt == 1) {
                System.out.print("입금액을 입력하세요: ");
                int depositAmount = scanner.nextInt();
                balance = deposit(balance, depositAmount);

            } else if (prompt == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdrawAmount = scanner.nextInt();
                balance = withdraw(balance, withdrawAmount);

            } else if (prompt == 3) {
                System.out.println("현재 잔액: " + balance);

            } else if (prompt == 4) {
                System.out.println("시스템을 종료합니다.");
                break;

            } else {
                System.out.println("올바른 선택이 아닙니다. 다시 선택해 주세요.");
            }
        }
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance > withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
