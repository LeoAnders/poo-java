package Arrays.ex01HeightOfPeople;

import java.util.Scanner;

public class heightOfPeople {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];
        for (int i=0; i<n; i++){
            vector[i] = sc.nextDouble();
        }

        double sum = 0.00;
        for (int i=0; i<n; i++){
            sum += vector[i];
        }
        double avg = sum / n;
        System.out.printf("Average Height: %.2f%n", avg);

        sc.close();
    }
}
