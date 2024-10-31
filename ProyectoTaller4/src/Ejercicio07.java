
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        double costoKilovaltioxhora, kilovaltiosConsum, valorTotal;
        Scanner planilla = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = planilla.nextInt();
        System.out.print("Ingrese el costo de los kilovaltios: ");
        costoKilovaltioxhora = planilla.nextDouble();
        System.out.print("Ingrese la cantidad de kilovaltios consumidos: ");
        kilovaltiosConsum = planilla.nextDouble();
        valorTotal = costoKilovaltioxhora * kilovaltiosConsum * (1 - 0.1 * (edad >= 65 ? 1 : 0));
        System.out.println("El valor de la planilla a pagar es: " + valorTotal);
    }
}
