package Arrays.ex04RealNumbers;

import java.util.Scanner;

public class realNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        double[] vector = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            vector[i] = sc.nextDouble();
        }

        System.out.print("Values = ");
        for(int i=0; i<n; i++){
            System.out.printf("%.1f ", vector[i]);
        }

        double sum = 0;
        for(int i=0; i<n; i++){
            sum += vector[i];
        }
        System.out.println();
        System.out.printf("Sum = %.2f", sum);

        double average = sum /n;
        System.out.println();
        System.out.printf("Average = %.2f", average);

        sc.close();

    }
}
