package structural.proxy;

public class RealBankAccount implements BankAccount{
    private double balance;
    private String accountNumber ;

    public RealBankAccount( String accountNumber) {

        this.accountNumber= accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposited $ " + amount + " to account " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    @Override
    public double getBalance() {
        return this.balance;
    }
}
