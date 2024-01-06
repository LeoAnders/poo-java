package Arrays.ex05heights;

import java.util.Scanner;

public class height {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many peoples will you enter? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for(int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Name: ");
            name[i] = sc.next();
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height: ");
            height[i] = sc.nextDouble();
        }

        //Average of Height
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += height[i];
        }
        double average = sum /n;

        //Calculating percentage
        int youngerAges = 0;
        for(int i=0; i<n; i++){
            if(age[i] < 16){
                youngerAges++;
            }
        }

        float percentage = (float)youngerAges / n * 100;

        System.out.printf("Average height: %.2f\n", average);
        System.out.printf("People under 16: %.2f%%\n",percentage);

        for(int i=0; i<n; i++){
            if(age[i] < 16){
                System.out.printf("%s\n", name[i]);
            }
        }


        sc.close();

    }
}
