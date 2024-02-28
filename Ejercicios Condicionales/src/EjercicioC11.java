import java.util.Scanner;

public class EjercicioC11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número total de alumnos:");
        int numAlumnos = scanner.nextInt();
        
        double costoAlumno = calcularCostoAlumno(numAlumnos);
        double costoTotalAutobus = calcularCostoAutobus(numAlumnos);
        
        System.out.println("El costo por alumno es de: " + costoAlumno + " euros.");
        System.out.println("El total a pagar a la compañía de autobuses es de: " + costoTotalAutobus + " euros.");
        
    }
    
    public static double calcularCostoAlumno(int numAlumnos) {
        double costoAlumno;
        
        if (numAlumnos >= 100) {
            costoAlumno = 65;
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            costoAlumno = 70;
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            costoAlumno = 95;
        } else {
            costoAlumno = 4000.0 / numAlumnos; 
        }
        
        return costoAlumno;
    }
    
    public static double calcularCostoAutobus(int numAlumnos) {
        double costoAutobus;
        
        if (numAlumnos >= 30) {
            costoAutobus = 4000;
        } else {
            costoAutobus = 4000;
        }
        
        return costoAutobus;
    }
}
