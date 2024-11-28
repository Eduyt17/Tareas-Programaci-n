import java.util.Scanner;
import java.util.Random;

public class Main {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa la cantidad de materias:");
    int cantidadMaterias = sc.nextInt();

    int contador = 0;
    int contMaterias = cantidadMaterias;
    int contadorPromedios = 0;


    while (contador < cantidadMaterias) {
        System.out.println("Ingresa Promedio:");
        int promedio = sc.nextInt();
        int sumaPromedio = promedio + contadorPromedios;
        System.out.println(sumaPromedio);
        contador ++;
        contadorPromedios += promedio;
        double promedioGeneral = sumaPromedio / cantidadMaterias;
        System.out.println("Tu promedio general es: " + promedioGeneral);
        if (promedioGeneral >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}    
