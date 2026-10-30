import java.util.Scanner;

public class E4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int RONDAS = 5;
        final double LIMITE_BAJO = 2;
        final double LIMITE_ALTO = 4;
        char otra;

        do {
            System.out.println("Ingresa la cantidad de participantes:");
            int participantes = input.nextInt();
            while (participantes <= 0) {
                System.out.println("Ingresa una cantidad de participantes positiva:");
                participantes = input.nextInt();
            }

            double distanciaGeneral = 0;
            double mayorDistancia = -1;
            int mejorParticipante = 0;
            int rondasBajas = 0;
            int rondasMedias = 0;
            int rondasAltas = 0;

            for (int p = 1; p <= participantes; p++) {
                System.out.println();
                System.out.println("PARTICIPANTE " + p);
                double distanciaTotal = 0;

                for (int r = 1; r <= RONDAS; r++) {
                    System.out.println("Distancia en km de la ronda " + r + ":");
                    double distancia = input.nextDouble();
                    while (distancia < 0) {
                        System.out.println("La distancia debe ser mayor o igual a 0:");
                        distancia = input.nextDouble();
                    }

                    distanciaTotal = distanciaTotal + distancia;

                    if (distancia < LIMITE_BAJO) {
                        System.out.println("Rendimiento bajo");
                        rondasBajas = rondasBajas + 1;
                    } else if (distancia <= LIMITE_ALTO) {
                        System.out.println("Rendimiento medio");
                        rondasMedias = rondasMedias + 1;
                    } else {
                        System.out.println("Rendimiento alto");
                        rondasAltas = rondasAltas + 1;
                    }
                }

                System.out.printf("Participante %d: distancia total %.2f km, promedio por ronda %.2f km%n",
                        p, distanciaTotal, distanciaTotal / RONDAS);

                distanciaGeneral = distanciaGeneral + distanciaTotal;
                if (distanciaTotal > mayorDistancia) {
                    mayorDistancia = distanciaTotal;
                    mejorParticipante = p;
                }
            }

            System.out.println();
            System.out.println("Que estadistica general quieres ver?");
            System.out.println("1) Distancia total");
            System.out.println("2) Promedio por participante");
            System.out.println("3) Rondas de cada categoria");
            System.out.println("4) Participante con mayor distancia acumulada");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("Distancia total: %.2f km%n", distanciaGeneral);
                    break;
                case 2:
                    System.out.printf("Promedio por participante: %.2f km%n", distanciaGeneral / participantes);
                    break;
                case 3:
                    System.out.println("Rondas con rendimiento bajo: " + rondasBajas);
                    System.out.println("Rondas con rendimiento medio: " + rondasMedias);
                    System.out.println("Rondas con rendimiento alto: " + rondasAltas);
                    break;
                case 4:
                    System.out.printf("El participante %d con %.2f km acumulados%n", mejorParticipante, mayorDistancia);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println();
            System.out.println("Quieres registrar otra competencia? (s/n):");
            otra = input.next().charAt(0);
        } while (otra == 's' || otra == 'S');
    }
}