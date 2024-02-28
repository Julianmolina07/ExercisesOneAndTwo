import java.util.Scanner;

public class EjercicioC3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero para la division");
        Double div1 = sc.nextDouble();

        System.out.println("Ingresa el segundo numero para la division");
        Double div2 = sc.nextDouble();

        if (div2 == 0) {
            System.out.println("ERROR: no se puede dividir por 0");
        }else{
            System.out.println("El resultado de su divison es: " + div1/div2);
        }

    }
}