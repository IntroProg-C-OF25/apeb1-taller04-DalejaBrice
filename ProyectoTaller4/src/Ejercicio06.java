
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        double pagoMensual, interesMensual, prestamo;
        int numeroPagos = 12;
        Scanner cobro = new Scanner(System.in);
        System.out.print("Ingrese la cantidad del prestamo: ");
        prestamo = cobro.nextDouble();
        System.out.print("Ingrese el interes mensual (en decimales): ");
        interesMensual = cobro.nextDouble();
        interesMensual = interesMensual / 100;
        pagoMensual = (prestamo * interesMensual) / (1 - Math.pow(1 + interesMensual, -numeroPagos));
        System.out.println("El pago mensual del prestamo es: " + pagoMensual);
    }
}
