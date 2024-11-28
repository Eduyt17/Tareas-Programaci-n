import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);
    char []  palindromo;
System.out.println("Ingresa el numero para analizar:");
String n = input.nextLine();
palindromo = n.toCharArray();

int ultimaPosicion = n.length()-1;
int cont1 = 0;
int cont2 = ultimaPosicion;
while(cont1<=cont2){
    if (palindromo[cont1]==palindromo[cont2]){
        cont1++;
        cont2--;
    }else {
        System.out.println("Tu numero no es palindromo");
    }if(cont1==cont2){
        System.out.println("El numero es palindromo: ");
        }
        break;
    }
}
