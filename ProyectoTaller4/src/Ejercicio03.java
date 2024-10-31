
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        int n, resultado;
        Scanner pikachu = new Scanner(System.in);
        System.out.print("Ingrese un numero entre 2 y 6: ");
        n = pikachu.nextInt();
        if (n >= 2 && n < 6) {
            System.out.println("La tabla de multiplicar del " + n + ":");
            for (int i = 1; i <= 10; i++) {
                resultado = i * n;
                System.out.println(n + "x" + i + "=" + resultado);
            }
        } else {

            System.out.println("El numero no esta entre 2 y 6");

        }

    }
}
