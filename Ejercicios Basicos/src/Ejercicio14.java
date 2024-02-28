import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número de dos cifras:");
        int numero = scanner.nextInt();
        
        if(numero >= 10 && numero <= 99) {
            int numeroInvertido = invertirNumero(numero);
            System.out.println("El número invertido es: " + numeroInvertido);
        } else {
            System.out.println("El número ingresado no es de dos cifras.");
        }
        
    }
    
    public static int invertirNumero(int num) {
        int unidad = num % 10;
        int decena = num / 10;
        return unidad * 10 + decena;
    }
}
