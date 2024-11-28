import java.util.Scanner;

public class Main {

Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = input.nextInt();
        System.out.print("Los divisores son: ");
        boolean esPrimo = true;
        boolean primerDivisor = true;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i != 1 && i != n) {
                    esPrimo = false;
                }
                if (!primerDivisor) {
                    System.out.print(", ");
                }
                System.out.print(i);
                primerDivisor = false;
            }
        }
        if (esPrimo) {
            System.out.println("\nEl número " + n + " es primo");
        }
}
