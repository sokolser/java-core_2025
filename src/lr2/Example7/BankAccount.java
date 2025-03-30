package lr2.Example7;
public class BankAccount implements BankAccountInterface {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Начальный баланс не может быть отрицательным");
        }
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит: +" + amount + " Новый баланс: " + balance);
        } else {
            System.out.println("Сумма депозита должна быть положительной");
        }
    }
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снятие: -" + amount + " Новый баланс: " + balance);
            return true;
        } else {
            System.out.println("Недостаточно средств или некорректная сумма снятия");
            return false;
        }
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
