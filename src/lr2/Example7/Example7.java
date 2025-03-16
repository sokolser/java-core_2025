package lr2.Example7;

public class Example7 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Начальный баланс: " + account.getBalance());

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);

        System.out.println("Итоговый баланс: " + account.getBalance());
    }
}
