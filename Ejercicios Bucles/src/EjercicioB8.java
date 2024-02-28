public class EjercicioB8 {
    public static void main(String[] args) {
   
        int horas = 0, minutos = 0, segundos = 0;

     
        while (true) {
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;

            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }

            if (minutos == 60) {
                horas++;
                minutos = 0;
            }

            if (horas == 24) {
                horas = 0;
            }
        }
    }
}

