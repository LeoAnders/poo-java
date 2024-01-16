package Array.ex06Rent;
import Array.entites.Rent;
import java.util.Scanner;

public class rent {
    public static void main(String[] args) {

        //Rent r = new Rent("Maria", "mariagmail.com");
        //System.out.println(r);

        Scanner sc = new Scanner(System.in);

        Rent[] vector = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Rent #"+ i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            //Creating temporary variable
            String name = sc.nextLine();
            System.out.print("Email: ");
            //Creating temporary variable
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);

            vector[roomNumber] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy room");
        for(int i=0; i < 10; i++){
            if (vector[i] != null){
                System.out.println(i + ": " +vector[i]);
            }
        }

        sc.close();

    }
}
