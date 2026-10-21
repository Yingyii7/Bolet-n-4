package UD03_F13;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = input.nextInt();

        //Creamos un interruptor, suponiendo que es primo
        boolean esPrimo = true;

        //El 0, el 1 y los negativos no son primos
        if (numero <= 1) {
            esPrimo = false;
        } else {
            // El bucle prueba a dividir el número entre 2 hasta llegar justo antes de él
            for (int i = 2; i < numero; i++) {
                
                // Si la división da un resto exacto, significa que tiene otro divisor
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

        input.close();
    }
}
