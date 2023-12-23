package Arrays.ex01HeightOfPeople.OOP.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.0;
    }

    public String ToString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }

}
