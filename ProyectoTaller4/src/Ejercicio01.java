
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        double base, altura, area;
        Scanner miau = new Scanner(System.in);
        System.out.print("Dame la base: ");
        base = miau.nextDouble();
        System.out.print("Dame la altura: ");
        altura = miau.nextDouble();
        //bloque de proceso
        area = (base * altura) / 2;
        //bloque de salida
        System.out.print("El area del triangulo es =" + area);
    }
}
