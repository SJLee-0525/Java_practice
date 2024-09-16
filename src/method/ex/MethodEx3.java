package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        // 1000원 입금
        balance = deposit(balance, 1000);

        // 2000원 출금
        balance = withdraw(balance, 12000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    public static int deposit(int balance, int depositAmount) {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdraw(int balance, int withdrawAmount) {
        if (balance < withdrawAmount) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        }
        balance -= withdrawAmount;
        System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance);
        return balance;
    }
}
