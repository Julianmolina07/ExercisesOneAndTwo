import java.util.Scanner;

public class EjercicioB4 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();
        
        int minimo, maximo;
        
        if (numero1 <= numero2) {
          minimo = numero1;
          maximo = numero2;
        } else {
          maximo = numero1;
          minimo = numero2;
        }
        
        for (int i = minimo + 1; i < maximo; i++) {
          if (i % 2 == 0) {
            System.out.println(i);
          }
        }
    }
}
