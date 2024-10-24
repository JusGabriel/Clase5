package notaEstudiante;

public class Notas {
    double B1, B2;

    public Notas(double B1, double B2){
        this.B1=B1;
        this.B2=B2;

    }

    public double calculoPromedio(){
        double promedio = (B1+ B2)/2;
        return promedio;
    }

}
