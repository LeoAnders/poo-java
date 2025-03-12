package OOP.ex07QuarterlyBalanceSheet;

public class QuarterlyBalanceSheet {
    public static void main(String[] args) {
        float januarySpend = 1500;
        float februarySpend = 2300;
        float marchSpend = 1700;

        float spendQuarter = januarySpend + februarySpend + marchSpend;
        float mediaMonthly = spendQuarter / 3;

        System.out.printf("Total expenses for the quarter = %.2f\n", spendQuarter);
        System.out.printf("Average monthly value = %.2f\n", mediaMonthly);
    }
}
