import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroGanador = 4;
        boolean numeroAdivinado = false;

        while (!numeroAdivinado) { // el bucle while hace que el usuario vuelva a introducir un numero si el que introdujo no es el correcto//

            System.out.println("Introduce un numero: ");
            Scanner scanner = new Scanner(System.in);
            int numero = scanner.nextInt();


            if (numero == numeroGanador)
            {

                System.out.println("Haz adivinado el numero ganador");
                numeroAdivinado = true;

            }

            else {
                System.out.println("No adivinaste el numero (Introduce otro numero)");

            }

        }
    }
}