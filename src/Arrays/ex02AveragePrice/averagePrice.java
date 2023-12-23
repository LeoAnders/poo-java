package Arrays.ex02AveragePrice;
import Arrays.entites.Product;
import java.util.Scanner;

public class averagePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        Product[] vector = new Product[n];

        for (int i=0; i<vector.length; i++) {
            String name = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            vector[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vector.length; i++) {
            sum += vector[i].getPrice();
        }
        double avg = sum / vector.length;
        System.out.printf("Average Price: %.2f%n", avg);

        sc.close();
    }
}
