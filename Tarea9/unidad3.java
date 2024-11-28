import java.util.Scanner;

public class Main {

 Scanner scanner = new Scanner(System.in);

 System.out.print("Ingresa el número del que quieres la tabla de multiplicar: ");
 int numeroParaMultiplicar = scanner.nextInt();
 System.out.print("Ingresa el rango hasta el que quieres la tabla: ");
 int rango = scanner.nextInt();
 System.out.println("\nTabla de multiplicar de " + numeroParaMultiplicar + ":");
 for (int contador = 1; contador <= rango; contador++) {
     int resultado = numeroParaMultiplicar * contador;
     System.out.println(numeroParaMultiplicar + " x " + contador + " = " + resultado);
 }
}
