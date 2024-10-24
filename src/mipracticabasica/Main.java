package mipracticabasica;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el año en que nacio: ");
        int anio =sc.nextInt();
        Persona persona1 = new Persona(anio);
        persona1.mostrarResultado();
    }
    }
