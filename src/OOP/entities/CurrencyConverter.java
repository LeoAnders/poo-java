package OOP.entities;

public class CurrencyConverter {

    public static double IOF = 0.06;
    public static double  amountReal(double dollarPrice, double boughtDollars){
        return dollarPrice * boughtDollars * (1.0 + IOF);
    }
}
