import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int combinacionCorrecta = 1234;

        
        int intentosMaximos = 4;
        int intentos = 0;

        boolean Abierto = false;

        while (intentos < intentosMaximos && !Abierto) {
            System.out.print("Combinacion de numero?: ");
            int combinacion = scanner.nextInt();

            if (combinacion == combinacionCorrecta) {
                System.out.println("Caja abierta.");
                Abierto = true;
            } else {
                System.out.println("No es la caja.");
                intentos++;
            }
        }

        if (!Abierto) {
            System.out.println("No puedes abrir la caja.");
        }
    }
}
