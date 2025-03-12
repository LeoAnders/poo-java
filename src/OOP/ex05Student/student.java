package OOP.ex05Student;

import OOP.entities.Student;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("Final grade: " +  student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println("FAILED");
            System.out.println("Missing " + student.missingPoints() + " points");
        }else {
            System.out.print("PASS");
        }

        sc.close();
    }
}