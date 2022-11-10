package P3_Bank_Account;

public class Bank_Account {
    private static int bankAccountsCount = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public Bank_Account() {
        this.id = bankAccountsCount;
        bankAccountsCount++;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * balance;
    }

    public int getId () {
        return id;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    //•	deposit(double amount): void
}


