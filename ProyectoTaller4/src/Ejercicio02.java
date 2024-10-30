
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        double hijo1, hijo2, hijo3, gastos;
        Scanner guau = new Scanner(System.in);
        System.out.print("Ingrese los gastos del primer hijo: ");
        hijo1 = guau.nextDouble();
        System.out.print("Ingrese los gastos del segundo hijo: ");
        hijo2 = guau.nextDouble();
        System.out.print("Ingrese los gastos del tercer hijo: ");
        hijo3 = guau.nextDouble();
        gastos = hijo1 + hijo2 + hijo3;
        System.out.println("El gasto total de los hijos es: " + gastos);
    }
}
