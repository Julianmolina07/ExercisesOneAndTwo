import java.util.Scanner;

public class EjercicioA2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int maximo = Integer.MIN_VALUE; 
        int minimo = Integer.MAX_VALUE; 
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            
           
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        
        System.out.println("Los numeros introducidos son:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" maximo");
            }
            if (numeros[i] == minimo) {
                System.out.print(" minimo");
            }
            System.out.println();
        }
    }
}
