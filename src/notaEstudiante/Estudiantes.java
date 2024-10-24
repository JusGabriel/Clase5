package notaEstudiante;

public class Estudiantes {
    String nombre,  telefono;
    int edad;

    public Estudiantes(String nombre, String telefono, int edad){
        this.nombre=nombre;
        this.telefono=telefono;
        this.edad = edad;
    }

    public void imprimir(){
        System.out.println("Informacion del estudiante: ");
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nTelefono: "+telefono);
    }
}
