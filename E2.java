import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double INTERES = 0.01;
        final int PLAZO_CORTO = 6;
        final int PLAZO_MEDIO = 12;
        final int PLAZO_LARGO = 24;
        char otra;

        do {
            System.out.println("Ingresa la cantidad inicial de dinero:");
            double inicial = input.nextDouble();
            while (inicial <= 0) {
                System.out.println("Ingresa una cantidad inicial positiva:");
                inicial = input.nextDouble();
            }

            System.out.println("Ingresa la meta de ahorro:");
            double meta = input.nextDouble();
            while (meta <= 0) {
                System.out.println("Ingresa una meta de ahorro positiva:");
                meta = input.nextDouble();
            }

            System.out.println("Ingresa el ahorro mensual:");
            double mensual = input.nextDouble();
            while (mensual <= 0) {
                System.out.println("Ingresa un ahorro mensual positivo:");
                mensual = input.nextDouble();
            }

            int plazo = 0;
            while (plazo == 0) {
                System.out.println("Elige el plazo de simulacion:");
                System.out.println("1) " + PLAZO_CORTO + " meses");
                System.out.println("2) " + PLAZO_MEDIO + " meses");
                System.out.println("3) " + PLAZO_LARGO + " meses");
                int opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        plazo = PLAZO_CORTO;
                        break;
                    case 2:
                        plazo = PLAZO_MEDIO;
                        break;
                    case 3:
                        plazo = PLAZO_LARGO;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

            double saldo = inicial;
            double intereses = 0;
            int mesesNecesarios = 0;
            boolean metaAlcanzada = false;

            for (int mes = 1; mes <= plazo; mes++) {
                saldo = saldo + mensual;
                double interesMes = saldo * INTERES;
                saldo = saldo + interesMes;
                intereses = intereses + interesMes;
                if (!metaAlcanzada) {
                    mesesNecesarios = mesesNecesarios + 1;
                    if (saldo >= meta) {
                        metaAlcanzada = true;
                    }
                }
            }

            System.out.println();
            System.out.println("RESULTADOS");
            System.out.printf("Saldo final: $%.2f%n", saldo);
            System.out.printf("Intereses generados: $%.2f%n", intereses);
            if (metaAlcanzada) {
                System.out.println("La meta si se alcanzo en " + mesesNecesarios + " meses");
            } else {
                System.out.println("La meta no se alcanzo");
            }

            System.out.println();
            System.out.println("Quieres realizar otra simulacion? (s/n):");
            otra = input.next().charAt(0);
        } while (otra == 's' || otra == 'S');
    }
}