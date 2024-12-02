import java.util.Scanner;
public class PromedioCalificaciones {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double[] calificaciones = new double[10];
double suma = 0;
for (int i = 0; i < 10; i++) {
calificaciones[i] = sc.nextDouble();
suma += calificaciones[i];
}
double promedio = suma / 10;
int encima = 0, debajo = 0;
for (double calificacion : calificaciones) {
if (calificacion > promedio) encima++;
else if (calificacion < promedio) debajo++;
}
System.out.println(encima);
System.out.println(debajo);
}
}
import java.util.Scanner;
public class MayorMenor {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];
        for (int i = 0; i < 15; i++) {
            numeros[i] = sc.nextInt();
        }
        int mayor = numeros[0], menor = numeros[0], posMayor = 0, posMenor = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        System.out.println(mayor + " " + posMayor);
        System.out.println(menor + " " + posMenor);
    }
}
import java.util.Scanner;
public class FrecuenciaElementos {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }
        boolean[] contado = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!contado[i]) {
                int frecuencia = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arreglo[i] == arreglo[j]) {
                        frecuencia++;
                        contado[j] = true;
                    }
                }
                System.out.println(arreglo[i] + " " + frecuencia);
            }
        }
    }
}
import java.util.Scanner;
public class ReversaArreglo {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            arreglo[i] = sc.nextInt();
        }
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
import java.util.Scanner;
public class ArregloPalindromo {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine().replaceAll(" ", "").toLowerCase();
        char[] caracteres = cadena.toCharArray();
        boolean esPalindromo = true;
        for (int i = 0; i < caracteres.length / 2; i++) {
            if (caracteres[i] != caracteres[caracteres.length - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }
        System.out.println(esPalindromo);
    }
}
import java.util.Scanner;
public class SumaFilasColumnas {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println(sumaFila);
        }
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println(sumaColumna);
        }
    }
}
