import java.util.Scanner;

public class EjercicioA3 {
    
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][5];
        
        System.out.println("Ingrese 20 numeros enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        
        System.out.println("Sumas parciales de las filas:");
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("= " + sumaFila);
        }
        
        System.out.println("Sumas parciales de las columnas:");
        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("= " + sumaColumna);
        }
        
       
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        System.out.println("La suma total es: " + sumaTotal);
        
    }
}

