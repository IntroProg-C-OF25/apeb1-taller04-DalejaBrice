
import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        //declaracion de datos de entrada
        double costoMinuto, cantidadMinutos, valorPlanilla;
        Scanner gato = new Scanner(System.in);
        System.out.print("Dame el costo por minuto: ");
        costoMinuto = gato.nextDouble();
        System.out.print("Dame la cantidad de minutos: ");
        cantidadMinutos = gato.nextDouble();
        valorPlanilla = costoMinuto * cantidadMinutos;
        System.out.println("El valor de la planilla es = " + valorPlanilla);
    }
}
