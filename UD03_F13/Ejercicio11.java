package UD03_F13;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        int num1 = input.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        int num2 = input.nextInt();
        
        // Los numeros deben de ser distintos
        while (num1 == num2) {
            System.out.println("¡Error! Los números deben ser distintos. Inténtalo de nuevo:");
            System.out.print("Primer número: ");
            num1 = input.nextInt();
            System.out.print("Segundo número: ");
            num2 = input.nextInt();
        }
        
        // Cuál es el menor y cuál es el mayor
        int menor;
        int mayor;

        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }
        
        System.out.println("Resultado de 7 en 7 desde el " + menor + " hasta el " + mayor);
        
        // Bucle que empieza en el menor, llega hasta el mayor y salta de 7 en 7)
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }
        input.close();
    }
}
