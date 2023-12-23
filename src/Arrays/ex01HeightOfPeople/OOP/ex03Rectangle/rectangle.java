package Arrays.ex01HeightOfPeople.OOP.ex03Rectangle;

import Arrays.ex01HeightOfPeople.OOP.entities.Rectangle;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("Area: %.2f%n", rectangle.area());
        System.out.printf("Perimetro : %.2f%n", rectangle.perimeter());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());

        System.out.println();

        sc.close();
    }

}
