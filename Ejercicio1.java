import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int DIVISOR = 4;
        final int MULTIPLO = 3;
        final int CINCO = 5;
        char otra;

        do {
            System.out.println("Ingresa un numero entero positivo N:");
            int n = input.nextInt();
            while (n <= 0) {
                System.out.println("Ingresa un numero que sea entero positivo N:");
                n = input.nextInt();
            }

            int sumaDivisiblesCuatro = 0;
            int multiplosTres = 0;
            int divisiblesAmbos = 0;
            int pares = 0;
            int impares = 0;
            int multiplosCinco = 0;

            for (int i = 1; i <= n; i++) {
                if (i % DIVISOR == 0) {
                    sumaDivisiblesCuatro = sumaDivisiblesCuatro + i;
                }
                if (i % MULTIPLO == 0) {
                    multiplosTres = multiplosTres + 1;
                }
                if (i % DIVISOR == 0 && i % MULTIPLO == 0) {
                    divisiblesAmbos = divisiblesAmbos + 1;
                }
                if (i % 2 == 0) {
                    pares = pares + 1;
                } else {
                    impares = impares + 1;
                }
                if (i % CINCO == 0) {
                    multiplosCinco = multiplosCinco + 1;
                }
            }

            System.out.println();
            System.out.println("RESULTADOS DEL 1 AL " + n);
            System.out.println("Suma de los numeros divisibles entre 4: " + sumaDivisiblesCuatro);
            System.out.println("Cantidad de multiplos de 3: " + multiplosTres);
            System.out.println("Cantidad de numeros divisibles entre 3 y 4: " + divisiblesAmbos);

            System.out.println();
            System.out.println("Que estadistica quieres ver?");
            System.out.println("1) Numeros pares");
            System.out.println("2) Numeros impares");
            System.out.println("3) Multiplos de 5");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cantidad de numeros pares: " + pares);
                    break;
                case 2:
                    System.out.println("Cantidad de numeros impares: " + impares);
                    break;
                case 3:
                    System.out.println("Cantidad de multiplos de 5: " + multiplosCinco);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            System.out.println();
            System.out.println("Quieres realizar otro analisis? (s/n):");
            otra = input.next().charAt(0);
        } while (otra == 's' || otra == 'S');
    }
}