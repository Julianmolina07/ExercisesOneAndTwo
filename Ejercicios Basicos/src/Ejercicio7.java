import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosR = minutos% 60;

        System.out.println(minutos +" minutos equivalen a " + horas + " horas y " + minutosR + " minutos.");

    }
}
