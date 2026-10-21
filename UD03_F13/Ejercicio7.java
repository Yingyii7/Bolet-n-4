package UD03_F13;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args) {

        double suma = 0;
        int contador = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce numeros positivos: ");

        // Pedimos el primer numero
        double numero = input.nextDouble();

        while (numero >= 0) {
            suma += numero;
            contador++;

            //pedimos el siguiente numero
            numero = input.nextDouble();
        }

        //Comprobamos si se introdujo numero positivo
        if (contador > 0) {
            double media = suma / contador;
            System.out.printf("La media de los numeros positivos es: %.2f%n", media);
        } else {
            System.out.println("No se introdujeron numeros positivos.");
        }

        input.close();
    }
}
