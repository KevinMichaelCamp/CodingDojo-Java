import java.util.Random;

public class BankAccount {
    private String acctNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccts = 0;
    private static double bankBalance = 0;

    private static String generateAcctNum() {
        Random r = new Random();
        String acctNumber = "";
        for(int i = 0; i < 10; i++) {
            acctNumber += (r.nextInt(10));
        }
        return acctNumber;
    }

    public BankAccount() {
        numAccts++;
        this.acctNumber = generateAcctNum();
        this.savingsBalance = 0;
        this.checkingBalance = 0;
    }

    public BankAccount(double savings, double checking) {
        numAccts++;
        this.acctNumber = generateAcctNum();
        this.savingsBalance = savings;
        this.checkingBalance = checking;
        bankBalance += (savings + checking);
    }
    
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void displayAcctNum() {
        System.out.println("Account Number: " + this.acctNumber);
    }

    public void deposit(String account, double amount) {
        if(account == "savings"){
            this.savingsBalance += amount;
            bankBalance += amount;
        } else if(account == "checking"){
            this.checkingBalance += amount;
            bankBalance += amount;
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void withdrawal(String account, double amount) {
        if(account == "savings"){
            if(amount > this.savingsBalance){
                System.out.println("Insufficient funds");
            } else {
                this.savingsBalance -= amount;
                bankBalance -= amount;
            }
        } else if(account == "checking") {
            if(amount > this.checkingBalance){
                System.out.println("Insufficient funds");
            } else {
                this.checkingBalance -= amount;
                bankBalance -= amount;
            }
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void totalBalance() {
        double totalBalance = this.savingsBalance + this.checkingBalance;
        System.out.println("Total Account Balance: $" + totalBalance);
    }

    public static int accountCount() {
        return numAccts;
    }

    public static double displayBankBalance() {
        return bankBalance;
    }

}