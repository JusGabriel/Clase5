package mipracticabasica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Persona {

    int edad, anio;
    int anioActual = 2024;

    public Persona(int anio) {
        this.anio = anio;
    }

    public int imprimirEdad(){
        int edad = anioActual - anio;
        return edad;
    }

    public void verificarMayorDeEdad (){
        if (imprimirEdad() >= 18 ){
            boolean mayor = true;
            System.out.println("¿La persona es mayor de edad?: "+mayor);
    }
        else {
            boolean mayor = false;
            System.out.println("¿La persona es mayor de edad?: "+mayor);
        }
    }
    public void mostrarResultado (){
        System.out.println("La persona tiene: " + imprimirEdad() + " años.");
        verificarMayorDeEdad();
    }
}



