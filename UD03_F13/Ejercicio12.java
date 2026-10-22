package UD03_F13;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");

        int numero = input.nextInt();
        int invertido = 0;
        int resto;

        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
        }
        System.out.print("El numero invertido es: " + invertido);

        input.close();
    }
}