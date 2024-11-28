import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingresa el primer número: ");
    int num1 = scanner.nextInt();
    System.out.print("Ingresa el segundo número: ");
    int num2 = scanner.nextInt();
    System.out.print("Ingresa el tercer número: ");
    int num3 = scanner.nextInt();
    int menor, medio, mayor;
    if (num1 <= num2 && num1 <= num3) {
        menor = num1;
        if (num2 <= num3) {
            medio = num2;
            mayor = num3;
        } else {
            medio = num3;
            mayor = num2;
        }
    } else if (num2 <= num1 && num2 <= num3) {
        menor = num2;
        if (num1 <= num3) {
            medio = num1;
            mayor = num3;
        } else {
            medio = num3;
            mayor = num1;
        }
    } else {
        menor = num3;
        if (num1 <= num2) {
            medio = num1;
            mayor = num2;
        } else {
            medio = num2;
            mayor = num1;
        }
    }
    System.out.println("El orden correcto de los numeros es:\n");
    System.out.println(menor + ", " + medio + ", " + mayor);
}
