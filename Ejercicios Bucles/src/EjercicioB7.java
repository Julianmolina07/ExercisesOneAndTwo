public class EjercicioB7 {
    public static void main(String[] args) {
     
        int meses = 20;
        double pagoActual = 10.0;
        double totalPagado = 0.0;

        System.out.println("Pagos mensuales:");

        for (int i = 1; i <= meses; i++) {
            System.out.println("Mes " + i + ": " + pagoActual + " €");
            totalPagado += pagoActual;
            pagoActual *= 2;  
        }

       
        System.out.println("\nTotal pagado después de " + meses + " meses: " + totalPagado + " €");
    }
}
