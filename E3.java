import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int MINIMO = 1;
        final int MOSTRAR_SUMAS = 1;
        final int MOSTRAR_RESULTADO = 2;
        char otra;

        do {
            System.out.println("Ingresa el primer numero entero positivo:");
            int a = input.nextInt();
            while (a < MINIMO) {
                System.out.println("Ingresa un numero que sea entero positivo:");
                a = input.nextInt();
            }

            System.out.println("Ingresa el segundo numero entero positivo:");
            int b = input.nextInt();
            while (b < MINIMO) {
                System.out.println("Ingresa un numero que sea entero positivo:");
                b = input.nextInt();
            }

            int sumaA = 0;
            int cantidadA = 0;
            for (int i = MINIMO; i < a; i++) {
                if (a % i == 0) {
                    sumaA = sumaA + i;
                    cantidadA = cantidadA + 1;
                }
            }

            int sumaB = 0;
            int cantidadB = 0;
            for (int i = MINIMO; i < b; i++) {
                if (b % i == 0) {
                    sumaB = sumaB + i;
                    cantidadB = cantidadB + 1;
                }
            }

            System.out.println();
            System.out.println("Que quieres mostrar?");
            System.out.println(MOSTRAR_SUMAS + ") La suma de los divisores de cada numero");
            System.out.println(MOSTRAR_RESULTADO + ") Solo el resultado de la comparacion");
            int opcion = input.nextInt();

            switch (opcion) {
                case MOSTRAR_SUMAS:
                    System.out.println("Divisores propios de " + a + ": " + cantidadA + ", su suma es " + sumaA);
                    System.out.println("Divisores propios de " + b + ": " + cantidadB + ", su suma es " + sumaB);
                    break;
                case MOSTRAR_RESULTADO:
                    break;
                default:
                    System.out.println("Opcion no valida, solo se mostrara el resultado");
            }

            if (sumaA == b && sumaB == a) {
                System.out.println(a + " y " + b + " son numeros amigos");
            } else {
                System.out.println(a + " y " + b + " no son numeros amigos");
            }

            System.out.println();
            System.out.println("Quieres analizar otra pareja? (s/n):");
            otra = input.next().charAt(0);
        } while (otra == 's' || otra == 'S');
    }
}