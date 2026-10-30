import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1) Calcular el cuadrado de un numero");
            System.out.println("2) Calcular el cubo de un numero");
            System.out.println("3) Determinar si un numero es par o impar");
            System.out.println("4) Calcular la suma de 1 hasta un numero");
            System.out.println("5) Salir");
            System.out.println("Elige una opcion:");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero:");
                    int numero1 = input.nextInt();
                    System.out.println("El cuadrado de " + numero1 + " es " + (numero1 * numero1));
                    break;
                case 2:
                    System.out.println("Ingresa un numero:");
                    int numero2 = input.nextInt();
                    System.out.println("El cubo de " + numero2 + " es " + (numero2 * numero2 * numero2));
                    break;
                case 3:
                    System.out.println("Ingresa un numero:");
                    int numero3 = input.nextInt();
                    if (numero3 % 2 == 0) {
                        System.out.println("El numero " + numero3 + " es par");
                    } else {
                        System.out.println("El numero " + numero3 + " es impar");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa un numero positivo:");
                    int numero4 = input.nextInt();
                    if (numero4 > 0) {
                        int suma = 0;
                        for (int i = 1; i <= numero4; i++) {
                            suma = suma + i;
                        }
                        System.out.println("La suma de 1 hasta " + numero4 + " es " + suma);
                    } else {
                        System.out.println("Error: el numero debe ser positivo");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa, hasta luego");
                    break;
                default:
                    System.out.println("Error: la opcion no existe");
            }
        } while (opcion != 5);
    }
}