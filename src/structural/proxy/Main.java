package structural.proxy;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccountProxy(
                "123456789", "authorizedUser"
        );

        // Authorized operations
        System.out.println("Authorized user accessing account:");
        myAccount.deposit(500);
        myAccount.withdraw(100);
        System.out.println("Balance: $" + myAccount.getBalance());

        // Unauthorized access attempt
        BankAccount unauthorizedAccess = new BankAccountProxy("123456789", "unauthorizedUser");
        System.out.println("\nUnauthorized user attempting access:");
        unauthorizedAccess.withdraw(50);  // Should deny access
    }
}
