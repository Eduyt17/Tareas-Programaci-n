import java.util.Scanner;

public class Main {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int numeroRandom = rand.nextInt(100)+1;
    int intentos = 0;
    boolean adivinar = false;

    System.out.println("Juego de adivinanza!!!");
    System.out.println("En que numero del 1 al 100 estoy pensando?");


    while(!adivinar) {
        System.out.println("Cual numero sera?");
        int numero = input.nextInt();
        intentos++;

        if (intentos == numeroRandom) {
            adivinar = true;
            System.out.println("Felicidades adivinaste el numero!");
            System.out.println("Y solo te llevo" + intentos + " intentos");
            
        } else if (intentos < numeroRandom) {
            System.out.println("El numero random es mayor");
        } else {
            System.out.println("El numero random es menor");
        }
    }
}
