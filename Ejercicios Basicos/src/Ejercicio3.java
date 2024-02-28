import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el cateto 1");
        double cat1 = sc.nextDouble();

        System.out.println("Ingrese cateto 2");
        double cat2 = sc.nextDouble();

        Double hipotenusa = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));

        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
