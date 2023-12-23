package Arrays.ex01HeightOfPeople.OOP.ex06CurrencyConverter;

import Arrays.ex01HeightOfPeople.OOP.entities.CurrencyConverter;
import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        double boughtDollars = sc.nextDouble();

        double result = CurrencyConverter.amountReal(dollarPrice,boughtDollars);

        System.out.printf("Amount to be paid in reais = R$%.2f", result);


        sc.close();
    }
}
