package Arrays.ex03NegativeNumbers;
import java.util.Scanner;

public class negativeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you enter? ");
        int n = sc.nextInt();

        int[] vector = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter a number: ");
            vector[i] = sc.nextInt();
        }

        System.out.println("------NEGATIVE NUMBERS-----");
        for (int i=0; i<n; i++){
            if(vector[i] <0){
                System.out.printf("%d\n",vector[i]);
            }
        }

        sc.close();

    }
}
