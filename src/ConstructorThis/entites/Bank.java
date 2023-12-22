package ConstructorThis.entites;

public class Bank {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    //Constructor
    public Bank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
    //Overload
    public Bank(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    //Encapsulation
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    //Deposit
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5;
    }

    public String toString(){
        return accountNumber
                + ", Holder: "
                + accountHolder
                + ", balance: $ "
                + String.format("%.2f", balance);
    }
}
