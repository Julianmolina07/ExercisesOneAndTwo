import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de respuestas incorrectas: ");
        int respuestasIncorrectas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de respuestas no contestadas: ");
        int respuestasNoContestadas = scanner.nextInt();
     
        int notaFinal = calcularNotaFinal(respuestasCorrectas, respuestasIncorrectas);

        System.out.println("La nota final del estudiante es: " + notaFinal + " puntos.");
    }

    public static int calcularNotaFinal(int respuestasCorrectas, int respuestasIncorrectas) {

        int puntajeCorrectas = respuestasCorrectas * 5;

        int puntajeIncorrectas = respuestasIncorrectas * -1;

        int notaFinal = puntajeCorrectas + puntajeIncorrectas;

        if (notaFinal < 0) {
            notaFinal = 0;
        }

        return notaFinal;
    }
}