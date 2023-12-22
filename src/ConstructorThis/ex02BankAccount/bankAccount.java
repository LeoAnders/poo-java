package ConstructorThis.ex02BankAccount;
import ConstructorThis.entites.Bank;
import java.util.Scanner;
public class bankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        String response = sc.next();
        if (response.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(accountNumber, accountHolder, initialDeposit);
        }
        else {
            bank = new Bank(accountNumber,accountHolder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);

        //Deposit amount
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.deposit(deposit); //Updating the balance with the deposit amount
        System.out.println("Updated account data: ");
        System.out.println(bank);

        //withdraw amount
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.withdraw(withdraw); //Updating the balance with the deposit amount
        System.out.println("Updated account data: ");
        System.out.println(bank);

        sc.close();
    }
}
