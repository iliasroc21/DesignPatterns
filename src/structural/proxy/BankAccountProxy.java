package structural.proxy;

public class BankAccountProxy implements BankAccount{
    private RealBankAccount realBankAccount ;
    private String accountNumber ;
    private String authorizedUser;

    public BankAccountProxy(String accountNumber, String authorizedUser) {
        this.accountNumber = accountNumber;
        this.authorizedUser = authorizedUser;
    }

    private boolean authenticate(String user){
        return authorizedUser.equals(user);
    }
    private void logTransaction(String transactionType, double amount) {
        System.out.println("Transaction log: " + transactionType + " of $" + amount + " on account " + accountNumber);
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(accountNumber);
        }
        logTransaction("Deposit", amount);
        realBankAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (!authenticate(authorizedUser)) {
            System.out.println("Unauthorized access attempt detected.");
            return;
        }
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(accountNumber);
        }
        logTransaction("Withdrawal", amount);
        realBankAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        if (realBankAccount == null) {
            realBankAccount = new RealBankAccount(accountNumber);
        }
        System.out.println("Fetching balance for account " + accountNumber);
        return realBankAccount.getBalance();
    }
}
