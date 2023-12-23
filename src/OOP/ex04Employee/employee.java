package OOP.ex04Employee;

import OOP.entities.Employee;

import java.util.Scanner;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.print("Employee: " + employee.ToString()); // Exibe os dados inseridos do funcionário.
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();  // Solicita a porcentagem de aumento salarial.
        System.out.println();
        employee.increaseSalary(percentage); // Aplica o aumento salarial.

        System.out.println();
        System.out.println("Updated data: " + employee.ToString());

        sc.close();
    }
}
