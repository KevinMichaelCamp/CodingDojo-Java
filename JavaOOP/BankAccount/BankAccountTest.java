public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(200, 100);
        BankAccount acct2 = new BankAccount(125.75, 25.20);
        BankAccount acct3 = new BankAccount(0, 0);
        BankAccount acct4 = new BankAccount();

        System.out.println("<-----Bank of Java----->");
        System.out.println("Number of Bank Accounts: " + BankAccount.accountCount());
        System.out.println("Total Bank Balance: $" + BankAccount.displayBankBalance());

        System.out.println("\n<-----Account 1----->");
        acct1.displayAcctNum();
        System.out.println("Savings Balance: $" + acct1.getSavingsBalance());
        System.out.println("Checking Balance: $" + acct1.getCheckingBalance());
        acct1.totalBalance();

        System.out.println("\n<-----Account 2----->");
        acct2.displayAcctNum();
        System.out.println("Savings Balance: $" + acct2.getSavingsBalance());
        System.out.println("Checking Balance: $" + acct2.getCheckingBalance());
        acct2.totalBalance();

        System.out.println("\n<-----Account 3----->");
        acct3.displayAcctNum();
        System.out.println("Savings Balance: $" + acct3.getSavingsBalance());
        System.out.println("Checking Balance: $" + acct3.getCheckingBalance());
        acct3.totalBalance();
        acct3.deposit("CHECKING", 100);
        acct3.deposit("checking", 100);
        acct3.totalBalance();

        System.out.println("\n<-----Account 4----->");
        acct4.displayAcctNum();
        System.out.println("Savings Balance: $" + acct4.getSavingsBalance());
        System.out.println("Checking Balance: $" + acct4.getCheckingBalance());
        acct4.totalBalance();
        acct4.withdrawal("checking", 100);

    }
}