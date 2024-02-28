import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        double base, altura;
        
        System.out.println("Ingrese la base:");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura:");
        altura = sc.nextDouble();
    
        double perimetro = 2 * (base + altura);
        double area = base * altura;
        
        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
      
    }
}
