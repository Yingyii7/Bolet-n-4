package UD03_F13;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero: ");

        int i = input.nextInt();

        System.out.println("Tabla de multiplicar del numero " + i);

        for (int j = 0; j <= 10; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }

        input.close();
    }
}
