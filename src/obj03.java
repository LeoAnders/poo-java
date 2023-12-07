
//Corrigindo problemas de repeticao de codigo e passando metodo de soma para entidade trinagulo
import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;
public class obj03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        //Para que podemos usar o OBJ devemos  instanciar/criar usando o new
        x = new Triangle();
        y = new Triangle();

        // Como faco para ler um numero inteiro e guardar no atributo A do OBJ X?
        System.out.println("Enter the measures of triangle X: ");
        //Colocaremos x. e ele ate mesmo auto ccompleta para escolher qual atributo queremos acessar
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}