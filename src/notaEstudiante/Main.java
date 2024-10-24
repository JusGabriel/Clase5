package notaEstudiante;
import javax.xml.transform.Source;
import java.util.Scanner;
public class Main {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su telefono: ");
        String telefono = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese la nota del Bimestre 1: ");
        double B1 = sc.nextDouble();

        System.out.println("Ingrese la nota del Bimestre 2: ");
        double B2 = sc.nextDouble();

        Estudiantes e1 = new Estudiantes(nombre, telefono, edad);
        e1.imprimir();
        Notas e2 = new Notas(B1,B2);
        System.out.println("El promedio es: "+ e2.calculoPromedio());

    }

}
