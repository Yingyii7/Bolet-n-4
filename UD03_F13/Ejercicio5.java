package UD03_F13;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String combinacion = "6789";
        int intentos = 4;

        for (int i = 0; i < intentos; i++) {
            System.out.println("Introduce la combinacion: ");
            String clave = input.nextLine();

            if (clave.equals(combinacion)) {
                System.out.print("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinacion");
            }
        }
        input.close();
    }
}
