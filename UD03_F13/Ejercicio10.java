package UD03_F13;
import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce 1 numero entero y positivo: ");
        
        int numero = input.nextInt();

        if (numero >= 0) {
            int suma = 0;

            for (int i=0; i < 100; i++) {
                suma += (numero + i);
            }
            System.out.println("La suma de los numeros positivos es: " + suma);
        } else {
            System.out.println("El numero introducido no es positivo.");
        }
        
    }
}
