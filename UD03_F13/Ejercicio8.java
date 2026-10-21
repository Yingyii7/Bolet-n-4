package UD03_F13;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {

        int positivos = 0;
        int negativos = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");

        for (int i = 0; i < 10; i++) {
            double numero = input.nextDouble();

            if (numero < 0) {
                negativos++;
            } else {
                positivos++;
            }
        }
        System.out.print("Se han introducido " + positivos + " numeros positivos");
        System.out.print(" y " + negativos + " numeros negativos.");

        input.close();
    }
}
