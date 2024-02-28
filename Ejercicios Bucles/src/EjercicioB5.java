import java.util.Scanner;

public class EjercicioB5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limiteInferior, limiteSuperior, numero;
        int suma = 0, fuera = 0;
        boolean igual = false;

        do {
            System.out.println("Introduce el limite inferior del intervalo:");
            limiteInferior = sc.nextInt();
            System.out.println("Introduce el limite superior del intervalo:");
            limiteSuperior = sc.nextInt();
            if (limiteInferior > limiteSuperior) {
                System.out.println("Error, el limite inferior debe ser menor que el superior.");
            }
        } while (limiteInferior > limiteSuperior);

        do {
            System.out.println("Introduce un número (0 para terminar):");
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero > limiteInferior && numero < limiteSuperior) {
                    suma += numero; 
                } else {
                    fuera++; 
                }
                if (numero == limiteInferior || numero == limiteSuperior) {
                    igual = true; 
                }
            }
        } while (numero != 0);

        System.out.println("La suma de los números dentro del intervalo es: " + suma);
        System.out.println("Se han introducido " + fuera + " números fuera del intervalo.");
        if (igual) {
            System.out.println("Se ha introducido algún número igual a los límites del intervalo.");
        } else {
            System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
        }
    }
}
